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

public class OopcActivity extends AppCompatActivity{
    private Button notes,books;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oopc);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff4000")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("C++");
        actionBar.setDisplayShowTitleEnabled(true);

        notes=(Button)findViewById(R.id.notes_btn);
        books=(Button)findViewById(R.id.books_btn);

        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://www.tutorialspoint.com/cplusplus/index.htm";
                sender_fn_link(urlsend);
            }
        });

        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/OOP-Balagurusamy.pdf?alt=media&token=908a72f8-93ff-47a7-a5fa-47dc6136cd7f";
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



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(OopcActivity.this, Semester3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }
}
