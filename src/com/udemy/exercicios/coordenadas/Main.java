package com.udemy.exercicios.coordenadas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a coordenada X:");
        int x = sc.nextInt();
        System.out.println("Digite a coordenada Y:");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if(x > 0 && y > 0) {
                System.out.println("primeiro quadrante");
            }else if(x < 0 && y > 0) {
                System.out.println("segundo quadrante");
            }else if(x < 0 && y < 0) {
                System.out.println("terceiro quadrante");
            }else {
                System.out.println("quarto quadrante");
            }

            System.out.println("Digite a coordenada X:");
            x = sc.nextInt();
            System.out.println("Digite a coordenada Y:");
            y = sc.nextInt();
        }
    }
}
