package com.example.cprogrammingresoursces;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class Activity_Program extends AppCompatActivity {

    ExpandableListView listView;
    Adapter_Program adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Programms");
        Drawable d=getResources().getDrawable(R.drawable.screen1);
        getSupportActionBar().setBackgroundDrawable(d);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_program);
        listView=findViewById(R.id.id_exlistView_Program);
        adapter=new Adapter_Program(this);
        listView.setAdapter(adapter);
        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String value= (String) adapter.getChild(groupPosition,childPosition);
                if(value.equalsIgnoreCase("1.1 Introduction")){
                    Intent intent=new Intent(Activity_Program.this,MainActivity.class);
                    intent.putExtra("tag_body","1.1 Introduction");
                    startActivity(intent);
                }else if(value.equalsIgnoreCase("1.2 Advantages of C")){
                    Intent intent=new Intent(Activity_Program.this,MainActivity.class);
                    intent.putExtra("tag_body","1.2 Advantages of C");
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"1.2 Advantages of C",Toast.LENGTH_SHORT).show();
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
