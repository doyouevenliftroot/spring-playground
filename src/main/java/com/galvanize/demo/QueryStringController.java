package com.galvanize.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
    public class QueryStringController {
//        @GetMapping("/individual-example")
//        public String getIndividualParams(@RequestMapping String filter) {
//            return String.format("Filter is : %s", filter);
//
//        }



        @GetMapping("/cats")
        public String getCats() {
            return "All the Cats";
        }


        @GetMapping("/dogs")
        public String getDogsSorted(@RequestParam(value = "sort", defaultValue = "name") String sortByThisValue) {
            return String.format("%s is the sort", sortByThisValue);
        }

        @GetMapping("/cows") //Map pulling variables from a Class
        public String getAllQueryStringFromCows(CowSort cows) {
            return cows.toString();
        }

        @GetMapping("/horses/{name}") //path variable
        public String getHorsesByName(@PathVariable String name) {
            return String.format("The name of the horse is %s", name);
        }

    }


