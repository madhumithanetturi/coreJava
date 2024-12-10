package com.neoteric.RealTimeExampleWithRestaurant;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public List<Map.Entry<Menu, Long>> getMostSoldItems() {
        return ordersList.stream()
                .collect(Collectors.groupingBy(Orders::getItems, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .limit(1)
                .collect(Collectors.toList());
    }


    public DayOfWeek getMostPopularDay() {
        return ordersList.stream()
                .collect(Collectors.groupingBy(order -> order.getDate().getDayOfWeek(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}
