package com.example.demo;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
public class DemoListTest {


    @Test
    public void listtest() {

        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        System.out.println(numbersList);

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList);

        ArrayList<Integer> integers = new ArrayList<>(hashSet);
        System.out.println(integers);
    }

    @Test
    public void streamtest() {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        System.out.println(numbersList);

        List<Integer> listWithoutDuplicates = numbersList.stream().distinct().collect(Collectors.toList());

        System.out.println(listWithoutDuplicates);
    }

    @Test
    public void hashsettest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("2");
        list.add("3");
        HashSet<String> set = new HashSet<String>(list.size());
        List<String> result = new ArrayList<String>(list.size());
        for (String str : list) {
            if (set.add(str)) {
                result.add(str);
            }
        }
        list.clear();
        list.addAll(result);
        System.out.println(list);
    }


}
