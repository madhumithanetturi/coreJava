package com.neoteric.RealTimeExampleWithRestaurant;

import java.time.LocalDate;

public class Orders {

    private Menu items;

    private LocalDate date;

    public Orders(Menu items, LocalDate date) {
        this.items = items;
        this.date = date;
    }

    public Menu getItems() {
        return items;
    }

    public LocalDate getDate() {
        return date;
    }

//    public void add(Orders orders) {
//        orders.add(orders);
//    }
}
