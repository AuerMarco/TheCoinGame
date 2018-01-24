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

    private ArrayList<Stock> stocks;
    private ArrayAdapter<Stock> arrayAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        Stock ea = new Stock("EA", 1, "pic", 0);
        Stock food = new Stock("Food", 10, "pic", 0);
        Stock ibm = new Stock("IBM", 20, "pic", 0);
        Stock bmw = new Stock("BMW", 30, "pic", 0);
        Stock sony = new Stock("Sony", 40, "pic", 0);
        Stock sap = new Stock("SAP", 50, "pic", 0);
        Stock squareenix = new Stock("SquareEnix", 70, "pic", 0);
        Stock fromsoftware = new Stock("FromSoftware", 80, "pic", 0);
        Stock netflix = new Stock("Netflix", 90, "pic", 0);
        Stock valve = new Stock("Valve", 100, "pic", 0);
        Stock amazon = new Stock("Amazon", 110, "pic", 0);
        Stock nestle = new Stock("IBM", 120, "pic", 0);
        Stock google = new Stock("Google", 130, "pic", 0);
        Stock microsoft = new Stock("Microsoft", 140, "pic", 0);
        Stock disney = new Stock("Disney", 150, "pic", 0);
        Stock nintendo = new Stock("IBM", 160, "pic", 0);
        Stock bitcoin = new Stock("IBM", 170, "pic", 0);
        Stock redbull = new Stock("RedBull", 180, "pic", 0);
        Stock gold = new Stock("Gold", 190, "pic", 0);
        Stock apple = new Stock("Apple", 200, "pic", 0);
        stocks = new ArrayList<>(asList(ea, food, ibm, bmw, sony, sap, squareenix, fromsoftware, netflix, valve, amazon, nestle, google, microsoft, disney, nintendo, bitcoin, redbull, gold, apple)); //asList("1","2","3","4","5","6","7")
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stocks);
        listView.setAdapter(arrayAdapter);
    }

    public void forsenE(View view) {
        Log.i("forsen", "E");
    }
}
