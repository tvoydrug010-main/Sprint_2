package ru.yandex.praktikum.service;
import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private final Food[] foods;


    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }


    public double getTotalAmount(){
        double total = 0;
        for (Food food : foods){
            if (food != null) {
                total += food.getPrice() * food.getAmount();
            }
        }
        return total;
    }

    public double getTotalAmountDiscount(){
        double total = 0;
        for (Food food : foods){
            if(food != null){
                double priceAfterDiscount = food.getPrice() * (100 - food.getDiscount())/100;
                total += priceAfterDiscount * food.getAmount();
            }
        }
        return total;
    }

    public double getVegetarianTotalAmount(){
        double total = 0;
        for (Food food : foods){
            if (food != null && food.isVegetarian()){
                total += food.getAmount() * food.getPrice();
            }
        }
        return total;
    }
}
