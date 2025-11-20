package com.xcore.ui.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.xcore.ui.R;


/**
 * 自定义弹窗
 * author: created by 闹闹 on 2022/4/2
 * version: v1.0.0
 */
public class JShowHintDialog extends Dialog {

    private Activity mContext;
    private TextView okBtn;
    private TextView contentTv;
    private String contentStr;
    private DialogCallback callback;

    public interface DialogCallback {

        void confirm(View view);

    }

    public JShowHintDialog(Activity context, String tips, DialogCallback dialogcallback) {
        super(context, R.style.FullScreenDialog);
        mContext = context;
        this.contentStr = tips;
        this.callback = dialogcallback;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        setContentView(R.layout.dialog_jh_hint);
        //按空白处不能取消动画
        getWindow().getDecorView().setSystemUiVisibility(View.INVISIBLE);
        setCanceledOnTouchOutside(false);
//        setBackgroundTransparent();
        //初始化界面控件
        TextView content = findViewById(R.id.tv_content);
        TextView confirm = findViewById(R.id.btn_confirm);
        //初始化界面数据
        //初始化界面控件的事件
        content.setText(contentStr);
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

