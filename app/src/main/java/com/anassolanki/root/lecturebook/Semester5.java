package com.anassolanki.root.lecturebook;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by root on 21/3/18.
 */

public class Semester5 extends AppCompatActivity{

    private Button dcn,daa,toc,es1,la,jit,adbms,edc,nces;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester5);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("Semester V");
        actionBar.setDisplayShowTitleEnabled(true);

        dcn=(Button)findViewById(R.id.dcn);
        daa=(Button)findViewById(R.id.daa);
        toc=(Button)findViewById(R.id.toc);
        es1=(Button)findViewById(R.id.es1);
        la=(Button)findViewById(R.id.la);
        jit=(Button)findViewById(R.id.jit);
        adbms=(Button)findViewById(R.id.adbms);
        edc=(Button)findViewById(R.id.edc);
        nces=(Button)findViewById(R.id.nces);

        dcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DcnActivity.class));
                finish();
            }
        });
        daa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DaaActivity.class));
                finish();
            }
        });
        toc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),TocActivity.class));
                finish();
            }
        });
        es1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Es1Activity.class));
                finish();
            }
        });
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LinuxActivity.class));
                finish();
            }
        });
        jit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),JitActivity.class));
                finish();
            }
        });
        adbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AdbmsActivity.class));
                finish();
            }
        });
        edc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EdcActivity.class));
                finish();
            }
        });
        nces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NcesActivity.class));
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Semester5.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }
}
