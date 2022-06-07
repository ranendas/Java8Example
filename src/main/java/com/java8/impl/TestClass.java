package com.java8.impl;

import com.java8.data.DataRepository;
import com.java8.dto.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String args[]){
        List<Employee> list =  DataRepository.getData();

        List<Employee> ageList = list.stream().filter(emp-> Integer.valueOf(emp.getAge())>45).collect(Collectors.toList());
        ageList.forEach(System.out::println);
        //filter and map in pipeline
        list.stream().filter(emp-> emp.getName().startsWith("S")).map(e->e.getName().toUpperCase()).forEach(System.out::println);
        System.out.println("\n");
        //sorted
        list.stream().map(e->e.getName()).sorted().forEach(System.out::println);
        System.out.println("\n");
        System.out.println(list.stream().filter(e-> e.getName().startsWith("C")).findFirst().get());
        System.out.println("\n");
        list.stream().filter(e-> e.getName().startsWith("C")).toList().forEach(System.out::println);
        System.out.println("\n");
        List<String> phoneNoList = list.stream().flatMap(e->e.getContactNumber().getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNoList);



    }
}
