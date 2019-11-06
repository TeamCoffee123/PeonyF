package com.company;

public class ItemList {
    String itemName;
    int price;


    public ItemList(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String shopScript() {
        return "[ Name: " + itemName + "\t Price: 정령의 돌 " + price + " 개 \t ]";
    }

}
