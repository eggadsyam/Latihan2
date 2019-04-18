package com.egga.layouting2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Almost_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.almost__main);
    }

    public void btn_verify(View view) {
        Intent intent = new Intent(Almost_MainActivity.this, Verify_MainActivity.class);
        startActivity(intent);
    }
}
