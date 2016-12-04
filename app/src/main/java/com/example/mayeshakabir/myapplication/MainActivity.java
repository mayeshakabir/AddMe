package com.example.mayeshakabir.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.webkit.*;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {
    private WebView webView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new MyWebViewClient());


        webView.getSettings().setJavaScriptEnabled(true);

    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    public void goToFacebook (View view) {
        webView.loadUrl("https://www.facebook.com");
        Uri uri = Uri.parse("https://www.facebook.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void gotToTwitter (View view) {
        webView.loadUrl("https://www.twitter.com");
        Uri uri = Uri.parse("https://www.twitter.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void goToInsta (View view) {
        webView.loadUrl("https://www.instagram.com");
        Uri uri = Uri.parse("https://www.instagram.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void goToYoutube (View view) {
        webView.loadUrl("https://www.youtube.com");
        Uri uri = Uri.parse("https://www.youtube.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void goToVimeo (View view) {
        webView.loadUrl("https://www.vimeo.com");
        Uri uri = Uri.parse("https://www.vimeo.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void goToLinkd (View view) {
        webView.loadUrl("https://www.linkedin.com");
        Uri uri = Uri.parse("https://www.linkedin.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}

