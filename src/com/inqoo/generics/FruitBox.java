package com.inqoo.generics;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void putFruit(T fruit) {
        fruits.add(fruit);
    }
    public List<T> getFruits() {
        return fruits;
    }
}
