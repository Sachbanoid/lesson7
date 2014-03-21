package com.example.five_six_seven_tasks;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Feed extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed);
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadData(getIntent().getStringExtra("description"), "text/html; charset=UTF-8", null);
    }
}
