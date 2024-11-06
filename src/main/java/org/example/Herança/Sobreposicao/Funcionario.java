package org.example.Herança.Sobreposicao;

public class Funcionario {
    private String nome;
    private Double salarioBase;

    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public Double calcularPagamento() {
        return salarioBase;
    }
}
