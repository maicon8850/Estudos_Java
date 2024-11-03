package org.example.Herança;

public class Conta {
    private Integer numero;
    private String titular;
    private Double balanco;

    // Construtor padrão
    public Conta() {
    }

    // Construtor com parâmetros
    public Conta(Integer numero, String titular, Double balanco) {
        this.numero = numero;
        this.titular = titular;
        this.balanco = balanco;
    }

    // Getters e Setters
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getBalanco() {
        return balanco;
    }

    public void setBalanco(Double balanco) {
        this.balanco = balanco;
    }

    // Método para realizar um depósito
    public void deposito(Double valor) {
        if (valor > 0) {
            this.balanco += valor;
        } else {
            System.out.println("Valor do depósito precisa ser positivo.");
        }
    }
}