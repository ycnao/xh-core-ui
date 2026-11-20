package com.xcore.ui.widget.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xcore.ui.R;


/**
 * 验证码输入框组件化
 *
 * @author lichong
 * 2022年12月07日09:58:52
 */
public class VerificationCodeView extends RelativeLayout {

    private static int MAX = 6;
    private EditText editText;
    private TextView[] textViews;
    private String inputContent;

    public VerificationCodeView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VerificationCodeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View.inflate(context, R.layout.verification_code_view, this);
        textViews = new TextView[MAX];
        editText = findViewById(R.id.editCode);
        editText.setCursorVisible(false);//隐藏光标  setEditTextListener();

        textViews[0] = findViewById(R.id.txtCode1);
        textViews[1] = findViewById(R.id.txtCode2);
        textViews[2] = findViewById(R.id.txtCode3);
        textViews[3] = findViewById(R.id.txtCode4);
        textViews[4] = findViewById(R.id.txtCode5);
        textViews[5] = findViewById(R.id.txtCode6);

        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                inputContent = editText.getText().toString();
                for (int i = 0; i < 6; i++) {
                    if (i < inputContent.length()) {
                        textViews[i].setText(String.valueOf(inputContent.charAt(i)));
                    } else {
                        textViews[i].setText("");
                    }
                }
            }
        });
    }

    public String getText() {
        return inputContent;
    }
}


