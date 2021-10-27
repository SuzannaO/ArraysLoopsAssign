package com.company;

public class SimpleBeverage {
    public enum Beverage {
        ONE_BEER(74), ONE_CIDER(103), PROPER_CIDER(110);

        public int price;
        Beverage(int price) {
            this.price = price;
        }
        public int getPrice() {
            return price;
        }
    }
}