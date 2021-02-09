package com.example.cprogrammingresoursces;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Activity_WelcomePage extends AppCompatActivity implements View.OnClickListener {

    CardView cv_cv1,cv_cv2,cv_cv3,cv_cv4,cv_cv5,cv_cv6,cv_cv7;
    MediaPlayer mp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Drawable d=getResources().getDrawable(R.drawable.screen1);
        getSupportActionBar().setBackgroundDrawable(d);
        setContentView(R.layout.activity_welcome_page);
        cv_cv1=findViewById(R.id.id_welcome_cv1);
        cv_cv1.setOnClickListener(this);
        cv_cv2=findViewById(R.id.id_welcome_cv2);
        cv_cv2.setOnClickListener(this);
        cv_cv3=findViewById(R.id.id_welcome_cv3);
        cv_cv3.setOnClickListener(this);
        cv_cv4=findViewById(R.id.id_welcome_cv4);
        cv_cv4.setOnClickListener(this);
        cv_cv5=findViewById(R.id.id_welcome_cv5);
        cv_cv5.setOnClickListener(this);
        cv_cv6=findViewById(R.id.id_welcome_cv6);
        cv_cv6.setOnClickListener(this);
        cv_cv7=findViewById(R.id.id_welcome_cv7);
        cv_cv7.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_dashboard,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.id_dashboard_setting:
                Toast.makeText(this,"Setting Click",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.id_dashboard_share:
                Toast.makeText(this,"Share Click",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.id_dashboard_feedback:
                Toast.makeText(this,"Feedback Click",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.id_dashboard_aboutus:
                Toast.makeText(this,"About Us Click",Toast.LENGTH_SHORT).show();
                return  true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.id_welcome_cv1:
                mp = MediaPlayer.create(this, R.raw.clcksound1);
                /*mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });*/
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                        mp = MediaPlayer.create(this, R.raw.clcksound1);
                    } mp.start();
                } catch(Exception e) { e.printStackTrace(); }
                cv_cv1.setCardBackgroundColor(0xff2ecc71);
                Intent intent_tutorial=new Intent(Activity_WelcomePage.this,Activity_CTutorial.class);
                startActivity(intent_tutorial);
                break;
            case R.id.id_welcome_cv2:
                mp = MediaPlayer.create(this, R.raw.clcksound1);
                /*mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });*/
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                        mp = MediaPlayer.create(this, R.raw.clcksound1);
                    } mp.start();
                } catch(Exception e) { e.printStackTrace(); }
                cv_cv2.setCardBackgroundColor(0xff2ecc71);
                Intent intent_program=new Intent(Activity_WelcomePage.this,Activity_Program.class);
                startActivity(intent_program);
                break;
            case R.id.id_welcome_cv3:
                mp = MediaPlayer.create(this, R.raw.clcksound1);
                /*mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });*/
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                        mp = MediaPlayer.create(this, R.raw.clcksound1);
                    } mp.start();
                } catch(Exception e) { e.printStackTrace(); }
                cv_cv3.setCardBackgroundColor(0xff2ecc71);
                Intent intent_outputprogram=new Intent(Activity_WelcomePage.this,Activity_OutputProgram.class);
                startActivity(intent_outputprogram);
                break;
            case R.id.id_welcome_cv4:
                mp = MediaPlayer.create(this, R.raw.clcksound1);
                /*mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });*/
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                        mp = MediaPlayer.create(this, R.raw.clcksound1);
                    } mp.start();
                } catch(Exception e) { e.printStackTrace(); }
                cv_cv4.setCardBackgroundColor(0xff2ecc71);
                Intent intent_contestprogram=new Intent(Activity_WelcomePage.this,Activity_ContestProgram.class);
                startActivity(intent_contestprogram);
                break;
            case R.id.id_welcome_cv5:
                mp = MediaPlayer.create(this, R.raw.clcksound1);
                /*mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });*/
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                        mp = MediaPlayer.create(this, R.raw.clcksound1);
                    } mp.start();
                } catch(Exception e) { e.printStackTrace(); }
                cv_cv5.setCardBackgroundColor(0xff2ecc71);
                Intent intent_universityQustion=new Intent(Activity_WelcomePage.this,Activity_UniversityQuestion.class);
                startActivity(intent_universityQustion);
                break;
            case R.id.id_welcome_cv6:
                mp = MediaPlayer.create(this, R.raw.clcksound1);
                /*mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });*/
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                        mp = MediaPlayer.create(this, R.raw.clcksound1);
                    } mp.start();
                } catch(Exception e) { e.printStackTrace(); }
                cv_cv6.setCardBackgroundColor(0xff2ecc71);
                Intent intent_resourceLink=new Intent(Activity_WelcomePage.this,Activity_ResourceList.class);
                startActivity(intent_resourceLink);
                break;
                case R.id.id_welcome_cv7:
                mp = MediaPlayer.create(this, R.raw.clcksound1);
                /*mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });*/
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                        mp = MediaPlayer.create(this, R.raw.clcksound1);
                    } mp.start();
                } catch(Exception e) { e.printStackTrace(); }
                cv_cv7.setCardBackgroundColor(0xff2ecc71);
                Intent intent_aboutUs=new Intent(Activity_WelcomePage.this,Activity_CodeShow.class);
                startActivity(intent_aboutUs);
                break;
        }
    }
}
