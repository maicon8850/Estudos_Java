package org.example.Herança.Sobreposicao;

public class Programa {
    public static void main(String[] args) {
        // Instanciando objetos
        Funcionario funcionario = new Funcionario("João", 2000.0);
        Gerente gerente = new Gerente("Maria", 3000.0, 500.0); // 500 de bônus
        Vendedor vendedor = new Vendedor("Pedro", 2500.0, 0.1); // 10% de comissão

        // Exibindo pagamentos
        System.out.println("Nome: " + funcionario.getNome() + ", Cargo: Funcionário, Pagamento: " + funcionario.calcularPagamento());
        System.out.println("Nome: " + gerente.getNome() + ", Cargo: Gerente, Pagamento: " + gerente.calcularPagamento());
        System.out.println("Nome: " + vendedor.getNome() + ", Cargo: Vendedor, Pagamento: " + vendedor.calcularPagamento());
    }
}
