package org.example;

import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, Colour.RED);
        Apple appleGreen = new Apple(8, 60, Colour.GREEN);

        Food[] foods = {meat, appleRed, appleGreen};

        ShoppingCart basket = new ShoppingCart(foods);
        System.out.println("Общая сумма товаров без скидки: " + basket.getTotalAmount());
        System.out.println("Общая сумма товаров со скидкой: " + basket.getTotalAmountDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + basket.getVegetarianTotalAmount());
    }
}