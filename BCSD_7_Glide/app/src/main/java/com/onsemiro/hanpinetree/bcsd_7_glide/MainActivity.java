package com.onsemiro.hanpinetree.bcsd_7_glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
   private ListView listView;
   private MyListAdapter myListAdapter;
   private ArrayList<list_item> list_itemArrayList;
   private ProgressBar mProgressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressbar = (ProgressBar)findViewById(R.id.activity_main_progressbar);
        mProgressbar.setProgress(0);
        listView = (ListView) findViewById(R.id.my_listView);
        list_itemArrayList = new ArrayList<list_item>();
        list_itemArrayList.add(new list_item("http://serentrip.net/img/resource/en/web_logo.png",
                "보라돌이","제목1",new Date(System.currentTimeMillis()),"내용1"));
        mProgressbar.setProgress(20);
        list_itemArrayList.add(new list_item("https://cdn-images-1.medium.com/fit/c/36/36/0*HgJ2Psmia7PjQsp9.jpg",
                "뚜비","제목2",new Date(System.currentTimeMillis()),"내용2"));
        mProgressbar.setProgress(40);
        list_itemArrayList.add(new list_item("https://t1.daumcdn.net/cfile/tistory/99837D395A7EA15717",
                "나나","제목3",new Date(System.currentTimeMillis()),"내용3"));
        mProgressbar.setProgress(60);
        list_itemArrayList.add(new list_item("https://www.google.com/logos/doodles/2019/parents-day-2019-south-korea-5668016422387712-l.png",
                "뽀","제목4",new Date(System.currentTimeMillis()),"내용4"));
        mProgressbar.setProgress(80);
        list_itemArrayList.add(new list_item("https://cdn-images-1.medium.com/fit/c/36/36/0*HgJ2Psmia7PjQsp9.jpg",
                "햇님","제목5",new Date(System.currentTimeMillis()),"내용5"));
        mProgressbar.setProgress(100);


        myListAdapter = new MyListAdapter(MainActivity.this,list_itemArrayList);
        listView.setAdapter(myListAdapter);
    }
}
