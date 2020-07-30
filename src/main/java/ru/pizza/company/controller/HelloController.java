package ru.pizza.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.pizza.company.entity.Pizza;
import ru.pizza.company.entity.UserResponse;
import ru.pizza.company.service.HelloService;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/index")
    public String getPizzaList(Model model) {
        List<String> pizzas = helloService.getPizzaNames();
        model.addAttribute("pizzaList", pizzas);
        return "hello/index";
    }

    @GetMapping("/hello/pizza/{pizzaName}")
    public String getPizza(Model model, @PathVariable String pizzaName) {
        Pizza pizza = helloService.getPizzaByName(pizzaName);
        model.addAttribute("pizza", pizza);
        return "hello/pizza";
    }
    @GetMapping("/hello/buy")
    public String buy(Model model, @RequestParam String pizzaName, int money) throws UnsupportedEncodingException {
        UserResponse userResponse = helloService.buyPizza(pizzaName, money);
        model.addAttribute("userResponse", userResponse);
        return "hello/buy";
    }


    @PostMapping("/hello/buypizza")
    public String buyPizza(Model model, @RequestParam String pizzaName, int money){
        return "redirect:/hello/buy?" + "pizzaName=" + pizzaName + "&money=" + money;
    }






}
