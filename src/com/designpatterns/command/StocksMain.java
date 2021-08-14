package com.designpatterns.command;

public class StocksMain {

    public static void main(String[] args) {
        Stock stock = new Stock();

        StockBuy buyStockOrder = new StockBuy(stock);
        StockSell sellStockOrder = new StockSell(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
