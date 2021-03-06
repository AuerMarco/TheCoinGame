package com.kylekashi.thestockgame;

import java.text.DecimalFormat;

/**
 * Created by Kyle on 24.01.2018.
 */

public class Stock {
    private String stockName;
    private double stockPrice;
    private int amount;

    public Stock(String stockName, double stockPrice, int amount) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.amount = amount;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        if (stockPrice > 0) {
            this.stockPrice = stockPrice;
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount >= 0) {
            this.amount = amount;
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return stockName + " Current price: " + df.format(stockPrice) + "$\nOwned: " + amount + " Worth: " + df.format((amount * stockPrice));
    }
}
