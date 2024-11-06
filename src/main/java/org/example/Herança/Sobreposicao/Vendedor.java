package org.example.Herança.Sobreposicao;

public class Vendedor extends Funcionario {
    private Double comissao; // Percentual de comissão

    public Vendedor(String nome, Double salarioBase, Double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public Double calcularPagamento() {
        return super.calcularPagamento() + (super.calcularPagamento() * comissao); // Salário base + comissão
    }
}
