package org.example.Enumercoes;

import java.util.Date;

public class Programa {

    public static void main(String [] args) {

      Ordem ordem = new Ordem( 6667, new Date(),OrdemStatus.PAGAMENTO_PENDENTE);

      System.out.println(ordem);


      OrdemStatus ord1 = OrdemStatus.ENTREGUE;



    }
}
