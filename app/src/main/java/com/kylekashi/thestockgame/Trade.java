package com.kylekashi.thestockgame;

import android.util.Log;

/**
 * Created by Kyle on 24.01.2018.
 */

public class Trade {

    public static void trade(User user, Stock stock) {
        stock.setAmount(stock.getAmount() + 1);
        user.setMoney(user.getMoney() - stock.getStockPrice());
//        Log.i("forsen", "C");
    }
}
