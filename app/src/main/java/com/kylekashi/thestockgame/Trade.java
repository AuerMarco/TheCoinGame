package com.kylekashi.thestockgame;

/**
 * Created by Kyle on 24.01.2018.
 */

public class Trade {

    private String name;
    private double price;
    private double amount;
    private double currentWorth;
    private double oldWorth;

    public Trade(Stock stock, double amount) {
        this.name = stock.getStockName();
        this.price = stock.getStockPrice();
        this.amount = amount;
        this.currentWorth = stock.getStockPrice() * amount;
        this.oldWorth = this.currentWorth;
    }

    public void buy(User user, Stock stock) {
        if (user.getMoney() > 0) {
            stock.setAmount(stock.getAmount() + 1);
            user.setMoney(user.getMoney() - stock.getStockPrice() * amount);
        }
    }

    public static void trade(User user, Stock stock) {
        stock.setAmount(stock.getAmount() + 1);
        user.setMoney(user.getMoney() - stock.getStockPrice());
//        Log.i("forsen", "C");
    }
}
