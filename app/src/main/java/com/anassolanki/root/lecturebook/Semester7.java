package com.anassolanki.root.lecturebook;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by root on 21/3/18.
 */

public class Semester7 extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester7);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("Semester VII");
        actionBar.setDisplayShowTitleEnabled(true);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Semester7.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }
}
