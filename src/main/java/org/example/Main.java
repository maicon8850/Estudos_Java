package org.example;
import java.util.Scanner;
public class Main { public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double largura = sc.nextDouble();

    double comprimento = sc.nextDouble();

    double metroQuadrado = sc.nextDouble();

    double area = largura * comprimento;
    double preco = area * metroQuadrado;
    System.out.println("Area =" + area);
    System.out.println("Preco ="+ preco);    }
}