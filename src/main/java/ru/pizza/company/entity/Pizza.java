package ru.pizza.company.entity;

public class Pizza {
   private int price;
   private String name;
   private String description;
   private String picture;



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Pizza(int price, String name, String description, String picture) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.picture = picture;
    }


}
