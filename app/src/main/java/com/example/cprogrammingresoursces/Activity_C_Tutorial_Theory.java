package com.example.cprogrammingresoursces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_C_Tutorial_Theory extends AppCompatActivity {

    TextView txt_header,txt_content;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_tutorial_theory);
        txt_header=findViewById(R.id.id_tv_tutorialHeader_cTutorial);
        txt_content=findViewById(R.id.id_tv_tutorialContent_cTutorial);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String input=bundle.getString("tag_body");
            if(input.equalsIgnoreCase(" What is program?")){

            }if(input.equalsIgnoreCase(" What is programming?")){

            }
        }
    }
}
