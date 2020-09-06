package com.company;

public class Main {

    public static void main(String[] args) {

        int deposit;
        deposit = 100;
        int amount;
        amount = 1001; // Zdesy podstavlyaem lyuboe tseloe chislo
        int sum = (amount + deposit);
        int bonus;
        bonus = ((amount + deposit) * 1 / 100);

        if (sum > 1100) {
            System.out.println(bonus);
        } else {
            System.out.println(0);
        }

    }
}