package ru.yandex.praktikum.model;

public abstract class Food implements Discountable{
    protected int amount; //кг
    protected double price; //руб
    protected boolean isVegetarian; //вегетарианское ли?

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getDiscount(){
        return 0;
    }


}
