package com.peidou.templatetest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;
import java.util.ArrayList;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * <pre>
 *      作者  ：肖坤
 *      时间  ：2018/11/24
 *      描述  ：
 *      版本  ：1.0
 * </pre>
 */
public class TestAdapter6 extends RecyclerView.Adapter<TestAdapter6.MyViewHolder> implements View.OnClickListener {
    private Context mContext;
    private LayoutInflater mInflater;
    private List<String> mDatas;

    public TestAdapter6(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }

    public void setDatas(List<String> datas) {
        if (mDatas == null) {
            mDatas = new ArrayList();
        }
        mDatas.clear();
        mDatas.addAll(datas);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_list_pic, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mIdTvName.setText("");
        holder.mIdIvIcon.setImageBitmap(null);
        holder.mIdIvInfo.setText("");
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    @Override
    public void onClick(View v) {

    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mIdTvName;
        public ImageView mIdIvIcon;
        public ConstraintLayout mClRoot;
        public TextView mIdIvInfo;

        public MyViewHolder(View itemView) {
            super(itemView);
            mIdTvName = itemView.findViewById(R.id.id_tv_name);
            mIdIvIcon = itemView.findViewById(R.id.id_iv_icon);
            mClRoot = itemView.findViewById(R.id.cl_root);
            mIdIvInfo = itemView.findViewById(R.id.id_iv_info);
        }
    }
}