package Calculos;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        float n1;
        float n2;

        // Entrada
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o primeiro número?");
        n1 = input.nextInt();
        System.out.println("Qual o segundo número?");
        n2 = input.nextInt();

        // Saida
        System.out.println("Soma: "+(n1+n2));
        System.out.println("Subtração: "+(n1-n2));
        System.out.println("Multiplicação: "+(n1*n2));
        System.out.println("Divisão: "+(n1/n2));
    }

}
