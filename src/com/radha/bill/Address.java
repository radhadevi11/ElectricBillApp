package com.radha.bill;

public class Address {
    private Integer oldDoorNo;
    private int newDoorNo;
    private String street;
    private String city;
    private int pinCode;

    public Address (Integer oldDoorNo,
                    int newDoorNo,
                    String street,
                    String city,
                    int pinCode){
        this.oldDoorNo = oldDoorNo ;
        this.newDoorNo = newDoorNo;
        this.street = street;
        this.city = city;
        this.pinCode = pinCode;

    }

    public Integer getOldDoorNo(){
        return this.oldDoorNo;
    }

    public int getNewDoorNo(){
        return this.newDoorNo;
    }

    public String getStreet(){
        return this.street;
    }

    public String getCity(){
        return this.city;
    }
}
