package com.example.cprogrammingresoursces;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class Activity_ContestProgram extends AppCompatActivity {

    ExpandableListView listView;
    Adapter_ContestProgram adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Drawable d=getResources().getDrawable(R.drawable.screen1);
        getSupportActionBar().setTitle("Contest Program");
        getSupportActionBar().setBackgroundDrawable(d);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_contest_program);
        listView=findViewById(R.id.id_exlistView_ContestProgram);
        adapter=new Adapter_ContestProgram(this);
        listView.setAdapter(adapter);
        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String value= (String) adapter.getChild(groupPosition,childPosition);
                if(value.equalsIgnoreCase("1.1 Introduction")){
                    Intent intent=new Intent(Activity_ContestProgram.this,MainActivity.class);
                    startActivity(intent);
                }else if(value.equalsIgnoreCase("1.2 Advantages of C")){
                    Toast.makeText(getApplicationContext(),"1.2 Advantages of C",Toast.LENGTH_SHORT).show();
                }
                return true;
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
