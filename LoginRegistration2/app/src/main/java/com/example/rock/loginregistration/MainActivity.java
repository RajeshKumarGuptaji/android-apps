package com.example.rock.loginregistration;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static android.R.attr.end;
import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {
    // Login Code
    EditText UsernameEt, PasswordEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.registerTextView);
        String text = "New User Register Here";
        SpannableString ss = new SpannableString(text);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                setContentView(R.layout.activity_register);

            }
        };
        ss.setSpan(new ForegroundColorSpan(Color.BLUE),9,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        /// Login code
        UsernameEt = (EditText)findViewById(R.id.user_name);
        PasswordEt = (EditText)findViewById(R.id.user_pass);
    }
    public void userReg(View view){
        startActivity(new Intent(this,register.class));
    }
    // Login Code
    public  void  OnLogin (View view){
        String user_name = UsernameEt.getText().toString();
        String user_pass = PasswordEt.getText().toString();
        String method = "login";
        //startActivity(new Intent(this,register.class));
        //Toast.makeText(MainActivity.this,user_name,Toast.LENGTH_LONG).show();
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,user_name,user_pass);
    }

}
