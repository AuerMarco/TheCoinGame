package com.kylekashi.thestockgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> stocks;
    private ArrayAdapter<String> arrayAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        stocks = new ArrayList<>(asList("1","2","3","4","5","6","7"));
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stocks);
        listView.setAdapter(arrayAdapter);

    }

    public void forsenE(View view) {
        Log.i("forsen", "E");
    }
}
