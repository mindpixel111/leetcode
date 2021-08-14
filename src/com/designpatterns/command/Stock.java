package com.designpatterns.command;

public class Stock {

    private String symbol = "SBIN";
    private int quantity = 100;

    public void buy(){
        System.out.println("Stock [ Name: "+symbol+" ,  Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+symbol+", Quantity: " + quantity +" ] sold");
    }

}
