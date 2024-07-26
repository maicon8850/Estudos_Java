package exercicio02;

import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

public class segundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();

        soma = A + B;

        System.out.println("A soma de A e B = " + soma);
    }
}
