package com.anassolanki.root.lecturebook;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Frieden on 20/3/18.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    private long backpress;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(true);
        sem1=(Button)findViewById(R.id.sem1);
        sem2=(Button)findViewById(R.id.sem2);
        sem3=(Button)findViewById(R.id.sem3);
        sem4=(Button)findViewById(R.id.sem4);
        sem5=(Button)findViewById(R.id.sem5);
        sem6=(Button)findViewById(R.id.sem6);
        sem7=(Button)findViewById(R.id.sem7);
        sem8=(Button)findViewById(R.id.sem8);
        sem1.setOnClickListener(this);
        sem2.setOnClickListener(this);
        sem3.setOnClickListener(this);
        sem4.setOnClickListener(this);
        sem5.setOnClickListener(this);
        sem6.setOnClickListener(this);
        sem7.setOnClickListener(this);
        sem8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view==sem1){

            startActivity(new Intent(MainActivity.this,Semester1.class));
            finish();

        }
        if(view==sem2){

            startActivity(new Intent(MainActivity.this,Semester2.class));
            finish();

        }
        if(view==sem3){

            startActivity(new Intent(MainActivity.this,Semester3.class));
            finish();

        }
        if(view==sem4){

            startActivity(new Intent(MainActivity.this,Semester4.class));
            finish();

        }
        if(view==sem5){

            startActivity(new Intent(MainActivity.this,Semester5.class));
            finish();

        }
        if(view==sem6){

            startActivity(new Intent(MainActivity.this,Semester6.class));
            finish();

        }
        if(view==sem7){

            startActivity(new Intent(MainActivity.this,Semester7.class));
            finish();

        }
        if(view==sem8){

            startActivity(new Intent(MainActivity.this,Semester8.class));
            finish();

        }

    }

    public void onBackPressed(){
        backpress = (backpress + 1);
        Toast.makeText(getApplicationContext(), " Press Back again to Exit ", Toast.LENGTH_SHORT).show();

        if (backpress>1) {
            this.finish();
        }
    }
}
