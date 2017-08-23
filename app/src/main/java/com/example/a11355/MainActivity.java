package com.example.a11355;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.a11355.adapter.MianRVAdapter;
import com.example.a11355.base.AbsRecyclerViewAdapter;
import com.example.a11355.base.BaseActivity;
import com.example.a11355.mycustom.R;
import com.example.a11355.view.CustomDialogActivity;
import com.example.a11355.view.PopupWindowActivity;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements AbsRecyclerViewAdapter.OnItemClickListener {


    @BindView(R.id.rv)
    RecyclerView rv;

    @Override
    protected int getViewResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        super.init();
        List<String> datas = Arrays.asList(Constant.Strings.mainRVTexts);

        MianRVAdapter mianRVAdapter = new MianRVAdapter(this, datas);
        mianRVAdapter.setOnItemClickListener(this);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(mianRVAdapter);
        mianRVAdapter.setData(datas);
    }

    @Override
    public void onItemClick(View v, int position) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, PopupWindowActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, CustomDialogActivity.class));

                break;


        }


    }
}
