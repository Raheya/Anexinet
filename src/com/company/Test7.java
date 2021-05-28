package com.company;

public class Test7 {
    public static void main(String[] args) {
        int value1 =10;
        int value2 = 30;
        while (value2 != 0){
            int bag = (value1 & value2);
            value1 = value1 ^value2;
            value2 = bag << 1;
        }
        System.out.println(value1);
    }
}
