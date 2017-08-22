package com.example.a11355.adapter;

import android.content.Context;

import com.example.a11355.base.AbsRecyclerViewAdapter;
import com.example.a11355.mycustom.R;

import java.util.List;

/**
 * Created by Administrator on 2017/8/21 0021.
 */

public class MianRVAdapter extends AbsRecyclerViewAdapter<String> {

    public MianRVAdapter(Context context, List<String> names) {
        super(context, R.layout.item_rv_main);
    }

    @Override
    public void onBindHolder(AbsRecyclerViewAdapter.RecyclerViewHolder holder, String d, int position) {
        holder.bindTextView(R.id.tv_name, d);
    }
}
