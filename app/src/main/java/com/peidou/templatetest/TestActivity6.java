package com.peidou.templatetest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * <pre>
 *      作者  ：肖坤
 *      时间  ：2018/11/24
 *      描述  ：
 *      版本  ：1.0
 * </pre>
 */
public class TestActivity6 extends AppCompatActivity implements View.OnClickListener {
    public Button mbutton;
    public Button mbutton2;
    public TextView mTvTestClick;

    public static void start(Context context) {
        Intent starter = new Intent(context, TestActivity6.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        initView();
    }

    private void initView() {
        mbutton = findViewById(R.id.button);
        mbutton2 = findViewById(R.id.button2);
        mTvTestClick = findViewById(R.id.tv_test_click);
        mbutton.setOnClickListener(this);
        mbutton2.setOnClickListener(this);
        mTvTestClick.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:

                break;
            case R.id.button2:

                break;
            case R.id.tv_test_click:

                break;
            default:
                break;
        }
    }
}
