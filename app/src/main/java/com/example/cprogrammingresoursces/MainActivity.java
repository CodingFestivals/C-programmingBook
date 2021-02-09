package com.example.cprogrammingresoursces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

public class MainActivity extends AppCompatActivity implements CodeView.OnHighlightListener {

    TextView tv_programHeader;
    CodeView cv_porgramBody;
    ImageView iv_programFooter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_programHeader=findViewById(R.id.id_tv_programHeader);
        cv_porgramBody=findViewById(R.id.id_cv_programBody);
        iv_programFooter=findViewById(R.id.id_iv_programFooter);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String input=bundle.getString("tag_body");
            if(input.equalsIgnoreCase("1.1 Introduction")){
                tv_programHeader.setText("Introduction");
                cv_porgramBody.setOnHighlightListener(this)
                        .setOnHighlightListener(this)
                        .setTheme(Theme.AGATE)
                        .setCode(CodeIntro.getStringIntro())
                        .setLanguage(Language.JAVA)
                        .setWrapLine(true)
                        .setFontSize(16)
                        .setZoomEnabled(true)
                        .setShowLineNumber(false)
                        .setStartLineNumber(1)
                        .apply();

            }else if(input.equalsIgnoreCase("1.2 Advantages of C")){
                tv_programHeader.setText("Advantages");
                cv_porgramBody.setOnHighlightListener(this)
                        .setOnHighlightListener(this)
                        .setTheme(Theme.AGATE)
                        .setCode(CodeIntro.getStringAdvantage())
                        .setLanguage(Language.JAVA)
                        .setWrapLine(false)
                        .setFontSize(16)
                        .setZoomEnabled(false)
                        .setShowLineNumber(false)
                        .setStartLineNumber(1)
                        .apply();
            }
        }
    }

    @Override
    public void onStartCodeHighlight() {

    }

    @Override
    public void onFinishCodeHighlight() {

    }

    @Override
    public void onLanguageDetected(Language language, int i) {

    }

    @Override
    public void onFontSizeChanged(int i) {

    }

    @Override
    public void onLineClicked(int i, String s) {

    }
}
