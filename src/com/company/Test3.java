package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        char arrayWord1[] = "amor".toCharArray();
        char arrayWord2[] = "roma".toCharArray();
        Arrays.sort(arrayWord1);
        Arrays.sort(arrayWord2);
        if(new String(arrayWord1).equals(new String(arrayWord2)))
            System.out.println("Its an anagram");
        else
            System.out.println("Its not an anagram");


    }
}
