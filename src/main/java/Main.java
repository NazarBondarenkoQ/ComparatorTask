package main.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 1, 4, 3, 5, 7, 6));
        Set<Integer> set = new TreeSet<>(new MyComparator());
        set.addAll(numbers);
        System.out.print(set + " ");
    }
}
