package org.example.Herança.Sobreposicao;

public class Gerente extends Funcionario {
    private Double bonus;

    public Gerente(String nome, Double salarioBase, Double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public Double calcularPagamento() {
        return super.calcularPagamento() + bonus; // Salário base + bônus
    }
}
