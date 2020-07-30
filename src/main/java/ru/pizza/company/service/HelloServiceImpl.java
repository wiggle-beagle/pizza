package ru.pizza.company.service;

import org.springframework.stereotype.Service;
import ru.pizza.company.entity.Pizza;
import ru.pizza.company.entity.UserResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class HelloServiceImpl implements HelloService {

    public List<String> getPizzaNames() {
        Map<String, Pizza> pizzas = PizzaRepository.getPizzaMap();
        return new ArrayList<String>(pizzas.keySet());
    }

    public Pizza getPizzaByName(String pizzaName) {
        return PizzaRepository.getPizzaByName(pizzaName);
    }

    public UserResponse buyPizza(String pizzaName, int money) {
        UserResponse userResponse = new UserResponse();

        Pizza pizza = PizzaRepository.getPizzaByName(pizzaName);
        if (money > pizza.getPrice()){
            userResponse.setSurrender(money-pizza.getPrice());
            userResponse.setMessage("Ура! Вы купили пиццу " + pizzaName+ ". Ваша сдача - ");
        }
        if (money == pizza.getPrice()){
            userResponse.setSurrender(money-pizza.getPrice());
            userResponse.setMessage("Ура! Вы купили пиццу " + pizzaName+ ". Ваша сдача - ");
        }

        if (money < pizza.getPrice()){
            userResponse.setMessage("Вам не хватило денег на " + pizzaName+ ". Ваша сдача - ");
        }

        return userResponse;
    }


}
