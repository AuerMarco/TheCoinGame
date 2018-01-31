package com.kylekashi.thestockgame;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kyle on 24.01.2018.
 */

public class PriceChange {

    public static void rng(ArrayList<Stock> stocks) {
        Random r = new Random();
        for (Stock stock : stocks) {
            upsAndDowns(stock, 0.6 + (1.48 - 0.6) * r.nextDouble());
        }
    }

    public static void upsAndDowns(Stock stock, double percent) {
        stock.setStockPrice(stock.getStockPrice() * percent);
//        Log.i("forsen", "R");
    }

    public static void rise20Percent(Stock stock) {
        stock.setStockPrice(stock.getStockPrice() * 1.2);
//        Log.i("forsen", "R");
    }

    public static void drop20Percent(Stock stock) {
        stock.setStockPrice(stock.getStockPrice() * 0.8);
//        Log.i("forsen", "D");
    }
}
