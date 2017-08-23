package custom;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.example.a11355.mycustom.R;

/**
 * Created by Administrator on 2017/8/22 0022.
 */

public class CustomDialog extends DialogFragment {


    private static Builder builder;
    private static View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //取消标题显示

        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        Window window = getDialog().getWindow();
        view = inflater.inflate(builder.contentviewid,
                ((ViewGroup) window.findViewById(android.R.id.content)), false);
        //必须设置，否则不能全屏
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //宽度撑满
        window.setLayout(builder.width, builder.height);
        window.setGravity(Gravity.BOTTOM);
        //进入退出动画
        window.setWindowAnimations(builder.animstyle == -1 ? R.style.animTranslateBottom : builder.animstyle);
        //getItemView(R.id.btn_versionCancel);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view=view;
    }

    /**
     * 根据id获取view
     *
     * @param viewid
     * @return
     */
    public View getItemView(int viewid) {

        return view.findViewById(viewid);


    }


    public void show(FragmentManager manager) {
        this.show(manager, "dialog");
    }

    public static class Builder {
        private int contentviewid;
        private int width;
        private int height;
        private int animstyle = -1;


        public Builder setContentView(int contentviewid) {
            this.contentviewid = contentviewid;
            return this;
        }

        public Builder setwidth(int width) {
            this.width = width;
            return this;
        }

        public Builder setheight(int height) {
            this.height = height;
            return this;
        }

        public Builder setAnimationStyle(int animstyle) {
            this.animstyle = animstyle;
            return this;
        }


        public CustomDialog builder() {
            builder = this;
            return new CustomDialog();
        }
    }
}
