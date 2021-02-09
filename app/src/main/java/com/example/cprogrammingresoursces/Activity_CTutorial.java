package com.example.cprogrammingresoursces;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class Activity_CTutorial extends AppCompatActivity {

    ExpandableListView listView;
    Adapter_CTutorial adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("C Tutorial");
        Drawable d=getResources().getDrawable(R.drawable.screen1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(d);
        setContentView(R.layout.activity_ctutorial);
        listView=findViewById(R.id.id_exlistView_Ctutorial);
        adapter=new Adapter_CTutorial(this);
        listView.setAdapter(adapter);
        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String value= (String) adapter.getChild(groupPosition,childPosition);
                if(value.equalsIgnoreCase("1.1 Introduction")){
                    Intent intent=new Intent(Activity_CTutorial.this,MainActivity.class);
                    intent.putExtra("tag_body","1.1 Introduction");
                    startActivity(intent);
                }else if(value.equalsIgnoreCase("1.2 Advantages of C")){
                    Toast.makeText(getApplicationContext(),"1.2 Advantages of C",Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        /*listView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                ViewHolderParent temp= (ViewHolderParent) v.getTag();
                temp.textViewParent.setBackground(getResources().getDrawable(R.drawable.bg_elv_tutorial1));
                //v.setBackground(getDrawable(R.drawable.bg_elv_tutorial1));
                return false;
            }
        });*/
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
