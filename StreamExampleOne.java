package com.telran.project.streamexample;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExampleOne {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Toyota");
        stringList.add("Porsche");
        stringList.add("Volkswagen");
        stringList.add("Porsche");
        stringList.add("Opel");
        stringList.add("Suzuki");
        stringList.add("Volkswagen");
        long count = stringList.stream().distinct().count();
        System.out.println("Count without double : " + count);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("yellow");
        stringSet.add("red");
        stringSet.add("black");
        stringSet.add("white");
        stringSet.add("green");
        List<String> collect = stringSet.stream().filter(s -> s.contains("l")).collect(Collectors.toList());
        System.out.println("New List with letter l : " + collect);

        int[] nums = {3, 6, 4, 12, 4, -9, 12, 42};
        long countOne = Arrays.stream(nums).distinct().count();
        System.out.println("Count numbers without double : " + countOne);

        String[] strings = {"Book", "Look", "Mouse", "House", "Pool", "Steak", "Food"};
        List<String> oo = Arrays.stream(strings).filter(s -> s.contains("oo")).collect(Collectors.toList());
        System.out.println("New List with double oo letters : " + oo);
    }

}
