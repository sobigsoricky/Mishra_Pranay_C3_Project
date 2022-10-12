package org.example;

public class Item {
    private static String name;
    private int price;

    boolean selected = false;

    public Item(String name, int price, boolean selected) {
        this.name = name;
        this.price = price;
        this.selected = selected;
    }

    public static String getName() {
        return name;
    }
    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }
    public int getPrice() {
        return price;
    }


}
