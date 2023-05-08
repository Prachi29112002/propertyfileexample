package com.sahil.propertyfileexample.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public void method1(String x) {
        System.out.println("Method 1 called, x : " + x);
    }

    public void method2() {
        System.out.println("Method 2 called");
    }
}
