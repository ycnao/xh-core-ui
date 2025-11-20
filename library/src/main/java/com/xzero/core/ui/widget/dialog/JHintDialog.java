package com.xzero.core.ui.widget.dialog;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.xzero.core.ui.R;


/**
 * 自定义弹窗
 * author: created by 闹闹 on 2022/4/2
 * version: v1.0.0
 */
public class JHintDialog extends DialogFragment implements View.OnClickListener {

    public interface DialogCallback {

        void confirm(View view);

    }

    private static JHintDialog dialog;

    private TextView okBtn;
    private TextView contentTv;
    private static DialogCallback callback;
    private static String contentStr;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_jh_hint, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        contentTv = view.findViewById(R.id.tv_content);
        okBtn = view.findViewById(R.id.btn_confirm);
    }

    @Override
    public void onActivityCreated(Bundle arg0) {
        super.onActivityCreated(arg0);

        okBtn.setOnClickListener(this);

        if (!TextUtils.isEmpty(contentStr)) {
            contentTv.setText(contentStr);
        }
    }


    /**
     * 创建并显示对话框
     *
     * @param act         上下文
     * @param mContentStr 内容
     * @param mCallback   回调
     */
    public static JHintDialog show(FragmentActivity act, String mContentStr, DialogCallback mCallback) {
        contentStr = mContentStr;

        FragmentTransaction ft = act.getSupportFragmentManager().beginTransaction();
        Fragment prev = act.getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);
        // Create the dialog.
        dialog = new JHintDialog();
        dialog.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.JDialog_Them);

        dialog.show(ft, "dialog");
        callback = mCallback;
        return dialog;
    }

    @Override
    public void onClick(View v) {
        if (v == okBtn) {
            callback.confirm(okBtn);
            dismiss();
        }
    }
}

