package com.example.gxs.findyou;

import android.app.Activity;
import android.os.ParcelFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;

import com.example.gxs.findyou.com.example.gxs.findyou.view.MyButton;
import com.example.gxs.findyou.com.example.gxs.findyou.view.MyConstants;

public class MainActivity extends Activity implements View.OnClickListener {
                 private MyButton incomingbuttn;
                 private MyButton myswitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myswitch = (MyButton)findViewById(R.id.myswitch);
        incomingbuttn =(MyButton)findViewById(R.id.incoming);
    }

    @Override
    protected void onResume() {
        super.onResume();

        incomingbuttn.setOnClickListener(this);
        myswitch.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.incoming:
                if(MyConstants.myincoming)//已经选择->未选择
                {
                    MyConstants.myincoming = false;
                    incomingbuttn.setText("来电监控");

                }
                else{

            MyConstants.myincoming = true ;
            incomingbuttn.setText("来电监控  已选择");


        }
                break;
            case R.id.myswitch:
                if(MyConstants.myswitch)//已经选择->未选择
                {
                    MyConstants.myswitch = false;
                    myswitch.setText("一键监控");

                }
                else{

                    MyConstants.myswitch = true ;
                    myswitch.setText("关闭监控");

                }



                break;

        }

    }
}
