package com.neoteric.RealTimeExampleWithRestaurant;

public class Menu {

    private String name;

   private Double price;


    public Menu(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }


}
