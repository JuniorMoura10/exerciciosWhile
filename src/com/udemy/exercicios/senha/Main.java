package com.udemy.exercicios.senha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha invalida");
            // pedir para inserir a senha novamente, para evitar loop infinito.
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

    }
}
