package com.example.jrmplistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lvItems;
    private String [] namanegara=new String[] {"Indonesia", "Malaysia", "Singapore", "Thailand"}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("ListView Sederhana");
        getSupportActionBar().setTitle("JrMP List View");
        lvItems=findViewById(R.id.lv);


    }
}