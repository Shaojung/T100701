package com.test.t100701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        LinearLayout l2 = (LinearLayout) findViewById(R.id.mLayout2);
        LinearLayout sub1 = new LinearLayout(MainActivity.this);
        sub1.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
        );

        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );
        params2.weight = 1;

        sub1.setLayoutParams(params);

        Button btn1 = new Button(MainActivity.this);
        btn1.setLayoutParams(params2);
        btn1.setText("Button1");
        sub1.addView(btn1);
        Button btn2 = new Button(MainActivity.this);
        btn2.setLayoutParams(params2);
        btn2.setText("Button2");
        sub1.addView(btn2);
        Button btn3 = new Button(MainActivity.this);
        btn3.setLayoutParams(params2);
        btn3.setText("Button3");
        sub1.addView(btn3);
        l2.addView(sub1);
    }
}
