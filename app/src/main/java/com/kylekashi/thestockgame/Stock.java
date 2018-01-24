package com.kylekashi.thestockgame;

/**
 * Created by Kyle on 24.01.2018.
 */

public class Stock {
    private String stockName;
    private double stockPrice;
    private double amount;

    public Stock(String stockName, double stockPrice, double amount) {
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        }
    }

    @Override
    public String toString() {
        return stockName + " Current price: " + stockPrice + "\nOwned: " + amount + " Worth: " + amount * stockPrice;
    }
}
