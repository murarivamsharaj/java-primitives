package com.java.oop.streams;

import java.util.Arrays;
import java.util.List;

public class Stream {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(15, 30, 5, 40, 10);

        int max = numbers.stream()
                .max(Integer::compare)
                .get();

        System.out.println("Maximum = " + max);

    }
}
