package org.example.ComposicaoDeObjeto;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter departamento nome:");
        String departamentoNome = sc.next();

        System.out.println("Insira o nome do trabalhador:");
        String trabalhadorNome = sc.next();

        System.out.println("Insira o nível do trabalhador (ex: JUNIOR, MID_LEVEL, SENIOR):");
        String trabalhadorNivel = sc.next().toUpperCase();

        System.out.println("Salário:");
        double baseSalario = sc.nextDouble();

        // Presumindo que você tenha um enum chamado TipoEnumerado
        Trabalhador trabalhador = new Trabalhador(
                trabalhadorNome,
                TipoEnumerado.valueOf(trabalhadorNivel), // Converte a String para o enum
                baseSalario,
                new Departamento(departamentoNome)
        );

        sc.close();
    }
}
