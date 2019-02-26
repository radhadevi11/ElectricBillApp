package com.radha.bill;

public class Customer {
    private Integer id;//primary key
    private String name;
    private int age;
    private Address address;

    public Customer(String name, int age, Address address){
        this(null,name,age,address);

    }

    public Customer(Integer id, String name, int age, Address address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Integer getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public Address getAddress(){
        return this.address;
    }


}
