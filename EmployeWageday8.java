package com.oops.wage;

public class EmployeWageday8 {
    public static void main(String[] args) {


        int fulltime = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == fulltime) {
            System.out.println("Emp is Present");
        } else
            System.out.println("Emp is absent");
    }

}