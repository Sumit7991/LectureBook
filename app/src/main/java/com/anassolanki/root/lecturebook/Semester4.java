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

public class Semester4 extends AppCompatActivity{

    private Button ooad,co,dbms,py,mi,nasm,pcct;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester4);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("Semester IV");
        actionBar.setDisplayShowTitleEnabled(true);

        ooad=(Button)findViewById(R.id.ooad);
        co=(Button)findViewById(R.id.co);
        dbms=(Button)findViewById(R.id.dbms);
        py=(Button)findViewById(R.id.py);
        mi=(Button)findViewById(R.id.mi);
        nasm=(Button)findViewById(R.id.nasm);
        pcct=(Button)findViewById(R.id.pcct);

        ooad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),OoadActivity.class));
                finish();
            }
        });
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CoActivity.class));
                finish();
            }
        });
        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DbmsActivity.class));
                finish();
            }
        });
        py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PythonActivity.class));
                finish();
            }
        });
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MicroprocessorActivity.class));
                finish();
            }
        });
        nasm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NasmActivity.class));
                finish();
            }
        });
        pcct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PcctActivity.class));
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Semester4.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }


}
