package com.company;

public class GroceryDetail {
    private String groceryName;
    private int cost;

    public GroceryDetail(String groceryName, int cost) {
        this.groceryName = groceryName;
        this.cost = cost;
    }

    public GroceryDetail getGroceryName() {
        return groceryName;
    }

    public int getCost() {
        return cost;
    }

    public static GroceryDetail createGroceryDetail(String name, int cost){
        return new GroceryDetail(name,cost);
    }
}
