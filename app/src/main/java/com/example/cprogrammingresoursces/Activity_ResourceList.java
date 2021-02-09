package com.example.cprogrammingresoursces;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_ResourceList extends AppCompatActivity implements ViewPager.OnPageChangeListener, View.OnClickListener {

    TextView txt_book,txt_learning,txt_job;
    ViewPager pager;
    AdapterViewPager pagerAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_resource_list);
        txt_book=findViewById(R.id.id_tv_BookLink);
        txt_learning=findViewById(R.id.id_tv_learningLink);
        txt_job=findViewById(R.id.id_tv_jobLink);
        pager=findViewById(R.id.id_viewpager);
        pager.setOffscreenPageLimit(2);
        pagerAdapter=new AdapterViewPager(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        pager.addOnPageChangeListener(this);

        txt_book.setOnClickListener(this);
        txt_learning.setOnClickListener(this);
        txt_job.setOnClickListener(this);
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {
        changeTab(i);
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.id_tv_BookLink:
                Toast.makeText(getApplicationContext(),"Tab 0 ",Toast.LENGTH_SHORT).show();
                pager.setCurrentItem(0);
                break;
            case R.id.id_tv_learningLink:
                Toast.makeText(getApplicationContext(),"Tab 1 ",Toast.LENGTH_SHORT).show();
                pager.setCurrentItem(1);
                break;
            case R.id.id_tv_jobLink:
                Toast.makeText(getApplicationContext(),"Tab 2 ",Toast.LENGTH_SHORT).show();
                pager.setCurrentItem(2);
                break;
        }
    }
    public void changeTab(int position){
        if(position==0) {
            Toast.makeText(getApplicationContext(),"Tab 0 ",Toast.LENGTH_SHORT).show();
            txt_book.setTextColor(getResources().getColor(R.color.textTabBright));
            txt_book.setTextSize(22);
            txt_learning.setTextColor(getResources().getColor(R.color.textTabLight));
            txt_learning.setTextSize(16);
            txt_job.setTextColor(getResources().getColor(R.color.textTabLight));
            txt_job.setTextSize(16);
        }if(position==1){
            Toast.makeText(getApplicationContext(),"Tab 1",Toast.LENGTH_SHORT).show();
            txt_learning.setTextColor(getResources().getColor(R.color.textTabBright));
            txt_learning.setTextSize(22);
            txt_book.setTextColor(getResources().getColor(R.color.textTabLight));
            txt_book.setTextSize(16);
            txt_job.setTextColor(getResources().getColor(R.color.textTabLight));
            txt_job.setTextSize(16);
        }if(position==2){
            Toast.makeText(getApplicationContext(),"Tab 2 ",Toast.LENGTH_SHORT).show();
            txt_job.setTextColor(getResources().getColor(R.color.textTabBright));
            txt_job.setTextSize(22);
            txt_learning.setTextColor(getResources().getColor(R.color.textTabLight));
            txt_learning.setTextSize(16);
            txt_book.setTextColor(getResources().getColor(R.color.textTabLight));
            txt_book.setTextSize(16);
        }
    }
}
