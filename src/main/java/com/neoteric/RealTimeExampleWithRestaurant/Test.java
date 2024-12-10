package com.neoteric.RealTimeExampleWithRestaurant;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Menu manchuria = new Menu("manchuria",250.0);
        Menu babyCorn = new Menu("babyCorn",300.0);
        Menu chickenFry = new Menu("chickenFry",500.0);
        Menu fishFry = new Menu("fishFry",900.0);
        Menu prawns = new Menu("prawns",600.0);
        List<Menu> menus= Arrays.asList(manchuria,babyCorn,chickenFry,fishFry,prawns);
Resturant resturant = new Resturant("Madhu & Daughters",menus);
resturant.add(new Orders(manchuria , LocalDate.of(2024,8,19)));
resturant.add(new Orders(babyCorn , LocalDate.of(2024,8,20)));
resturant.add(new Orders(chickenFry , LocalDate.of(2024,8,22)));
resturant.add(new Orders(fishFry , LocalDate.of(2024,8,23)));
resturant.add(new Orders(prawns, LocalDate.of(2024,8,24)));
        resturant.add(new Orders(chickenFry , LocalDate.of(2024,8,25)));
        resturant.add(new Orders(babyCorn , LocalDate.of(2024,8,26)));
        resturant.add(new Orders(manchuria , LocalDate.of(2024,8,28)));
        resturant.add(new Orders(manchuria , LocalDate.of(2024,8,27)));

        System.out.println("Top sold Items: ");
        resturant.getMostSoldItems().forEach(entry ->
                System.out.println(entry.getKey().getName() + " -Sold: " + entry.getValue()));

        DayOfWeek mostPopularDay = resturant.getMostPopularDay();
        System.out.println("Most popular days for orders: " + mostPopularDay);




    }


}