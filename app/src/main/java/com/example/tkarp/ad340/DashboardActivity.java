package com.example.tkarp.ad340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Intent welcome = getIntent();
        String message = welcome.getStringExtra("EXTRA_MESSAGE");

        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        tv_name.setText(message);
    }
}
