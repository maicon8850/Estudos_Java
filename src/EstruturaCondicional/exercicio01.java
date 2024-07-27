package EstruturaCondicional;

import java.util.Scanner;
// uso do if else , vou mostrar na tela nota de aluno se for
// reprovado, ou nota final caso aprovado

public class exercicio01 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        double nota1  = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;

        System.out.printf("NOTA FINAL= %.1f%n",notaFinal);

        if (notaFinal < 60){
            System.out.println("REPROVADO");
        }

        sc.close(); // fechar o arquivo

    }
}
