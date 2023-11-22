package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
    public class CalculatorController {

        @GetMapping("/add")
        public double add(@RequestParam double num1, @RequestParam double num2) {
            return num1 + num2;
        }

        @GetMapping("/subtract")
        public double subtract(@RequestParam double num1, @RequestParam double num2) {
            return num1 - num2;
        }

        @GetMapping("/multiply")
        public double multiply(@RequestParam double num1, @RequestParam double num2) {
            return num1 * num2;
        }

        @GetMapping("/divide")
        public double divide(@RequestParam double num1, @RequestParam double num2) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
        }

        @GetMapping("/sqrt")
        public double sqrt(@RequestParam double num) {
            if (num >= 0) {
                return Math.sqrt(num);
            } else {
                throw new IllegalArgumentException("Cannot find square root of a negative number");
            }
        }
    }


