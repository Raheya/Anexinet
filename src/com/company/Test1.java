package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> leapYears = new ArrayList<>();
        for (int i = 2021; i < 2150 ; i++) {
            if ((i % 4 == 0) && ((i % 100 != 0) || (i % 400 == 0)))
                leapYears.add(i);
        }

        System.out.println(Arrays.toString(leapYears.toArray()));

    }
}
