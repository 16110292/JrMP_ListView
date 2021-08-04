package com.example.jrmplistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    private ListView lvItems;
    private String [] negara=new String[] {"Indonesia", "Malaysia", "Singapore", "Thailand"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("ListView Sederhana");
        getSupportActionBar().setTitle("JrMP List View");
        lvItems=findViewById(R.id.lv);

        ArrayAdapter<String> adapter=new ArrayAdapter<>( MainActivity.this,
            android.R.layout.simple_list_item_1, android.R.id.text1, negara);

        lvItems.setAdapter(adapter);
        lvItems.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Memilih : " +negara[i],
                        Toast.LENGTH_LONG.show();
            }
        });
            }
            });
        }
}