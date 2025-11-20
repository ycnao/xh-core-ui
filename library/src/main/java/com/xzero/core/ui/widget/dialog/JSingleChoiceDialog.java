package com.xzero.core.ui.widget.dialog;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.xzero.core.libs.adapter.NArrayAdapter;
import com.xzero.core.ui.R;
import com.xzero.core.ui.widget.dialog.callback.MuDialogBaseActionCallback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 列表单选对话框
 * author: Created by 闹闹 on 2018/6/26
 * version: 1.0.0
 */
public class JSingleChoiceDialog extends DialogFragment {

    public interface DialogCallback extends MuDialogBaseActionCallback {

        /**
         * 列表选定回调
         *
         * @param selectedData 选定的列表项数据
         * @param position     选定的列表位置
         */
        void listItemClick(String selectedData, int position);
    }

    private static JSingleChoiceDialog dialog;

    private static DialogCallback callback;

    private static ArrayList<String> mListData;

    private ListView listView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_jh_single_choice, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = view.findViewById(R.id.listView);
    }

    @Override
    public void onActivityCreated(Bundle arg0) {
        super.onActivityCreated(arg0);
        listView.setOnItemClickListener((arg01, view, position, arg3) -> {
            callback.listItemClick(mListData.get(position), position);
            dialog.dismiss();
        });

        MyAdapter adapter = new MyAdapter(getActivity(), mListData);
        listView.setAdapter(adapter);
    }

    /**
     * 创建并显示对话框
     *
     * @param act           上下文
     * @param listDataResId 数据源
     * @param mCallback     返回值
     */
    public static JSingleChoiceDialog show(FragmentActivity act, int listDataResId, List<String> listData, DialogCallback mCallback) {
        if (listDataResId != 0) {
            mListData = new ArrayList<String>();
            String[] strs = act.getResources().getStringArray(listDataResId);
            mListData.addAll(Arrays.asList(strs));
        } else {
            mListData = (ArrayList) listData;
        }

        FragmentTransaction ft = act.getSupportFragmentManager().beginTransaction();
        Fragment prev = act.getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        // Create the dialog.
        dialog = new JSingleChoiceDialog();
        dialog.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.MyDialog_Them);

        dialog.show(ft, "dialog");

        callback = mCallback;

        return dialog;
    }

    public class MyAdapter extends NArrayAdapter {

        /**
         * 构造函数
         *
         * @param context 上下文
         * @param data    数据
         */
        MyAdapter(Context context, ArrayList<String> data) {
            super(context, data);
        }

        /*
         * (non-Javadoc)
         *
         * @see
         * com.linan.logistics.widget.mudialog.adapter.AbstractMuDialogAdapter
         * #getListItemView(int, android.view.View, android.view.ViewGroup)
         */
        @Override
        public View getListItemView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder;
            if (convertView == null) {
                convertView = LayoutInflater.from(mContext).inflate(R.layout.item_dialog_choice, null, false);
                viewHolder = new ViewHolder();

                // 初始化空间
                viewHolder.itemDataTv = convertView.findViewById(R.id.itemDataTv);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }

            // 设置数据
            if (mData != null && !mData.isEmpty()) {
                viewHolder.itemDataTv.setText(mData.get(position).toString());
            }
            return convertView;
        }

        class ViewHolder {
            TextView itemDataTv;
        }
    }
}

