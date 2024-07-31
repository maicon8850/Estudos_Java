package EstrututaDeRepetição;

import java.util.Scanner;

// Nesse programa eu usei o metodo while para ler quando os
//valores vão estar em ordem crescente ou decrescente

public class exericio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // fazer a leitura dos dados

        int x , y;
        x = sc.nextInt();
        y = sc.nextInt();
         while ( x != y ) {

            if ( x < y ) {
                System.out.println( "Crescente");
            }
            else  {
                System.out.println("Decrescente");

            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();

    }

}
