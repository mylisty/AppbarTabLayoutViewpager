package com.liandongfenqi.tongniu.appbartablayoutviewpager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ytx on 2016/10/8.
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>{
    private String[]mTag;
    private Context context;
    public MyRecyclerViewAdapter(Context context, String[]mTag) {
        this.mTag = mTag;
        this.context = context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_gv_active, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText(mTag[position]);
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mTag.length;
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;
        public MyViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv_active);
        }

    }

}
