package com.kylekashi.thestockgame;

import android.util.Log;

/**
 * Created by Kyle on 24.01.2018.
 */

public class PriceChange {

    public static void rise(Stock stock) {
        stock.setStockPrice(stock.getStockPrice() * 1.2);
        Log.i("forsen", "R");
    }

    public static void drop(Stock stock) {
        stock.setStockPrice(stock.getStockPrice() * 0.8);
        Log.i("forsen", "D");
    }
}
