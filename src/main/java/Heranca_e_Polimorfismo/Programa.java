package Heranca_e_Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
  public static void main (String[]args){
      Scanner sc = new Scanner(System.in);

      System.out.println("quantidade de contribuintes:");

      int N = sc.nextInt();

      List<Contribuinte> lista  = new ArrayList<Contribuinte>();

    // uso do polimofismo  //
      for (int i = 1; // i representa o individuo , c representa a compania
            i <= N; i++){
          System.out.print("Contribuinte" + i + "Data:");
          System.out.println("Individuo ou Contribuite (i/c)");

          char tipo = sc.next().charAt(0);  // criando uma variavel 'tipo' char
          System.out.print("Nome:");
          String nome = sc.next();
          System.out.println("Renda anual");
          Double rendaAnual = sc.nextDouble();

          if (tipo == 'i') {
              System.out.print("Despesas de saúde:");
              Double despesasSaude = sc.nextDouble();
              Individuo pessoa1 = new Individuo(nome, rendaAnual, despesasSaude); // Supondo que Individuo é uma subclasse de Contribuinte
              lista.add(pessoa1);
          } else {
              System.out.print("Número de funcionários:");
              Integer numeroDeFuncionario = sc.nextInt();
              Contribuinte contribuinte = new Contribuinte(nome, rendaAnual, numeroDeFuncionario); // Adiciona diretamente o contribuinte
              lista.add(contribuinte);
          }
      }


      sc.close();;
  }
}
