package com.java8.dto;

public class Employee {
    private String name;
    private String age;
    private String email;
    private String gender;
    private ContactNumber contactNumber;

    public Employee(String name, String age, String email, String gender, ContactNumber contactNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ContactNumber getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ContactNumber contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
