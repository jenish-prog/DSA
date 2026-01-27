package com.jenish;

public class Conditions {
    public static void main(String[] args) {
        int salary = 10000;

//        if (salary > 25000){
//            salary = salary + 2000;
//        }else{
//            salary = salary + 1000;
//        }
//        System.out.println(salary);

        if (salary > 10000){
            salary += 10000;
        } else if (salary > 20000) {
            salary += 20000;
        }else {
            salary += 500;
        }
        System.out.println(salary);
    }
}