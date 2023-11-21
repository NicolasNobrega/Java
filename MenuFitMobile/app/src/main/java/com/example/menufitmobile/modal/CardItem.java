package com.example.menufitmobile.modal;
// CardItem.java
public class CardItem {

    private String name;
    private String description;
    private int calories;
    private String imageURL;

    public CardItem(String name, String description, int calories, String imageURL) {
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }

    public String getImageURL() {
        return imageURL;
    }
}
