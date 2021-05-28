package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String [] args){
        Integer [] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Integer [] b = {3,2,9,3,7,11,15,13,23,27,32,35,36,37};
        Integer [] c = {1,3,5,7,11,13,15,17,19,21,23,27,35,37};
        Integer [] d = {9,17,32,7,2,3,1,45,46,47,55,60,6,17};

        List<Integer> lista = Arrays.asList(a);
        List<Integer> listb = Arrays.asList(b);
        List<Integer> listMiddle = lista.stream().filter(listb::contains).collect(Collectors.toList());
        List<Integer> listc = Arrays.asList(c);
        List<Integer> listd = Arrays.asList(d);
        List<Integer> listLast = listc.stream().filter(listd::contains).collect(Collectors.toList());

        List<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(5);
        listA.add(3);
        listA.add(4);

        List<Integer> listB = new ArrayList<>();
        listB.add(1);
        listB.add(5);
        listB.add(6);
        listB.add(7);
        System.out.println(listMiddle.stream().filter(listLast::contains).collect(Collectors.toList()));


    }
}
