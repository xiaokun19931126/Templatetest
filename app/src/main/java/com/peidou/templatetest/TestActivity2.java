package com.peidou.templatetest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
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
public class TestActivity2 extends AppCompatActivity {
    public TextView mIdTvName;
    public ImageView mIdIvIcon;
    public ConstraintLayout mClRoot;
    public TextView mIdIvInfo;

    public static void start(Context context) {
        Intent starter = new Intent(context, TestActivity2.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_pic);
        initView();
    }

    private void initView() {
    }
}
