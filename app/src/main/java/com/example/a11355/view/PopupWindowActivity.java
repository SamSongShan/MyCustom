package com.example.a11355.view;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.a11355.base.BaseActivity;
import com.example.a11355.mycustom.R;
import com.example.a11355.utils.DisplayUtil;

import butterknife.BindView;
import butterknife.OnClick;
import custom.CustomPopupWindow;

public class PopupWindowActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.bt)
    Button bt;

    @Override
    protected int getViewResId() {
        return R.layout.activity_popup_window;
    }

    @Override
    protected void init() {
        super.init();


    }


    @OnClick(R.id.bt)
    public void onViewClicked() {
        CustomPopupWindow popupWindow = new CustomPopupWindow.Builder()
                .setContext(this)
                .setContentView(R.layout.custom_popupwindow)//布局
                .setheight(LinearLayout.LayoutParams.WRAP_CONTENT)//高
                .setwidth(DisplayUtil.getScreenWidth(this) - 100)//宽
                .setFouse(true)//设置popupwindow 是否可以获取焦点
                .setOutSideCancel(true)
                .setAnimationStyle(R.style.CustomPopupWindow_Anim_Style)
                .builder();//设置动画
        popupWindow.showAtLocation(R.layout.custom_popupwindow, Gravity.CENTER, 0, 0);
        popupWindow.getItemView(R.id.btn_versionCancel).setOnClickListener(this);
        popupWindow.getItemView(R.id.btn_versionUpdate).setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_versionCancel:
                Toast.makeText(this, "取消", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_versionUpdate:
                Toast.makeText(this, "确定", Toast.LENGTH_LONG).show();

                break;
        }
    }
}

