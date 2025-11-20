package com.xzero.core.ui.widget.dialog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.xzero.core.ui.R;
import com.xzero.core.ui.widget.dialog.callback.JDialogCallback;

/**
 * 含有确定，取消按钮对话框（有标题）
 * author: Created by 闹闹 on 2018/6/26
 * version: 1.0.0
 */
public class JuOptionalDialog extends DialogFragment implements OnClickListener {


    private static JuOptionalDialog dialog;
    private static JDialogCallback callback;

    private Button okBtn;
    private Button cancelBtn;

    private TextView titleTv;
    private TextView contentTv;

    private static String titleStr;
    private static String contentStr;
    private static String okBtnStr;
    private static String cancelBtnStr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_ju_optional, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        titleTv = view.findViewById(R.id.titleTv);
        contentTv = view.findViewById(R.id.contentTv);
        okBtn = view.findViewById(R.id.okBtn);
        cancelBtn = view.findViewById(R.id.cancelBtn);
    }

    @Override
    public void onActivityCreated(Bundle arg0) {
        super.onActivityCreated(arg0);

        okBtn.setOnClickListener(this);
        cancelBtn.setOnClickListener(this);

        if (!TextUtils.isEmpty(titleStr)) {
            titleTv.setText(titleStr);
        }
        if (!TextUtils.isEmpty(contentStr)) {
            contentTv.setText(contentStr);
        }
        if (!TextUtils.isEmpty(okBtnStr)) {
            okBtn.setText(okBtnStr);
        }
        if (!TextUtils.isEmpty(cancelBtnStr)) {
            cancelBtn.setText(cancelBtnStr);
        }
    }


    /**
     * 创建并显示对话框
     *
     * @param act           上下文
     * @param mTitleStr     标题
     * @param mContentStr   内容
     * @param mokBtnStr     确定按钮
     * @param mCancelBtnStr 取消按钮
     * @param mCallback     回调
     */
    public static JuOptionalDialog show(FragmentActivity act, String mTitleStr, String mContentStr, String mokBtnStr, String mCancelBtnStr, JDialogCallback mCallback) {
        titleStr = mTitleStr;
        contentStr = mContentStr;
        okBtnStr = mokBtnStr;
        cancelBtnStr = mCancelBtnStr;

        FragmentTransaction ft = act.getSupportFragmentManager().beginTransaction();
        Fragment prev = act.getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);
        // Create the dialog.
        dialog = new JuOptionalDialog();
        dialog.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.MyDialog_Them);

        dialog.show(ft, "dialog");
        callback = mCallback;
        return dialog;

    }

    @Override
    public void onClick(View v) {
        if (v == okBtn) {
            callback.confirm(okBtn);
            dialog.dismiss();
        } else if (v == cancelBtn) {
            callback.cancel(v);
            dialog.dismiss();
        }
    }
}
