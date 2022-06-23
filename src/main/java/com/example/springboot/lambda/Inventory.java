package com.example.springboot.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
enum Color {RED, GREEN}


@Data
@AllArgsConstructor
class Apple {
    private Color color;
    private int weight;
}

public class Inventory {

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight()> weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Inventory fp = new Inventory();
        List<Apple> allApples = new ArrayList<>();
        allApples.add(new Apple(Color.GREEN, 200));
        allApples.add(new Apple(Color.RED, 120));
        List<Apple> list = Inventory.filterApplesByColor(allApples, Color.RED);
        System.out.println(list);
        list = Inventory.filterApplesByWeight(allApples, 150);
        System.out.println(list);
    }
}
