package com.example.gxs.findyou.com.example.gxs.findyou.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

import com.example.gxs.findyou.R;

/**
 * Created by Administrator on 2017/4/15.
 */

public class MyButton extends Button{
private Drawable drawable;
    private  float drawablewidth;
    private  float drawableheight;
    private float buttonheight;

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a =context.obtainStyledAttributes(attrs, R.styleable.my);
        //获取图片
        drawable = a.getDrawable(R.styleable.my_drawable);
        //获取图片的宽和高
        drawablewidth = drawable.getIntrinsicWidth();
        drawableheight = drawable.getIntrinsicHeight();
    }
    //当给我们控制设置大小的时候会自动运行
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //获取xml里面给按钮设置的高度
        buttonheight = MeasureSpec.getSize(heightMeasureSpec);
    }
    //绘制图形的所运行的方法  当系统绘图的时候，它会自动运行
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置drawable的边界
        drawable.setBounds(10, 10, (int)((buttonheight-20)/drawableheight*drawablewidth+10), (int)(buttonheight-10));
        //将drawable绘制到canvas上
        drawable.draw(canvas);
    }
}
