package com.galvanize.demo;

import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MathService {

    public static String MathCalculator(String operation, int x, int y) {
        if (operation.equals("add")) {
            int sum = x + y;
            return String.format("%d + %d = " + sum, x, y);
        } else if (operation.equals("subtract")) {
            int difference = x - y;
            return String.format("%d - %d = " + difference, x, y);
        } else if (operation.equals("multiply")) {
            int product = x * y;
            return String.format("%d * %d = " + product, x, y);
        } else if (operation.equals("divide")) {
            int quotient = x / y;
            return String.format("%d / %d = " + quotient, x, y);
        }
        return "nothing";
    }

    public static String sumValues(MultiValueMap<String, String> n) {
        int sum = 0;
        String toPrint = "";

        Set<String> keys = n.keySet();
        List<String> listToPrint = new ArrayList<>();

        for (String key : keys) {
            listToPrint = (List<String>) n.get(key);
        }

        for (int i = 0; i < listToPrint.size(); i++) {
            sum += Integer.valueOf(listToPrint.get(i));
        }

        for (int i = 0; i < listToPrint.size(); i++) {
            if (i == listToPrint.size() - 1) {
                toPrint += (listToPrint.get(i) + " ");
            } else {
                toPrint += (listToPrint.get(i) + " + ");
            }
        }
        return toPrint += "= " + sum;
    }

}
