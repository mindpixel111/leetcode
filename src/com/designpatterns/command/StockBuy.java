package com.designpatterns.command;

public class StockBuy implements Order{
    private Stock stock;

    public StockBuy(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.buy();
    }
}
