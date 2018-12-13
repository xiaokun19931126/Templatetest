package com.peidou.templatetest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.TextView;;

/**
 * <pre>
 *      作者  ：肖坤
 *      时间  ：2018/11/29
 *      描述  ：
 *      版本  ：1.0
 * </pre>
 */
public class BFragment extends Fragment implements View.OnClickListener {
    public TextView mtv;

    public static BFragment newInstance() {
        Bundle args = new Bundle();
        BFragment fragment = new BFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mtv = view.findViewById(R.id.tv);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
        }
    }
}
