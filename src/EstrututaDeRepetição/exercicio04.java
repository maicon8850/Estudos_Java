package EstrututaDeRepetição;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int senha;
        senha = sc.nextInt();

        while ( senha != 2002 ) {
            System.out.println("Senha incorreta");
            senha = sc.nextInt();
        }

    sc.close();

    }

}
