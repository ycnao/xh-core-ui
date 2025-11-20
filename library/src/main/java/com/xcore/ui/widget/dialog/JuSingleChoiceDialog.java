package com.xcore.ui.widget.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.xcore.libs.adapter.NArrayAdapter;
import com.xcore.ui.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 单选对话框(有标题)
 * <p>
 * author: Created by 闹闹 on 2018/6/26
 * version: 1.0.0
 */
public class JuSingleChoiceDialog extends DialogFragment implements OnClickListener {

    public interface DialogCallback {

        /**
         * 列表选定回调
         *
         * @param selectedData 选定的列表项数据
         * @param dataCode     列表数据对应的code值，没有则null
         * @param position     选定的列表位置
         */
        void listItemClick(String selectedData, String dataCode, int position);
    }

    private static JuSingleChoiceDialog dialog;

    private static DialogCallback callback;

    private static String mTitleStr;
    private static ArrayList<String> mListData;
    private static ArrayList<String> mListDataCodes;

    private ListView listView;

    private TextView titleTv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_ju_single_choice, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        titleTv = view.findViewById(R.id.titleTv);
        listView = view.findViewById(R.id.listView);
    }

    @Override
    public void onActivityCreated(Bundle arg0) {
        super.onActivityCreated(arg0);
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View view,
                                    int position, long arg3) {
                callback.listItemClick(mListData.get(position), mListDataCodes != null ? mListDataCodes.get(position) : null, position);
                dialog.dismiss();
            }
        });

        if (!TextUtils.isEmpty(mTitleStr)) {
            titleTv.setText(mTitleStr);
        }

        MyAdapter adapter = new MyAdapter(getActivity(), mListData);
        listView.setAdapter(adapter);
    }

    /**
     * 创建并显示对话框。
     *
     * @param act
     * @param titleStr
     * @param listDataResId 数据源。
     * @param listData      数据源，注意：两个数据源有且只有一个有效。
     * @param mCallback
     * @param listDataCode  数据源数据对应的code值。
     */
    public static JuSingleChoiceDialog show(FragmentActivity act, String titleStr, int listDataResId, List<String> listData, List<String> listDataCode, DialogCallback mCallback) {
        mTitleStr = titleStr;
        if (listDataResId != 0) {
            mListData = new ArrayList<>();
            String[] strs = act.getResources().getStringArray(listDataResId);
            for (int i = 0; i < strs.length; i++) {
                mListData.add(strs[i]);
            }
        } else {
            mListData = (ArrayList) listData;
        }
        mListDataCodes = (ArrayList) listDataCode;

        FragmentTransaction ft = act.getSupportFragmentManager().beginTransaction();
        Fragment prev = act.getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        // Create the dialog.
        dialog = new JuSingleChoiceDialog();
        dialog.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.MyDialog_Them);
        dialog.show(ft, "dialog_list_single_select");
        callback = mCallback;
        return dialog;
    }

    /**
     * 列表适配器。
     */
    public class MyAdapter extends NArrayAdapter {

        /**
         * 构造函数
         *
         * @param context
         * @param data
         */
        public MyAdapter(Context context, ArrayList<String> data) {
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

    /*
     * (non-Javadoc)
     *
     * @see android.view.View.OnClickListener#onClick(android.view.View)
     */
    @Override
    public void onClick(View v) {

    }
}
