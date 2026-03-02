package org.example;

import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, "red");
        Apple appleGreen = new Apple(8, 60, "green");

        Food[] foods1 = {meat, appleRed, appleGreen};

        ShoppingCart basket = new ShoppingCart(foods1);
        System.out.println("Общая сумма товаров без скидки: " + basket.getTotalAmount());
        System.out.println("Общая сумма товаров со скидкой: " + basket.getTotalAmountDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + basket.getVegetarianTotalAmount());
    }
}