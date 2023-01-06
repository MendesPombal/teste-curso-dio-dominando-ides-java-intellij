package br.com.dio;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Entre com o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Entre com segundo Número: ");
        num2 = input.nextInt();

        System.out.println("SOMA = " + (num1 + num2));
        System.out.println("SUBTRAÇÃO = " + (num1 - num2));
        System.out.println("MULTIPLICAÇÃO = " + (num1 * num2));
        System.out.println("DIVISÃO = " + (num1 / num2));


    }

}
