package org.example.Herança;

public class Programa {
    public static void main(String[] args) {
        Conta acc = new Conta(1001, "Alex", 0.0);
        BusinessConta bacc = new BusinessConta(1023, "Maira", 0.0, 300.0);

        // UPCASTING
        Conta acc1 = bacc; // Atribui um objeto da subclasse para a superclasse
        Conta acc2 = new BusinessConta(1233, "Maicon", 0.0, 390.0);

        // Exemplo de uso
        acc1.deposito(500.0); // Depositando na conta empresarial
        System.out.println("Saldo de " + acc1.getTitular() + ": " + acc1.getBalanco());
    }
}
