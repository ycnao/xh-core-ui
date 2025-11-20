package com.xcore.ui.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import com.xcore.ui.R;
import com.xcore.ui.widget.dialog.callback.JDialogCallback;


/**
 *
 */
public class JShowTipsDialog extends Dialog {

    private Activity mContext;
    private JDialogCallback callback;
    private String tips;


    public JShowTipsDialog(Activity context, String tips, JDialogCallback callback) {
        super(context, R.style.FullScreenDialog);
        mContext = context;
        this.tips = tips;
        this.callback = callback;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        setContentView(R.layout.dialog_jh_tips);
        //按空白处不能取消动画
        getWindow().getDecorView().setSystemUiVisibility(View.INVISIBLE);
        setCanceledOnTouchOutside(false);
//        setBackgroundTransparent();
        //初始化界面控件
        TextView cancel = findViewById(R.id.btn_cancel);
        TextView confirm = findViewById(R.id.btn_confirm);
        //初始化界面数据
        //初始化界面控件的事件
        cancel.setOnClickListener(v -> {
            dismiss();
            callback.cancel(v);
        });
        confirm.setOnClickListener(v -> {
            dismiss();
            callback.confirm(v);
        });
    }


    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            //do something.
            return true;
        } else {
            return super.dispatchKeyEvent(event);
        }
    }
}
