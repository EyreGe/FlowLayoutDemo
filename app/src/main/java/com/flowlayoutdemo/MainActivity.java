package com.flowlayoutdemo;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<String> mDatas;
    private FlowLayout mLayout;
    private FlowLayout flowLayout;
    private FlowLayout2 flowLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepareData();
//        setContentView(createLoadedView());


        //第一种定义
        flowLayout = ((FlowLayout) findViewById(R.id.flowLayout));
        for (int i = 0; i < mDatas.size(); i++) {
            TextView tv = new TextView(this);
            tv.setText(mDatas.get(i)+"");
            tv.setGravity(Gravity.CENTER);
            tv.setPadding(15, 5, 15, 10);
            tv.setTextSize(14);
            tv.setTextColor(getResources().getColor(R.color.red));
            tv.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangle_hollow_shape));
            tv.setMaxEms(8);
            tv.setSingleLine();
            tv.setEllipsize(TextUtils.TruncateAt.END);
            flowLayout.addView(tv);
        }


        //第二种定义
        flowLayout2 = ((FlowLayout2) findViewById(R.id.flowLayout2));
        flowLayout2.setCenterHorizontal(true);
        for (int i = 0; i < mDatas.size(); i++) {
            TextView tv = new TextView(this);
            tv.setText(mDatas.get(i)+"");
            tv.setGravity(Gravity.CENTER);
            tv.setPadding(15, 5, 15, 10);
            tv.setTextSize(14);
            tv.setTextColor(getResources().getColor(R.color.colorPrimary));
            tv.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectangle_hollow_shape));
            tv.setMaxEms(8);
            tv.setSingleLine();
            tv.setEllipsize(TextUtils.TruncateAt.END);

            FlowLayout2.LayoutParams lp = new FlowLayout2.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            //控件间的距离
            lp.leftMargin = 10;
            lp.rightMargin = 10;
            lp.topMargin = 10;
            lp.bottomMargin = 10;
            tv.setLayoutParams(lp);

            flowLayout2.addView(tv);
        }
    }

    /**
     * 模拟网络数据
     */
    public void prepareData(){
        mDatas=new ArrayList<String>();
        mDatas.add("数据");
        mDatas.add("Ubuntu.Linux从入门到精通 (1).pdf");
        mDatas.add("电脑");
        mDatas.add("硬盘");
        mDatas.add("草莓");
        mDatas.add("铁观音");
        mDatas.add("Android开发宝典");
        mDatas.add("搜狗输入法");
        mDatas.add("饮水机");
        mDatas.add("科比");
        mDatas.add("23VS24");
        mDatas.add("詹姆斯");
        mDatas.add("我的世界");
        mDatas.add("灰太狼");
        mDatas.add("伊利优酸乳");
        mDatas.add("放开那个女孩");
        mDatas.add("编程之美");
        mDatas.add("酷狗音乐");
        mDatas.add("网易云音乐");
        mDatas.add("百度云");
        mDatas.add("Eclipse");
        mDatas.add("UC浏览器");
        mDatas.add("QQ输入法");
        mDatas.add("鲁大师");
        mDatas.add("我的电脑");
        mDatas.add("阿里旺旺");
        mDatas.add("ICBC工行助手");
        mDatas.add("开启免费WIFI");
        mDatas.add("Github");
        mDatas.add("回收站");
        mDatas.add("支付宝钱包");
        mDatas.add("360安全卫士");
        mDatas.add("本地磁盘");
        mDatas.add("迅雷");
        mDatas.add("中文输入法");
        mDatas.add("小米运动手环");
        mDatas.add("小米5");
        mDatas.add("电饭煲");
        mDatas.add("鲁花花生油");
        mDatas.add("南极人");
        mDatas.add("电子");
        mDatas.add("View自定义");
        mDatas.add("...................");
        mDatas.add("八达岭长城");
        mDatas.add("Ip.Man.3.2015.BD720P.X264.AAC.Cantonese&amp;Mandarin.CHS.Mp4Ba.torrent");
    }

    public View createLoadedView() {
//        // 防止在小屏手机上显示不全，需要通过scrollView包裹主界面
//        ScrollView mScrollView = new ScrollView(this);
//        mScrollView.setFillViewport(true);// 设置可以填充父窗体
        // 初始化布局，该布局可以自动分配子View位置，保持每一行都能对齐
//        mLayout = new FlowLayout(this);
        //是否填充
//        mLayout.setFillLine(true);
//        mLayout.setBackgroundResource(R.drawable.grid_item_bg_normal);
        // 子view 之间的间距
//        int layoutPadding = dip2px(10);
//        mLayout.setPadding(layoutPadding, layoutPadding, layoutPadding,
//                layoutPadding);
//        mLayout.setHorizontalSpacing(layoutPadding);
//        mLayout.setVerticalSpacing(layoutPadding);

//        mLayout.setCenterHorizontal(true);

        int textPaddingV = dip2px(4);
        int textPaddingH = dip2px(7);
        int backColor = 0xffcecece;
        // 设置弧度
        int radius = dip2px(5);
        // 代码动态创建一个图片
//        GradientDrawable pressDrawable = createDrawable(
//                backColor, backColor, radius);
//        Random mRdm = new Random();

//        ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        lp.leftMargin = 15;
//        lp.rightMargin = 15;
//        lp.topMargin = 10;
//        lp.bottomMargin = 10;

        for (int i = 0; i < mDatas.size(); i++) {
            TextView tv = new TextView(this);
            // 随机颜色的范围0x202020~0xefefef
//            int red = 32 + mRdm.nextInt(208);
//            int green = 32 + mRdm.nextInt(208);
//            int blue = 32 + mRdm.nextInt(208);
//            int color = 0xff000000 | (red << 16) | (green << 8) | blue;
            // 创建背景图片选择器
            GradientDrawable normalDrawable = createDrawable(
                    0xffeed0ec, backColor, radius);
//            StateListDrawable selector = createSelector(
//                    normalDrawable, pressDrawable);
//            tv.setBackgroundDrawable(selector);
            tv.setBackgroundDrawable(normalDrawable);

            final String text = mDatas.get(i);
            tv.setText(text);
            tv.setTextColor(Color.rgb(255, 255, 255));
            tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);
            tv.setGravity(Gravity.CENTER);
            tv.setPadding(textPaddingH, textPaddingV, textPaddingH,
                    textPaddingV);
//            tv.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
//                }
//            });
            mLayout.addView(tv);
        }

