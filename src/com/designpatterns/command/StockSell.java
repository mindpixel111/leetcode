package com.designpatterns.command;

public class StockSell implements Order{

    private Stock stock;

    public StockSell(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sell();
    }
}
