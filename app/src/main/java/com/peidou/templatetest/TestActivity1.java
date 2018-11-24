package com.peidou.templatetest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.peidou.lib.AppUtils;

/**
 * <pre>
 *      作者  ：肖坤
 *      时间  ：2018/11/22
 *      描述  ：
 *      版本  ：1.0
 * </pre>
 */
public class TestActivity1 extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, TestActivity1.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        Toast.makeText(this, AppUtils.getCurrentActivity().toString(), Toast.LENGTH_SHORT).show();
    }
}
