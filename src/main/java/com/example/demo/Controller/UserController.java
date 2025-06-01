package com.example.demo.Controller;

import com.example.demo.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private OrdersRepository ordersRepository;

    public static void main(String[] args) {
        System.out.println("tesst Nhanh");
    }
}
