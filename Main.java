package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();


        if (n1 > n2) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("O maior número é: " + n2);
        }

        sc.close();

        int diferenca = n1 - n2;
        System.out.println("Diferença: " + diferenca);

    }

}