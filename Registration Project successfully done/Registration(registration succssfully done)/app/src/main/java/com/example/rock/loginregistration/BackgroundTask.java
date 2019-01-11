package com.example.rock.loginregistration;

/**
 * Created by rock on 5/20/2011.
 */
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundTask extends AsyncTask<String,Void,String> {
    Context ctx;
    BackgroundTask(Context ctx){

    }

    @Override
    protected String doInBackground(String... params) {
        String reg_url = "http://rajeshkumargupta.000webhostapp.com/registrationApi.php";
        String login_url = "http://rajeshkumargupta.000webhostapp.com/loginApi.php";
        String method = params[0];
        if(method.equals("register")){
            String user_name = params[1];
            String user_email = params[2];
            String user_pass = params[3];
            try{
                URL url = new URL(reg_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream os = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
                String data = URLEncoder.encode("user_name","UTF-8") +"="+URLEncoder.encode(user_name,"UTF-8")+"&"+
                        URLEncoder.encode("user_email","UTF-8") +"="+URLEncoder.encode(user_email,"UTF-8")+"&"+
                        URLEncoder.encode("user_password","UTF-8") +"="+URLEncoder.encode(user_pass,"UTF-8");
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                os.close();
                InputStream inputStream =  httpURLConnection.getInputStream();
                inputStream.close();
                return  "Registration Success...";
            } catch (MalformedURLException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
       // Toast.makeText(ctx,result,Toast.LENGTH_LONG).show();
        //Toast.makeText(ctx,(String)result,Toast.LENGTH_SHORT).show();
        //Toast.makeText(ctx, "success", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }
}
