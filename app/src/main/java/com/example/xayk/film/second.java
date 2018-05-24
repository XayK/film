package com.example.xayk.film;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=findViewById(R.id.TextV);
        Intent in = getIntent();
        int begin= in.getIntExtra("begin",0);
                tv.setText(Integer.toString(begin));
    }
}
