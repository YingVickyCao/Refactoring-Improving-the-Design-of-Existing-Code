package com.hades.example.java.refactoring.after.c10.c10_9_introduce_parameter_object;

public class Example {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.getFlowBetween(new DateRange(new Date(10), new Date(30)))); // 100.0
    }
}