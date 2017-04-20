package com.example.tkarp.ad340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class InfoActivity extends AppCompatActivity {
    private static final String TAG = "InfoActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void login(View view) {
        Log.d(TAG, "login() Creating Intent");
        Intent login = new Intent(this, DashboardActivity.class);
        EditText et_login = (EditText) findViewById(R.id.et_login);
        EditText et_password = (EditText) findViewById(R.id.et_password);
        Log.d(TAG, "login() Assigning Data to message");
        String message = et_login.getText().toString();
        login.putExtra("EXTRA_MESSAGE", message);
        Log.d(TAG, "login() startActivity(login)");
        startActivity(login);

    }
}
