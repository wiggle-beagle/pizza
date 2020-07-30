package ru.pizza.company.service;

import ru.pizza.company.entity.Pizza;
import ru.pizza.company.entity.UserResponse;

import java.util.List;

public interface HelloService {

    List<String> getPizzaNames();

    Pizza getPizzaByName(String pizzaName);

    UserResponse buyPizza(String pizzaName, int money);


}
