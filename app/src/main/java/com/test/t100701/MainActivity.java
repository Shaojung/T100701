package com.test.t100701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        LinearLayout l2 = (LinearLayout) findViewById(R.id.mLayout2);
        Button btn1 = new Button(MainActivity.this);
        btn1.setText("Button1");
        l2.addView(btn1);
        Button btn2 = new Button(MainActivity.this);
        btn2.setText("Button2");
        l2.addView(btn2);
        Button btn3 = new Button(MainActivity.this);
        btn3.setText("Button3");
        l2.addView(btn3);
    }
}
