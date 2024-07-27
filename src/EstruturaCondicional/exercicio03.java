package EstruturaCondicional;

import java.util.Scanner;
// Lendo 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

public class exercicio03 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");

        int A , B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0 ) {
            System.out.println("SÃO MULTIPLOS");
        } else {

            System.out.println("NÃO SÃO MULTIPLOS");
        }


    }
}
