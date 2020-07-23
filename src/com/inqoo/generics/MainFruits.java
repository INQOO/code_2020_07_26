package com.inqoo.generics;

import java.util.List;

public class MainFruits {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        fruitBox.putFruit(new Orange());
        fruitBox.putFruit(new Banana());

        List<Fruit> fruits = fruitBox.getFruits();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }
    }
}
