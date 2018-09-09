package com.anassolanki.root.lecturebook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

import java.lang.reflect.Array;

/**
 * Created by root on 22/3/18.
 */

public class DsActivity extends AppCompatActivity{
    ExpandableRelativeLayout ex_notes_btn,ex_ppt_btn,ex_books_btn;
    private Button notespart1,notespart2,notespart3,notespart4,notespart5;
    private Button book1;
    private Button ppt[]= new Button[25];
    private Button tpds,gfgds;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff4000")));
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("DataStructures");
        actionBar.setDisplayShowTitleEnabled(true);
        notespart1=(Button)findViewById(R.id.notespart1);
        notespart2=(Button)findViewById(R.id.notespart2);
        notespart3=(Button)findViewById(R.id.notespart3);
        notespart4=(Button)findViewById(R.id.notespart4);
        notespart5=(Button)findViewById(R.id.notespart5);

        ppt[1]= (Button)findViewById(R.id.ppt1);
        ppt[2]= (Button)findViewById(R.id.ppt2);
        ppt[3]= (Button)findViewById(R.id.ppt3);
        ppt[4]= (Button)findViewById(R.id.ppt4);
        ppt[5]= (Button)findViewById(R.id.ppt5);
        ppt[6]= (Button)findViewById(R.id.ppt6);
        ppt[7]= (Button)findViewById(R.id.ppt7);
        ppt[8]= (Button)findViewById(R.id.ppt8);
        ppt[9]= (Button)findViewById(R.id.ppt9);
        ppt[10]= (Button)findViewById(R.id.ppt10);
        ppt[11]= (Button)findViewById(R.id.ppt11);
        ppt[12]= (Button)findViewById(R.id.ppt12);
        ppt[13]= (Button)findViewById(R.id.ppt13);
        ppt[14]= (Button)findViewById(R.id.ppt14);
        ppt[15]= (Button)findViewById(R.id.ppt15);
        ppt[16]= (Button)findViewById(R.id.ppt16);
        ppt[17]= (Button)findViewById(R.id.ppt17);
        ppt[18]= (Button)findViewById(R.id.ppt18);
        ppt[19]= (Button)findViewById(R.id.ppt19);
        ppt[20]= (Button)findViewById(R.id.ppt20);
        ppt[21]= (Button)findViewById(R.id.ppt21);
        ppt[22]= (Button)findViewById(R.id.ppt22);
        ppt[23]= (Button)findViewById(R.id.ppt23);
        ppt[24]= (Button)findViewById(R.id.ppt24);

        book1=(Button)findViewById(R.id.book1);

        tpds=(Button)findViewById(R.id.tpds);
        gfgds=(Button)findViewById(R.id.gfgds);

