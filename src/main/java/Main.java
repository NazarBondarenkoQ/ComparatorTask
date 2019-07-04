package main.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>((Integer a, Integer b) -> {
            if (a % 2 == 0 && b % 2 != 0) {
                return -1;
            } else if (a % 2 != 0 && b % 2 == 0) {
                return 1;
            } else {
                return a - b;
            }
        });
        set.addAll(Arrays.asList(1,2,6,5,4,3,11,12,43,44,61));
        System.out.print(set);
    }
}
