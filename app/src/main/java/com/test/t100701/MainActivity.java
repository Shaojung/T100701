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
        Button btn = new Button(MainActivity.this);
        btn.setText("Click Click");
        l2.addView(btn);
    }
}
