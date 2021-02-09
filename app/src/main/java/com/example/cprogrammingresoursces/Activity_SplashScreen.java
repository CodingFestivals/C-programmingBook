package com.example.cprogrammingresoursces;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Activity_SplashScreen extends AppCompatActivity {

    ProgressBar progressBar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<16){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }else{
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        }
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);
        progressBar=findViewById(R.id.id_pb_splashscreen);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startActivity();
            }
        });
        thread.start();
    }
    public void doWork(){
        for(int i=20;i<=100;i+=20){
            try{
                Thread.sleep(1000);
                progressBar.setProgress(i);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public  void startActivity(){
        Intent intent=new Intent(Activity_SplashScreen.this,Activity_WelcomePage.class);
        startActivity(intent);
        finish();
    }
}
