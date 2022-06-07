package com.java8.data;

import com.java8.dto.ContactNumber;
import com.java8.dto.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataRepository {

    public static List<Employee> getData(){
        ContactNumber cn1= new ContactNumber("David", Arrays.asList("2018735366", "2018589985"));
        ContactNumber cn2= new ContactNumber("Chris", Arrays.asList("7817859856", "6037857412"));
        ContactNumber cn3= new ContactNumber("Terry", Arrays.asList("7035336987", "7033635896"));
        ContactNumber cn4= new ContactNumber("Sandeep", Arrays.asList("7038157896"));
        ContactNumber cn5= new ContactNumber("Yash", Arrays.asList("6731256547", "6037551235"));
        ContactNumber cn6= new ContactNumber("Shirley", Arrays.asList("2018735366", "2018589985"));
        ContactNumber cn7= new ContactNumber("Despoina", Arrays.asList("2589874563"));
        ContactNumber cn8= new ContactNumber("John", Arrays.asList("8177898521"));
        ContactNumber cn9= new ContactNumber("Condalo", Arrays.asList("2018735366", "7812541236"));
        ContactNumber cn10= new ContactNumber("Daniel", Arrays.asList("2018589977"));
        Employee e1 = new Employee("David","60","david@abc.com","M", cn1);
        Employee e2 = new Employee("Chris","42","david@abc.com","M", cn2);
        Employee e3 = new Employee("Terry","52","david@bac.com","M", cn3);
        Employee e4 = new Employee("Sandeep","48","david@abc.com","M", cn4);
        Employee e5 = new Employee("Yash","32","david@abc.com","M", cn5);
        Employee e6 = new Employee("Shirley","59","david@abc.com","F", cn6);
        Employee e7 = new Employee("Despoina","33","david@abc.com","F", cn7);
        Employee e8 = new Employee("John","35","david@abc.com","M", cn8);
        Employee e9 = new Employee("Condalo","32","david@abc.com","M", cn9);
        Employee e10 = new Employee("Daniel","35","david@abc.com","M", cn10);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
        list.add(e10);
        return list;
    }
}
