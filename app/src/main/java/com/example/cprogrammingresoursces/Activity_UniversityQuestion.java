package com.example.cprogrammingresoursces;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Activity_UniversityQuestion extends AppCompatActivity {

    ListView listView_m2,listView_m4,listView_m8;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("University Question");
        Drawable d=getResources().getDrawable(R.drawable.screen1);
        getSupportActionBar().setBackgroundDrawable(d);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_university_question);
        listView_m2=findViewById(R.id.id_lv_m2);
        listView_m4=findViewById(R.id.id_lv_m4);
        listView_m8=findViewById(R.id.id_lv_m8);
        Adapter_UniversityQuestionMark2 adapter_mark2=new Adapter_UniversityQuestionMark2(this);
        Adapter_UniversityQuestionMark4 adapter_mark4=new Adapter_UniversityQuestionMark4(this);
        Adapter_UniversityQuestionMark8 adapter_mark8=new Adapter_UniversityQuestionMark8(this);
        listView_m2.setAdapter(adapter_mark2);
        listView_m4.setAdapter(adapter_mark4);
        listView_m8.setAdapter(adapter_mark8);
        ListUtils.setDynamicHeight(listView_m2);
        ListUtils.setDynamicHeight(listView_m4);
        ListUtils.setDynamicHeight(listView_m8);
        listView_m2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_SHORT).show();

            }
        });
        listView_m4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_SHORT).show();
            }
        });listView_m8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
