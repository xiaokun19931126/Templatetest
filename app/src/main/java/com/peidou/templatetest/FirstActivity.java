package com.peidou.templatetest;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * <pre>
 *      作者  ：肖坤
 *      时间  ：2018/12/05
 *      描述  ：模板代码
 *      版本  ：1.0
 * </pre>
 */
public class FirstActivity extends AppCompatActivity {

    private FirstActivityViewModel mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViewModel();
    }

    private void initViewModel() {
        mViewModel = ViewModelProviders.of(this).get(FirstActivityViewModel.class);

    }
}
