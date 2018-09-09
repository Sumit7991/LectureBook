package com.anassolanki.root.lecturebook;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by root on 21/3/18.
 */

public class Semester1  extends AppCompatActivity {

    private Button fee,ict,eme, maths1,physics,cs1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester1);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("Semester I");
        actionBar.setDisplayShowTitleEnabled(true);

        fee=(Button)findViewById(R.id.fee);
        ict=(Button)findViewById(R.id.ict);
        eme=(Button)findViewById(R.id.eme);
        maths1=(Button)findViewById(R.id.maths1);
        physics=(Button)findViewById(R.id.physics);
        cs1=(Button)findViewById(R.id.cs1);

        fee.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(),FeeActivity.class));
                    finish();
            }
        });
        ict.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(),IctActivity.class));
                    finish();
            }
        });
        eme.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(),EmeActivity.class));
                    finish();
            }
        });
        maths1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(),Maths1Activity.class));
                    finish();

            }
        });
        physics.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(),PhysicsActivity.class));
                    finish();
            }
        });
        cs1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Cs1Activity.class));
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Semester1.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }
}
