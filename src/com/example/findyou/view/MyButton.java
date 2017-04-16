package com.example.findyou.view;

import com.example.findyou.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

public class MyButton extends Button{

	private Drawable drawable;
	private float drawablewidth;
	private float drawableheight;
	
	private float buttonheight;
	public MyButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.my);
		//��ȡXML�������õ�ͼƬ
		drawable = a.getDrawable(R.styleable.my_drawable);
		//��ȡͼƬ�Ŀ�͸�
		drawablewidth = drawable.getIntrinsicWidth();
		drawableheight = drawable.getIntrinsicHeight();
	}
	
	//�������ǿ������ô�С��ʱ����Զ�����
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		//��ȡxml�������ť���õĸ߶�
		buttonheight = MeasureSpec.getSize(heightMeasureSpec);
	}
	
	//����ͼ�ε������еķ���  ��ϵͳ��ͼ��ʱ�������Զ�����
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		//����drawable�ı߽�
		drawable.setBounds(10, 10, (int)((buttonheight-20)/drawableheight*drawablewidth+10), (int)(buttonheight-10));
		//��drawable���Ƶ�canvas��
		drawable.draw(canvas);
	}
	

}
