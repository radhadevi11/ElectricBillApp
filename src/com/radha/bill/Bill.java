package com.radha.bill;

public class Bill {
    private Integer id;//primary key
    private Customer customer;
    private String billId;
    private int unit;//no of unit used in this month
    private double amount;//the total amount for unit

    public Bill (Customer customer, String billId, int unit){
        this(null,customer,billId,unit);
    }
    public Bill (Integer id, Customer customer, String billId, int unit){
        this.id = id;
        this.customer = customer;
        this.billId = billId;
        this.unit = unit;
    }
    public Integer getId(){
        return this.id;
    }
    public Customer getCustomer(){
        return this.customer;
    }
    public String getBillId(){
        return this.billId;
    }
    public int getUnit(){
        return this.unit;
    }
    public double getAmount(){
        return this.amount;
    }
    public void setAmount(){
        /*Algorithm
        Step 1:if this unit range is 1-100 then return 0(no amount for first
               100 unit)
        step 2:if this unit range is 101-200 then for first 100 unit amount is 0
                one unit cost from the range of 101-200 is 2 so return (100*1)=>100
        step 3:if the unit range is 201-300 then for first 100 unit amount is 0
                one unit cost from the range of 101-200 is 2 so (100*1)=>100
                one unit cost from the range of 201-300 is 3 so (100*2)=>200
                return 300
                eg:230=>1-100=>0 101-200=>100 201-230=>60
                total amount = 160
        */
        double totalAmount = 0;
        int unit = this.unit;
        int i;
        for(i = 0; unit > 100; i++  ){
            unit = unit - 100;
            totalAmount = totalAmount + (100 * i);
        }
        this.amount =  totalAmount + (unit * (i+1));

    }
}
