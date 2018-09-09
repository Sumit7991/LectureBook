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

public class DldActivity extends AppCompatActivity{
    ExpandableRelativeLayout ex_notes_btn,ex_ppt_btn,ex_books_btn;
    private Button book;
    private Button ytdld,gfgdld;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dld);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff4000")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("DLD");
        actionBar.setDisplayShowTitleEnabled(true);

        book=(Button)findViewById(R.id.book1);

        ytdld=(Button)findViewById(R.id.ytdld);
        gfgdld=(Button)findViewById(R.id.gfgdld);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem3_dld_book1.pdf?alt=media&token=79bed588-5725-44a6-9d5c-c2c76eafcf42";
                sender_fn(urlsend);
            }
        });

        ytdld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://www.youtube.com/playlist?list=PLBlnK6fEyqRjMH3mWf6kwqiTbT798eAOm";
                sender_fn_link(urlsend);
            }
        });

        gfgdld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://www.geeksforgeeks.org/digital-electronics-logic-design-tutorials/";
                sender_fn_link(urlsend);
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



   /* public void notes_btn(View view){
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
    }*/

    public void imp_links_btn(View view){
        ex_books_btn =(ExpandableRelativeLayout)findViewById(R.id.ex_imp_links_btn);
        ex_books_btn.toggle();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(DldActivity.this, Semester3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }
}
