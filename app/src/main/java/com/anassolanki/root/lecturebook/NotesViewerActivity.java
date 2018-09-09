package com.anassolanki.root.lecturebook;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class NotesViewerActivity extends AppCompatActivity{


    String urlto;
    WebView webView;
    Activity activity ; // instead of context we can use activity
    private ProgressDialog progDailog;  // loader

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notesviewer);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff4000")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(true);
        //mStorageRef = storage.getReference();
        //StorageReference pathReference=mStorageRef.child("cpp_tutorial.pdf ");
        //StorageReference gsReference=storage.getReferenceFromUrl("gs://lecturebook-c57ef.appspot.com/cpp_tutorial.pdf");
        //StorageReference httpReference=storage.getReferenceFromUrl("https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/cpp_tutorial.pdf?alt=media&token=1ae56fec-881f-40cf-a8e1-649821f988df");
        //pdf="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/cpp_tutorial.pdf?alt=media&token=1ae56fec-881f-40cf-a8e1-649821f988df";
        activity=this;
        urlto=getIntent().getExtras().getString("urlsend");
        progDailog = ProgressDialog.show(activity, "Loading","Please wait...", true);
        progDailog.setCancelable(false);
        webView = (WebView)findViewById(R.id.files);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                progDailog.show();
                view.loadUrl(url);

                return true;
            }
            @Override
            public void onPageFinished(WebView view, final String url) {
                progDailog.dismiss();
            }
        });
        //Toast.makeText(this,GoogleDocs+urlto,Toast.LENGTH_LONG).show();
        String urls=urlto;
        webView.loadUrl(urls);   // webview loader to load the URL of file
    }  }



