package exercicio05;

import java.util.Scanner;

//um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
public class quinto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lê o número do funcionário
        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();

        // Lê o número de horas trabalhadas
        System.out.print("Digite o número de horas trabalhadas: ");
        double horas = sc.nextDouble();

        // Lê o valor por hora
        System.out.print("Digite o valor por hora: ");
        double valorPorHora = sc.nextDouble();

        // Calcula o salário
        double salario = horas * valorPorHora;

        // Mostra o número do funcionário e o salário com duas casas decimais
        System.out.printf("Funcionario = %d%nSalario = %.2f%n", numeroFuncionario, salario);

        // Fecha o scanner
        sc.close();
    }
}
