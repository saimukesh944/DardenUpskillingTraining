package com.example.controller;

import org.springframework.web.client.RestTemplate;

public class RestController {
    public static void main(String[] args) {

        String baseUrl = "http://localhost:8081"; // Update with your actual server URL

        RestTemplate restTemplate = new RestTemplate();

        double resultAdd = restTemplate.getForObject(baseUrl + "/calculator/add?num1=5&num2=3", Double.class);
        System.out.println("Addition Result: " + resultAdd);

        double resultSubtract = restTemplate.getForObject(baseUrl + "/calculator/subtract?num1=5&num2=3", Double.class);
        System.out.println("Subtraction Result: " + resultSubtract);

        double resultMultiply = restTemplate.getForObject(baseUrl + "/calculator/multiply?num1=2&num2=4", Double.class);
        System.out.println("Multiplication Result: " + resultMultiply);

        double resultDivide = restTemplate.getForObject(baseUrl + "/calculator/divide?num1=10&num2=2", Double.class);
        System.out.println("Division Result: " + resultDivide);

        double resultSqrt = restTemplate.getForObject(baseUrl + "/calculator/sqrt?num=25", Double.class);
        System.out.println("Square Root Result: " + resultSqrt);
    }
}

