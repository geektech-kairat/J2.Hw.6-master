package com.company;

public class Main {

    public static void main(String[] args) {
        Calculate<Integer> c = new Calculate<>();
        System.out.println("Сумма 4 и 6: "+c.addition(4,6));
        System.out.println("Вычитание 4 и 6: "+c.subtract(4,6));
        System.out.println("Умножение 4 и 6: "+c.multiplication(4,6));
        System.out.println("Деление 4 и 6: "+c.division(4,6));
    }
}
