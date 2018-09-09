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

public class Semester6 extends AppCompatActivity{
    private Button wnmc,pcd,awt,is,es2,ajt,dotnet,cg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester6);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("Semester VI");
        actionBar.setDisplayShowTitleEnabled(true);

        wnmc=(Button)findViewById(R.id.wnmc);
        pcd=(Button)findViewById(R.id.pcd);
        awt=(Button)findViewById(R.id.awt);
        is=(Button)findViewById(R.id.is);
        es2=(Button)findViewById(R.id.es2);
        ajt=(Button)findViewById(R.id.ajt);
        dotnet=(Button)findViewById(R.id.dotnet);
        cg=(Button)findViewById(R.id.cg);

        wnmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),WnmcActivity.class));
                finish();
            }
        });
        pcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PcdActivity.class));
                finish();
            }
        });
        awt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AwtActivity.class));
                finish();
            }
        });
        is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),IsActivity.class));
                finish();
            }
        });
        es2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Es2Activity.class));
                finish();
            }
        });
        ajt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AjtActivity.class));
                finish();
            }
        });
        dotnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DotnetActivity.class));
                finish();
            }
        });
        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CgActivity.class));
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Semester6.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }
}
