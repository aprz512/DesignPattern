package com.aprz.iterator;


import com.aprz.log.Log;

/**
 * Created by aprz on 17-1-3.
 * --
 * 一种用 数组 实现的菜单
 */
public class CakeHouseMenu {

    private MenuItem[] menuItems;
    private int index;
    private static final int MAX = 6;

    public CakeHouseMenu() {
        this.menuItems = new MenuItem[3];
        addMenuItem("342", "34242", false, 23.45);
        addMenuItem("342", "34242", false, 23.45);
        addMenuItem("342", "34242", false, 23.45);
        addMenuItem("342", "34242", false, 23.45);
    }

    public void addMenuItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem();
        item.setName(name);
        item.setDescription(description);
        item.setVegetarian(vegetarian);
        item.setPrice(price);
        if (index >= MAX) {
            Log.E("array full .......");
        } else {
            menuItems[index] = item;
            index++;
        }
    }

}
