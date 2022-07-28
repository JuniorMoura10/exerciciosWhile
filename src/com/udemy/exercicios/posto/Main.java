package com.udemy.exercicios.posto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Com qual combustível gostaria de abastecer? 1-Alcool;" +
                " 2-Gasolina3-Diesel; 4-Fim: ");

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                alcool = alcool + 1;
            } else if (codigo == 2) {
                gasolina = gasolina + 1;
            } else if (codigo == 3) {
                diesel = diesel + 1;
            }

            System.out.println("Com qual combustível gostaria de abastecer? 1-Alcool;" +
                        " 2-Gasolina3-Diesel; 4-Fim: ");
            codigo = sc.nextInt();

        }
            System.out.println("MUITO OBRIGADO!");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);

            sc.close();

    }
}
