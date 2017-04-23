package com.example.gxs.findyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/4/23.
 */

public class Myfirst extends Activity {
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstylayout);
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Myfirst.this,"点击了按钮",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Myfirst.this,Mysecond.class);
                startActivity(intent);
            }
        });
    }

}