//        mScrollView.addView(mLayout);
//        return mScrollView;
        return mLayout;
    }

    /** dip转换px */
    public  int dip2px(int dip) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dip * scale + 0.5f);
    }
    /**
     * 创建一个图片
     * @param contentColor 内部填充颜色
     * @param strokeColor  描边颜色
     * @param radius       圆角
     */
    public  GradientDrawable createDrawable(int contentColor, int strokeColor, int radius) {
        GradientDrawable drawable = new GradientDrawable(); // 生成Shape
        drawable.setGradientType(GradientDrawable.RECTANGLE); // 设置矩形
        drawable.setColor(contentColor);// 内容区域的颜色
        drawable.setStroke(1, strokeColor); // 四周描边,描边后四角真正为圆角，不会出现黑色阴影。如果父窗体是可以滑动的，需要把父View设置setScrollCache(false)
        drawable.setCornerRadius(radius); // 设置四角都为圆角
        return drawable;
    }

    /**
     * 创建一个图片选择器
     * @param normalState  普通状态的图片
     * @param pressedState 按压状态的图片
     */
    public StateListDrawable createSelector(Drawable normalState, Drawable pressedState) {
        StateListDrawable bg = new StateListDrawable();
        bg.addState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, pressedState);
        bg.addState(new int[]{android.R.attr.state_enabled}, normalState);
        bg.addState(new int[]{}, normalState);
        return bg;
    }
}
