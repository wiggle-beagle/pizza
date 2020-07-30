package ru.pizza.company.service;

import org.springframework.stereotype.Service;
import ru.pizza.company.entity.Pizza;
import ru.pizza.company.service.PizzaRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PizzaRepository {

    private static Map<String, Pizza> pizzaMap = new HashMap<String, Pizza>();

    static {
        pizzaMap.put("Meat", new Pizza(1000, "Meat", "Лучшая пицца", "https://img.povar.ru/main/8e/b1/d4/01/picca_myasnaya-387507.png"));
        pizzaMap.put("Cheese", new Pizza(700, "Cheese", "Лучшая пицца", "https://smak.ua/i/76/48/3/76483/3e5cd1659ea2133d9bb2e251ab1e4b16-allow_enlarge_1Xresize_crop_1Xquality_100Xw_680Xh_510.jpg"));
        pizzaMap.put("Margarita", new Pizza(500, "Margarita", "Лучшая пицца", "https://img09.rl0.ru/eda/c620x415i/s1.eda.ru/StaticContent/Photos/120131111725/120213175555/p_O.jpg"));
    }

    public static Map<String, Pizza> getPizzaMap() {
        return pizzaMap;
    }

    public static Pizza getPizzaByName(final String name) {
        return pizzaMap.get(name);
    }


}
