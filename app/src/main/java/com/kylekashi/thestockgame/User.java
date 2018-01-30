package com.kylekashi.thestockgame;

import java.util.ArrayList;

/**
 * Created by Kyle on 24.01.2018.
 */

public class User {

    private double money;
    private ArrayList<Stock> stocks;
    private ArrayList<Trade> history;
    private double profit;

    public User() {
        this.money = 1000;
        this.stocks = null;
        this.history = null;
        this.profit = 0;
    }

    public User(double money, ArrayList<Stock> stocks, double profit) {
        this.money = money;
        this.stocks = stocks;
        this.history = null;
        this.profit = profit;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money >= 0) {
            this.money = money;
        }
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public ArrayList<Trade> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Trade> history) {
        this.history = history;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
            this.profit = profit;
    }
}
