package com.example.greetings;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public void greet() {
        System.out.println("Hello !");
    }
}
