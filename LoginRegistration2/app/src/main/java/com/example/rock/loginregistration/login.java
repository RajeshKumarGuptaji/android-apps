package com.example.rock.loginregistration;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by rock on 1/5/2019.
 */

public class login extends AppCompatActivity {
    EditText User_name,User_pass;
    String user_name,user_pass;
    Context context;

    AlertDialog alertDialog;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User_name = (EditText)findViewById(R.id.user_name);
        User_pass = (EditText)findViewById(R.id.user_pass);
    }
    public void userLogin(View view){
        user_name = User_name.getText().toString();
        user_pass = User_pass.getText().toString();
//        alertDialog = new AlertDialog.Builder(context).create();
//        alertDialog.setTitle("Login Status");
//        alertDialog.setMessage(user_name);
//        alertDialog.show();
//        String method = "login";
//        BackgroundTask backgroundTask = new BackgroundTask(this);
//        backgroundTask.execute(method,user_name,user_pass);
//        finish();
    }
}
