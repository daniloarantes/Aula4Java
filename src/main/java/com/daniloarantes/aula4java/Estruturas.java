/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniloarantes.aula4java;

import java.util.Scanner;

/**
 *
 * @author Danilo Arantes <danilo at daniloarantes.com>
 */
public class Estruturas {

    Scanner scan = new Scanner(System.in);

    public void exemplo01() {
        if (5 < 10) {
            System.out.println("5 é menor do que 10!");
        }
    }

    public void exemplo02(int idade) {
        // Implementar o método para verificar
        // se a pessoa é maior de idade.
        // Peça para o usuário informar a idade
        // e acione este método.
        if (idade < 18) {
            System.out.println("Você é menor de idade");
        } else {
            System.out.println("Você é maior de idade");
        }
    }

    public void exemplo03(int idade, String genero) {
        if (idade > 18) {
            System.out.println("Você é maior de idade");
        } else if ("masculino".equals(genero)) {
            System.out.println("Genero: Masculino");
        } else if ("feminino".equals(genero)) {
            // "feminino" == "feminino"
            System.out.println("Genero: Feminino");
        } else {
            System.out.println("Nenhuma informação definida.");
        }
    }

    public void exemplo04() {

        System.out.println("Digite um número: ");
        int n = scan.nextInt();

        while (n > 0) {
            System.out.println("Número: " + n);
            n--;
        }
    }

    public void exemplo05() {
        boolean teste = true;

        while (teste) {
            System.out.println("Digite um número");
            int n = scan.nextInt();

            if (n == 5) {
                System.out.println("Você adivinhou o número!");
                teste = false;
            }

        }
    }

    public void exemplo06() {

        do {
            System.out.println("Linha executada somente uma vez");
        } while (false);

    }

    public void exemplo07() {
        boolean teste = true;

        do {
            System.out.println("Digite seu nome:");
            String nome = scan.nextLine();

            if (!"".equals(nome)) {
                teste = false;
            }

        } while (teste);
    }

    public void exemplo08() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando: " + i);
        }
    }

    public void exemplo09(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Contando: " + i);
        }
    }
    
    public void exemplo10(String nome){
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
    }
    
    public void exemplo11(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Escreva 100x");
            }
        }
    }

}
