package com.example.rock.loginregistration;

/**
 * Created by rock on 5/20/2011.
 */
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import static android.content.ContentValues.TAG;

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
        if(method.equals("login")){
            String  user_name = params[1];
            String  password = params[2];
           Log.d(TAG, password);
            try{
                URL url = new URL(login_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("user_name","UTF-8")+"="+URLEncoder.encode(user_name,"UTF-8")+"&"+URLEncoder.encode("user_password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String result="";
                String line="";
                while ((line = bufferedReader.readLine())!=null){
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                Log.d(TAG, result);
                //Intent intent =new Intent(this.ctx,register.class);

                //Log.d(TAG, intent);
                //ctx.startActivity(new Intent(String.valueOf(register.class)));
                //setContentView(R.layout.activity_main);
                //String main_result = result.toString();
                //Log.d(TAG, main_result);
                //if (result['response'] == "Login success!!!"){
                    //Log.d(TAG, "In if");
                    //Intent intent = new Intent(ctx, home.class);
                    //ctx.startActivity(intent);
                //}else{
                    //Log.d(TAG, "In else");
                //}
                //response":"Login success!!!
                //return result;
            }catch (MalformedURLException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onPostExecute(String result) {

    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPreExecute() {
    }
}
