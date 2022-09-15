package com.telran.project.streamexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Метод выводит на консоль все числа которые меньше заданного value.
public class StreamExampleTwo {
    public static void main(String[] args) {
        Integer[] array = {4, 1, 4, 6, 8, 9, 0, 3, 1, 5, 4, 6, 2, 3};
        StreamExampleTwo streamExampleFour = new StreamExampleTwo();
        List<Integer> integerList = streamExampleFour.getIntegerList(array, 4);
        System.out.println(integerList);
        List<Integer> integerListWithStream = streamExampleFour.getIntegerListWithStream(array, 4);
        System.out.println(integerListWithStream);

    }

    private List<Integer> getIntegerList(Integer[] array, int value) {
        List<Integer> integerList = new ArrayList<>();
        for (int i : array) {
            if (i < value) {
                integerList.add(i);
            }
        }
        return integerList;
    }

    private List<Integer> getIntegerListWithStream(Integer[] array, int value) {
        List<Integer> collect = Arrays.stream(array).filter(element -> element < value).collect(Collectors.toList());
        return collect;
    }

}