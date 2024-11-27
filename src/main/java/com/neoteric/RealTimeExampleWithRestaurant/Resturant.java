package com.neoteric.RealTimeExampleWithRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Resturant {

    private String name;

    private List<Menu> menuList;

    private  List<Orders> ordersList;


    public Resturant(String name, List<Menu> menuList ) {
        this.name = name;
        this.menuList = menuList;
        this.ordersList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void add(Orders orders){
        this.ordersList.add(orders);
    }
}
