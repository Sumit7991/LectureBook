package com.anassolanki.root.lecturebook;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

/**
 * Created by root on 22/3/18.
 */

public class DaaActivity extends AppCompatActivity{
    ExpandableRelativeLayout ex_notes_btn,ex_ppt_btn,ex_books_btn;
    private Button notes1,notes2,notes3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daa);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff4000")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("DAA");
        actionBar.setDisplayShowTitleEnabled(true);

        notes1=(Button)findViewById(R.id.notes_part1);
        notes2=(Button)findViewById(R.id.notes_part2);
        notes3=(Button)findViewById(R.id.notes_part3);

        notes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem5_DAA_1.pdf?alt=media&token=37ff0d4b-70dd-4d81-9d73-4c6c5e43703b";
                sender_fn(urlsend);
            }
        });

        notes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem5_DAA_2.pdf?alt=media&token=960d544f-9f18-4746-9f34-f2d8f73e95de";
                sender_fn(urlsend);
            }
        });

        notes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem5_DAA_3.pdf?alt=media&token=798365b1-3da3-4da3-b3d8-23fdd5197466";
                sender_fn(urlsend);

            }
        });


    }

    public void sender_fn(String str){
        String GoogleDocs="http://docs.google.com/gview?embedded=true&url=";
        String urlsend=GoogleDocs+str;
        if(CheckNetwork.isInternetAvailable(this)) //returns true if internet available
        {
            Intent i=new Intent(this,NotesViewerActivity.class);
            i.putExtra("urlsend",urlsend);
            startActivity(i);
            //do something. loadwebview.
        }
        else
        {
            Toast.makeText(this,"No Internet Connection",Toast.LENGTH_SHORT).show();
        }

        //finish();
    }

    public void sender_fn_link(String str){
        String urlsend=str;

        if(CheckNetwork.isInternetAvailable(this)) //returns true if internet available
        {
            Intent i=new Intent(this,NotesViewerActivity.class);
            i.putExtra("urlsend",urlsend);
            startActivity(i);
            //do something. loadwebview.
        }
        else
        {
            Toast.makeText(this,"No Internet Connection",Toast.LENGTH_SHORT).show();
        }


        //finish();
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
        Intent i = new Intent(DaaActivity.this, Semester5.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }
}
