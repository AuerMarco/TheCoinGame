package com.kylekashi.thestockgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Stock> stocks;
    private ArrayAdapter<Stock> arrayAdapter;
    private ListView listView;
    private TextView txtMoney;
    DecimalFormat df;

    private User user;
    private Stock ea, food, ibm, bmw, sony, sap, squareenix, fromsoftware, netflix, valve, amazon, nestle, google, microsoft, disney, nintendo, bitcoin, redbull, gold, apple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        df = new DecimalFormat("#.##");
        txtMoney = (TextView) findViewById(R.id.txtMoney);
        user = new User();
        listView = (ListView) findViewById(R.id.listView);
        ea = new Stock("EA", 1, 0);
        food = new Stock("Food", 10, 0);
        ibm = new Stock("IBM", 20, 0);
        bmw = new Stock("BMW", 30, 0);
        sony = new Stock("Sony", 40, 0);
        sap = new Stock("SAP", 50, 0);
        squareenix = new Stock("Square Enix", 70, 0);
        fromsoftware = new Stock("FromSoftware", 80, 0);
        netflix = new Stock("Netflix", 90, 0);
        valve = new Stock("Valve", 100, 0);
        amazon = new Stock("Amazon", 110, 0);
        nestle = new Stock("Nestle", 120, 0);
        google = new Stock("Google", 130, 0);
        microsoft = new Stock("Microsoft", 140, 0);
        disney = new Stock("Disney", 150, 0);
        nintendo = new Stock("Nintendo", 160, 0);
        bitcoin = new Stock("Bitcoin", 170, 0);
        redbull = new Stock("Red Bull", 180, 0);
        gold = new Stock("Gold", 190, 0);
        apple = new Stock("Apple", 200, 0);
        stocks = new ArrayList<>(asList(ea, food, ibm, bmw, sony, sap, squareenix, fromsoftware, netflix, valve, amazon, nestle, google, microsoft, disney, nintendo, bitcoin, redbull, gold, apple)); //asList("1","2","3","4","5","6","7")
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stocks);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                stocks.get(position).setStockPrice(stocks.get(position).getStockPrice()*1.2);
                update();
//                Toast.makeText(MainActivity.this, stocks.get(position).getStockName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void forsenE(View view) {
        Trade.trade(user, ea);
        update();
    }

    private void update() {
        arrayAdapter.notifyDataSetChanged();
        double worth = 0;
        for (Stock stock : stocks) {
          worth += stock.getStockPrice() * stock.getAmount();
        }
        txtMoney.setText("" + df.format(user.getMoney() + worth) + "$");
    }
}
