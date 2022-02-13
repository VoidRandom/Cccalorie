package com.red.cccaloriebackend.beans;

public class FoodBean {
    private int foodId;
    private String foodName;
    private int foodCalorie;

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodCalorie() {
        return foodCalorie;
    }

    public void setFoodCalorie(int foodCalorie) {
        this.foodCalorie = foodCalorie;
    }
}
