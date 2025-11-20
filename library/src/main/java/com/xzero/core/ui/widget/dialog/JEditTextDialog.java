package com.xzero.core.ui.widget.dialog;


import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.xzero.core.ui.R;
import com.xzero.core.ui.widget.dialog.callback.JEditDialogCallback;


/**
 * 自定义弹窗
 * author: created by 闹闹 on 2022/4/2
 * version: v1.0.0
 */
public class JEditTextDialog extends DialogFragment implements View.OnClickListener {

    private Context mContext;
    private Button okBtn;
    private Button cancelBtn;

    private TextView contentTv;
    private EditText editContent;

    private static JEditTextDialog dialog;
    private static JEditDialogCallback callback;

    private static String titleStr;
    private static String contentStr;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_edit_text, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        contentTv = view.findViewById(R.id.contentTv);
        editContent = view.findViewById(R.id.edit_content);
        okBtn = view.findViewById(R.id.okBtn);
        cancelBtn = view.findViewById(R.id.cancelBtn);
    }

    @Override
    public void onActivityCreated(Bundle arg0) {
        super.onActivityCreated(arg0);

        okBtn.setOnClickListener(this);
        cancelBtn.setOnClickListener(this);

        if (!TextUtils.isEmpty(titleStr)) {
            contentTv.setText(titleStr);
        }
        if (!TextUtils.isEmpty(contentStr)) {
            editContent.setText(contentStr);
        }
    }


    /**
     * 创建并显示对话框
     *
     * @param act         上下文
     * @param mContentStr 内容
     * @param mCallback   回调
     */
    public static JEditTextDialog show(FragmentActivity act, String mTitleStr, String mContentStr, JEditDialogCallback mCallback) {
        titleStr = mTitleStr;
        contentStr = mContentStr;

        FragmentTransaction ft = act.getSupportFragmentManager().beginTransaction();
        Fragment prev = act.getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);
        // Create the dialog.
        dialog = new JEditTextDialog();
        dialog.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.JDialog_Them);

        dialog.show(ft, "dialog");
        callback = mCallback;
        return dialog;
    }

    public static JEditTextDialog show(FragmentActivity act, String mTitleStr,JEditDialogCallback mCallback) {
        titleStr = mTitleStr;

        FragmentTransaction ft = act.getSupportFragmentManager().beginTransaction();
        Fragment prev = act.getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);
        // Create the dialog.
        dialog = new JEditTextDialog();
        dialog.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.JDialog_Them);

        dialog.show(ft, "dialog");
        callback = mCallback;
        return dialog;
    }

    @Override
    public void onClick(View v) {
        if (v == okBtn) {
            String trim = editContent.getText().toString().trim();
            if (trim.isEmpty()) {
                Toast.makeText(mContext, "不能为空", Toast.LENGTH_SHORT).show();
            } else {
                callback.confirm(okBtn, trim);
                dismiss();
            }
        } else if (v == cancelBtn) {
            callback.cancel(v);
            dismiss();
        }
    }

}

