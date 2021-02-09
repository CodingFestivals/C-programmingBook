package com.example.cprogrammingresoursces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

import io.github.kbiakov.codeview.adapters.Options;
import io.github.kbiakov.codeview.highlight.ColorTheme;

public class Activity_CodeShow extends AppCompatActivity implements CodeView.OnHighlightListener {

    CodeView codeView,codeView1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_show);
        codeView=findViewById(R.id.codeView);
        codeView1=findViewById(R.id.codeView1);
        //codeView.setCode(getString(R.string.id_intro));
        codeView.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.AGATE)
                .setCode(CodeIntro.getStringIntro())
                .setLanguage(Language.JAVA)
                .setWrapLine(true)
                .setFontSize(14)
                .setZoomEnabled(false)
                .setShowLineNumber(true)
                .setStartLineNumber(9000)
                .apply();
        codeView1.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.AGATE)
                .setCode(getResources().getString(R.string.id_intro))
                .setLanguage(Language.JAVA)
                .setWrapLine(true)
                .setFontSize(14)
                .setZoomEnabled(false)
                .setShowLineNumber(true)
                .setStartLineNumber(100)
                .apply();
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
