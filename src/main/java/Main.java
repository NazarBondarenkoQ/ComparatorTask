package main.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new MyComparator());
        set.addAll(Arrays.asList(2, 1, 4, 3, 5, 7, 6));
        System.out.print(set + " ");
    }
}
