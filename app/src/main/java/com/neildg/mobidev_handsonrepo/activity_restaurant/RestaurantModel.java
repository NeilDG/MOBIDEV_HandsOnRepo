package com.neildg.mobidev_handsonrepo.activity_restaurant;

/**
 * Represents a S16_RestaurantModel model to be binded to the recycler view
 * Created by NeilDG on 1/27/2018.
 */

public class RestaurantModel {
    private final static String TAG = "RestaurantModel";

    private String name, description;
    private int weight; //to be used for randomization

    public RestaurantModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public RestaurantModel(String name, String description, int weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getWeightString() {
        return Integer.toString(this.weight);
    }
}
