package EstruturaCondicional;

import java.util.Scanner;
// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

public class exercicio02 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);


        int numero;

        numero = sc.nextInt();

        if (numero % 2 == 0) { // Verifica se o resto da divisão por 2 é zero
            System.out.println("PAR =" + numero);

        } else {

            System.out.println("IMPAR =" + numero);
        }

        sc.close(); // fechar o arquivo

    }
}
