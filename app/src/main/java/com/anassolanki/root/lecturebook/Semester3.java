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

public class Semester3 extends AppCompatActivity{
    private Button dld,os,ds,oopc,dm;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester3);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("Semester III");
        actionBar.setDisplayShowTitleEnabled(true);

        dld=(Button)findViewById(R.id.dld);
        os=(Button)findViewById(R.id.os);
        ds=(Button)findViewById(R.id.ds);
        oopc=(Button)findViewById(R.id.oopc);
        dm=(Button)findViewById(R.id.dm);

        dld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DldActivity.class));
                finish();
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),OsActivity.class));
                finish();
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DsActivity.class));
                finish();
            }
        });
        oopc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),OopcActivity.class));
                finish();
            }
        });
        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DmActivity.class));
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Semester3.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }


}
