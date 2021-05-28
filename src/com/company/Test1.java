package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> leapYears = new ArrayList<>();
        int times =0;
        for (int i = 2021; i < 2150 ; i++) {
            if(times<20) {
                if ((i % 4 == 0) && ((i % 100 != 0) || (i % 400 == 0))) {
                    leapYears.add(i);
                    times++;
                }
            }
        }

        System.out.println(Arrays.toString(leapYears.toArray()));

    }
}
