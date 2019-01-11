package com.example.rock.loginregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class register extends AppCompatActivity {
    EditText User_name,User_email,User_pass;
    String user_name,user_email,user_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        User_name = (EditText)findViewById(R.id.user_name);
        User_email = (EditText)findViewById(R.id.user_email);
        User_pass = (EditText)findViewById(R.id.user_pass);
    }
    public void userRegister(View view){
        user_name = User_name.getText().toString();
        user_email = User_email.getText().toString();
        user_pass = User_pass.getText().toString();
        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,user_name,user_email,user_pass);
        finish();
    }
}
