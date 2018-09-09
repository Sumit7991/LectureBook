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

public class OsActivity extends AppCompatActivity{
    ExpandableRelativeLayout ex_notes_btn,ex_ppt_btn,ex_books_btn;
    private Button notespart1,notespart2,notespart3;
    private Button ppt1,ppt2,ppt3,ppt4,ppt5,ppt6,ppt7,ppt8,ppt9,ppt10,ppt11,ppt12;
    private Button book1;
    private Button implink,tpos;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff4000")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("Operating System");
        actionBar.setDisplayShowTitleEnabled(true);
        notespart1=(Button)findViewById(R.id.notespart1);
        notespart2=(Button)findViewById(R.id.notespart2);
        notespart3=(Button)findViewById(R.id.notespart3);

        ppt1=(Button)findViewById(R.id.ppt1);
        ppt2=(Button)findViewById(R.id.ppt2);
        ppt3=(Button)findViewById(R.id.ppt3);
        ppt4=(Button)findViewById(R.id.ppt4);
        ppt5=(Button)findViewById(R.id.ppt5);
        ppt6=(Button)findViewById(R.id.ppt6);
        ppt7=(Button)findViewById(R.id.ppt7);
        ppt8=(Button)findViewById(R.id.ppt8);
        ppt9=(Button)findViewById(R.id.ppt9);
        ppt10=(Button)findViewById(R.id.ppt10);
        ppt11=(Button)findViewById(R.id.ppt11);
        ppt12=(Button)findViewById(R.id.ppt12);

        book1=(Button)findViewById(R.id.book1);
        implink=(Button)findViewById(R.id.implink);
        tpos=(Button)findViewById(R.id.tpos);


        notespart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem3_OS_1.pdf?alt=media&token=7cab15bc-33d3-4e0e-9f56-f7be9ea7fc17";
                sender_fn(urlsend);
            }
        });
        notespart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem3_OS_2.pdf?alt=media&token=4d7a4da6-fb6c-452d-bc7a-ffaf307042af";
                sender_fn(urlsend);
            }
        });

        notespart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem3_OS_3.pdf?alt=media&token=b4ecd61f-12d3-47d9-9c80-98aa00a7b660";
                sender_fn(urlsend);
            }
        });

        ppt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/1-BasicsOfOS.pptx?alt=media&token=50e50512-86f2-4f9c-badf-0829327a715a";
                sender_fn(urlsend);
            }
        });
        ppt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/2-BasicsOfOS-2.pptx?alt=media&token=85322396-4438-4771-871c-a56e5511c7e6";
                sender_fn(urlsend);
            }
        });
        ppt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/3.1-ProcessAndThreads.pptx?alt=media&token=e4ee23be-aa3f-466e-b3b5-dd08b41dbf90";
                sender_fn(urlsend);
            }
        });
        ppt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/3.2-ProcessManagement.pptx?alt=media&token=cc902d6c-7bde-4c25-a874-3565cbbeefb2";
                sender_fn(urlsend);
            }
        });
        ppt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/4.1-InterProcessComunication.pptx?alt=media&token=a89b8100-bdd6-4515-9591-260ae09ca000";
                sender_fn(urlsend);
            }
        });
        ppt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/4.2-Deadlock.pptx?alt=media&token=53b09a2e-a18a-4e9e-b1d2-f68b04ac1a2b";
                sender_fn(urlsend);
            }
        });
        ppt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/5.1-ContigousMemoryAllocation.pptx?alt=media&token=1ad31b62-d764-425a-8b62-69c3e7fda613";
                sender_fn(urlsend);
            }
        });
        ppt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/5.2-PagingAndSegmentation.pptx?alt=media&token=579876ad-e0cb-4d57-8b79-8f858afbd048";
                sender_fn(urlsend);
            }
        });
        ppt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/5.3-VirtualMemory.pptx?alt=media&token=0b953286-5ce3-4efe-8d4e-4135ae8dc321";
                sender_fn(urlsend);
            }
        });
        ppt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/6-Input-OutputDevices.pptx?alt=media&token=c518d5b6-a132-40c1-aa4d-224be27ca84b";
                sender_fn(urlsend);
            }
        });
        ppt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/7-FileManagement.pptx?alt=media&token=d0c17fe0-b0f4-45f2-b2f1-8275c2e3f2bb";
                sender_fn(urlsend);
            }
        });
        ppt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/8-SecurityAndProtection.pptx?alt=media&token=12ae44f6-600d-4e00-a815-e43cba944310";
                sender_fn(urlsend);
            }
        });
        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem3_OSBook1.pdf?alt=media&token=f4a49cfe-0305-4f31-9bfb-a5a24da3b446";
                sender_fn(urlsend);
            }
        });

        implink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://www.youtube.com/playlist?list=PLEbnTDJUr_If_BnzJkkN_J0Tl3iXTL8vq";
                sender_fn_link(urlsend);
            }
        });

        tpos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://www.tutorialspoint.com/operating_system/index.htm";
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
        Intent i = new Intent(OsActivity.this, Semester3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }
}
