package com.peidou.templatetest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * <pre>
 *      作者  ：肖坤
 *      时间  ：2018/11/22
 *      描述  ：
 *      版本  ：1.0
 * </pre>
 */
public class TestActivity4 extends AppCompatActivity implements View.OnClickListener {
    public TextView mIdTvName;
    public ImageView mIdIvIcon;
    public ConstraintLayout mClRoot;
    public TextView mIdIvInfo;

    public static void start(Context context) {
        Intent starter = new Intent(context, TestActivity4.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_pic);
        initView();
    }

    private void initView() {
        mIdTvName = findViewById(R.id.id_tv_name);
        mIdIvIcon = findViewById(R.id.id_iv_icon);
        mClRoot = findViewById(R.id.cl_root);
        mIdIvInfo = findViewById(R.id.id_iv_info);
    }

    @Override
    public void onClick(View v) {

    }
}
