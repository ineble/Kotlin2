package com.example.Object;

public class KCustomerAccess{
    public static void main(String [] args){
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login();

    }
}