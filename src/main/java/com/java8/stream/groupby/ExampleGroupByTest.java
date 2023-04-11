package com.java8.stream.groupby;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleGroupByTest {
    public static void main(String args[]){

        List<Fruit> listOfFruits = Arrays.asList(
                new Fruit("Apple", 1),
                new Fruit("Apple", 3),
                new Fruit("Banana", 2),
                new Fruit("Banana", 2),
                new Fruit("Banana", 5),
                new Fruit("Pear", 0),
                new Fruit("Orange", 4)
        );

        //Stream group by fields
        Map<String, List<Fruit>> collect = listOfFruits
                .stream()
                .collect(Collectors.groupingBy(
                        Fruit::getName
                ));
        System.out.println("Stream group by fields = "+ collect);

        //Stream group by multiple fields
        Map<String, Map<Integer, List<Fruit>>> multipleFields = listOfFruits
                .stream()
                .collect(Collectors.groupingBy(
                        Fruit::getName,
                        Collectors.groupingBy(Fruit::getAmount)
                ));
        System.out.println("Stream group by multiple fields = "+ multipleFields);
        //Stream group by count
        Map<String, Long> grpByCount = listOfFruits
                .stream()
                .collect(Collectors.groupingBy(
                        fruit -> fruit.name,
                        Collectors.counting()
                ));

        System.out.println("Stream group by count = "+ grpByCount);

        //Stream group by count and filter on count
        Map<String, Long> grpByCountAndFilter = listOfFruits
                .stream()
                .collect(Collectors.groupingBy(
                        Fruit::getName,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(fruitLongEntry -> fruitLongEntry.getValue() >= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Stream group by count and filter on count = "+ grpByCountAndFilter);

        //Stream group by sum
        Map<Fruit, Integer> streamingSum = listOfFruits
                .stream()
                .collect(Collectors.groupingBy(
                        fruit -> fruit,
                        Collectors.summingInt(f -> f.amount)
                ));

        System.out.println("Stream group by sum = "+ streamingSum);
        //Stream group by and summarize (count, sum, min, avg, max)
        Map<Fruit, IntSummaryStatistics> summarizingStats = listOfFruits
                .stream()
                .collect(Collectors.groupingBy(
                        fruit -> fruit,
                        Collectors.summarizingInt(f -> f.amount)
                ));
        System.out.println("Stream group by and summarize  = "+ summarizingStats);


    }
}
