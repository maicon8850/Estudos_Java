package org.example.ComposicaoDeObjeto;

import java.util.Date;

public class ContratoPorHora {
    private Date date;
    private double valorPorHoras;
    private int horas;

    // Construtor sem argumentos (padrão)
    public ContratoPorHora() {
    }

    // Construtor com argumentos
    public ContratoPorHora(Date date, double valorPorHoras, int horas) {
        this.date = date;
        this.valorPorHoras = valorPorHoras;
        this.horas = horas;
    }

    // Getters e Setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValorPorHoras() {
        return valorPorHoras;
    }

    public void setValorPorHoras(double valorPorHoras) {
        this.valorPorHoras = valorPorHoras;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double totalHora() {
        return valorPorHoras * horas;
    }

    // toString para exibir os dados da classe
    @Override
    public String toString() {
        return "ContratoPorHora{" +
                "date=" + date +
                ", valorPorHoras=" + valorPorHoras +
                ", horas=" + horas +
                '}';
    }
}
