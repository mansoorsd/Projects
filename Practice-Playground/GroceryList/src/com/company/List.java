package com.company;



import java.util.ArrayList;

public class List {
    private int cost;
    private ArrayList<GroceryDetail> myGroceryDetails;

    public boolean addItem(GroceryDetail grocerydetail) {
        if (findGrocery(grocerydetail.getGroceryName())) {
            System.out.println("Contact is already on file");
            return false;
        }

       myContacts;
        myContacts.add(contact);
        return true;

    }


    private boolean findGrocery(GroceryDetail grocerydetail) {
        return this.myGroceryDetails.indexOf(grocerydetail);
    }

}
