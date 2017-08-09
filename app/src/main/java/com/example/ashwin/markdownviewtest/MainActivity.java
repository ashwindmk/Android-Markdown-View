package com.example.ashwin.markdownviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.tiagohm.markdownview.MarkdownView;
import br.tiagohm.markdownview.css.styles.Github;

public class MainActivity extends AppCompatActivity {

    private MarkdownView mContentMarkdownView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initContent();
    }

    private void initView() {
        mContentMarkdownView = (MarkdownView) findViewById(R.id.content_markdownview);
    }

    private void initContent() {
        try {
            mContentMarkdownView.addStyleSheet(new Github());
            mContentMarkdownView.loadMarkdownFromAsset("test.md");
        } catch (Exception e) {
            e.printStackTrace();
            mContentMarkdownView.loadMarkdown("Error");
        }
    }
}
