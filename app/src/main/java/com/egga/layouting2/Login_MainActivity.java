/*  17 April 2019
    Egga Dinarul Syam
    10116393
    AKBIF9  */
package com.egga.layouting2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class Login_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login_main);

        //custom
        TextView view = (TextView) findViewById(R.id.txt_register);
        String aa = "doestn't have account ? <b>Register</b>";
        view.setText(Html.fromHtml(aa));


        //edittext
        EditText password = (EditText) findViewById(R.id.edttxt_password);
        password.setTransformationMethod(new PasswordTransformationMethod());
    }

    public void does_not(View view) {
        Intent intent = new Intent(Login_MainActivity.this, Register_MainActivity.class);
        startActivity(intent);
    }
}


