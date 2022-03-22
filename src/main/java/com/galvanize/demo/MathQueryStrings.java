package com.galvanize.demo;


import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
public class MathQueryStrings {


    @GetMapping("/math/calculate") //completed #1
    public String operation(@RequestParam(defaultValue = "add") String operation, @RequestParam int x, @RequestParam int y) {
        return MathService.MathCalculator(operation, x, y);
    }

    @PostMapping("/math/sum")
    public String operation(@RequestParam MultiValueMap<String, String> n) {
        return MathService.sumValues(n);
    }
}