        notespart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem3_DS_1.pdf?alt=media&token=603d9bd4-6807-451c-811d-cb469bcbd35c";
                sender_fn(urlsend);
            }
        });
        notespart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem3_DS_2.pdf?alt=media&token=b75708b0-b64a-4023-b6f6-eb7990c43217";
                sender_fn(urlsend);
            }
        });

        notespart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem3_DS_3.pdf?alt=media&token=d2e22992-fc83-4057-b66c-f9cc4a79b672";
                sender_fn(urlsend);
            }
        });

        notespart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem3_DS_4.pdf?alt=media&token=a6c5f553-399e-4bd9-b5f8-ebaeb85283aa";
                sender_fn(urlsend);
            }
        });

        notespart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem3_DS_5.pdf?alt=media&token=b6efc3e8-9fdf-427a-af18-6140cc814f9d";
                sender_fn(urlsend);
            }
        });

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/Sem3_DSBook1.pdf?alt=media&token=b8959dab-a81d-4e87-9372-4670f415eea8";
                sender_fn(urlsend);
            }
        });
        //ppts
        ppt[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/1-DS_introduction.ppt?alt=media&token=8f3720a1-9013-498b-8d46-6510841e42c3";
                sender_fn(urlsend);
            }
        });

        ppt[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/2.1-Array.ppt?alt=media&token=8fa5874c-f5c9-41a3-b8b4-56e514b24743";
                sender_fn(urlsend);
            }
        });
        ppt[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/2.2.1-Stack.ppt?alt=media&token=806d36c4-f944-4f34-a97b-01a1b62d6823";
                sender_fn(urlsend);
            }
        });
        ppt[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/2.2.2-TowerOfHanoi.ppt?alt=media&token=acf1affa-1a94-4d75-9f7b-cc4d716bd612";
                sender_fn(urlsend);
            }
        });
        ppt[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/2.2.3-Recursion.ppt?alt=media&token=8f32ac0f-5137-447f-9c59-05be8eaf6625";
                sender_fn(urlsend);
            }
        });
        ppt[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/2.2.4-PolishAndReversePolishNotation.ppt?alt=media&token=8981ad13-13e2-4b3d-921d-05cfbb15b242";
                sender_fn(urlsend);
            }
        });
        ppt[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/2.3.1-Queues.ppt?alt=media&token=93df3b51-752f-4f5b-878b-ee366860268a";
                sender_fn(urlsend);
            }
        });
        ppt[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/2.3.2-DoubleEndedQueue.ppt?alt=media&token=e2882dfc-6ef6-47be-83e8-3c7b43ceacd3";
                sender_fn(urlsend);
            }
        });
        ppt[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/2.4.1-LinkedList.ppt?alt=media&token=d9b3aa57-13c6-46da-a2c4-3f6a3ab4bb82";
                sender_fn(urlsend);
            }
        });
        ppt[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/2.4.2-CircularLinkedList.ppt?alt=media&token=fdc93988-5be2-444b-a80b-d6c19f5333b7";
                sender_fn(urlsend);
            }
        });
        ppt[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/2.4.3-DoublyLinkedList.ppt?alt=media&token=1a3954b0-6086-45ae-b42c-c9b85cf1f021";
                sender_fn(urlsend);
            }
        });
        ppt[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/3.1-IntroductionToGraph.ppt?alt=media&token=1204ad6d-8620-40ee-8f73-e580c305b396";
                sender_fn(urlsend);
            }
        });
        ppt[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/3.2-Tree.ppt?alt=media&token=9f9247d7-abe3-4633-800f-88e4e4b54fde";
                sender_fn(urlsend);
            }
        });
        ppt[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/3.3.1-AvlTrees.ppt?alt=media&token=2462c0f7-b70e-413b-b4f0-5fdd6b4a9172";
                sender_fn(urlsend);
            }
        });
        ppt[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/3.3.2-23Tree.ppt?alt=media&token=1157b2c8-030c-4b7f-91c9-7c33fac3e01c";
                sender_fn(urlsend);
            }
        });
        ppt[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/3.3-BinarySearchTree.ppt?alt=media&token=ad3baeb1-b283-481f-bf3e-d756c0922ea6";
                sender_fn(urlsend);
            }
        });
        ppt[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/3.4-Mst.ppt?alt=media&token=30fb002f-c74b-4bfd-934b-7d36ae13c106";
                sender_fn(urlsend);
            }
        });
        ppt[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/3.5-GraphRepresentation.ppt?alt=media&token=bc51b347-8e20-4aa4-8065-3812c56cf6b4";
                sender_fn(urlsend);
            }
        });
        ppt[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/3.6-ShortestPath.ppt?alt=media&token=0dca5a0d-5064-4e58-ae93-f6aaf928bf69";
                sender_fn(urlsend);
            }
        });
        ppt[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/3.7-DFSandBFS.ppt?alt=media&token=62d2b007-317c-4000-99ed-e31926464bf2";
                sender_fn(urlsend);
            }
        });
        ppt[21].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/4.1-Hashing.ppt?alt=media&token=dd416f0c-c13e-4fab-905c-0746ae2b4da4";
                sender_fn(urlsend);
            }
        });
        ppt[22].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/4.2-HashingCollision.ppt?alt=media&token=590f957d-cc36-4554-8faf-68d9d9cb9eee";
                sender_fn(urlsend);
            }
        });
        ppt[23].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/4.3-Filestructure.ppt?alt=media&token=343c6729-d13e-4745-8b20-d0a00a80d422";
                sender_fn(urlsend);
            }
        });
        ppt[24].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/5-SortingAlgorithms.ppt?alt=media&token=43436dbb-e930-4c6a-9c47-aeda3a8aa884";
                sender_fn(urlsend);
            }
        });

        tpds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://www.javatpoint.com/data-structure-tutorial";
                sender_fn_link(urlsend);
            }
        });

        gfgds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlsend="https://www.geeksforgeeks.org/data-structures/";
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
        /*notes=(Button)findViewById(R.id.notes_btn);
        String urlsend="https://firebasestorage.googleapis.com/v0/b/lecturebook-c57ef.appspot.com/o/DS.pdf?alt=media&token=1d4c302a-023e-432b-aba0-31c909fb66ae";
        Intent i=new Intent(this,NotesViewerActivity.class);
        i.putExtra("urlsend",urlsend);
        startActivity(i);
        finish();*/
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
        Intent i = new Intent(DsActivity.this, Semester3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }
}
