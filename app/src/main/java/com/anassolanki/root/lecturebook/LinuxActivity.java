package com.anassolanki.root.lecturebook;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

/**
 * Created by root on 22/3/18.
 */

public class LinuxActivity extends AppCompatActivity{
    ExpandableRelativeLayout ex_notes_btn,ex_ppt_btn,ex_books_btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linux);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff4000")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("Linux");
        actionBar.setDisplayShowTitleEnabled(true);

    }

    public void notes_btn(View view){
        ex_notes_btn =(ExpandableRelativeLayout)findViewById(R.id.ex_notes_btn);
        ex_notes_btn.toggle();
    }

    public void ppt_btn(View view){
        ex_ppt_btn =(ExpandableRelativeLayout)findViewById(R.id.ex_ppt_btn);
        ex_ppt_btn.toggle();
    }

    public void books_btn(View view){
        ex_books_btn =(ExpandableRelativeLayout)findViewById(R.id.ex_books_btn);
        ex_books_btn.toggle();
    }

    public void imp_links_btn(View view){
        ex_books_btn =(ExpandableRelativeLayout)findViewById(R.id.ex_imp_links_btn);
        ex_books_btn.toggle();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(LinuxActivity.this, Semester5.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }
}
