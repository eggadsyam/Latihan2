package com.egga.layouting2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Verify_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verify__main);



    }

    public void btn_send(View view) {
        Intent intent = new Intent(Verify_MainActivity.this, Home_MainActivity.class);
        startActivity(intent);
    }
}
