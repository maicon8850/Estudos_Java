package org.example.ComposicaoDeObjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Date;

public class Trabalhador {

    private String nome;
    private TipoEnumerado nivelTrabalhador; // Usando enum em vez de String
    private double baseSalario;

    // Associações
    private Departamento departamento;
    private List<ContratoPorHora> contratos = new ArrayList<>();

    // Construtor
    public Trabalhador(String nome, TipoEnumerado nivelTrabalhador, double baseSalario, Departamento departamento) {
        this.nome = nome;
        this.nivelTrabalhador = nivelTrabalhador;
        this.baseSalario = baseSalario;
        this.departamento = departamento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoEnumerado getNivelTrabalhador() {
        return nivelTrabalhador;
    }

    public void setNivelTrabalhador(TipoEnumerado nivelTrabalhador) {
        this.nivelTrabalhador = nivelTrabalhador;
    }

    public double getBaseSalario() {
        return baseSalario;
    }

    public void setBaseSalario(double baseSalario) {
        this.baseSalario = baseSalario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPorHora> getContratos() {
        return contratos;
    }

    // Adiciona na lista o contrato
    public void addContrato(ContratoPorHora contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(ContratoPorHora contrato) {
        contratos.remove(contrato);
    }

    public double income(int ano, int mes) {
        double sum = baseSalario;

        // Itera sobre os contratos
        for (ContratoPorHora c : contratos) {
            Date contratoDate = c.getDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(contratoDate);
            int c_ano = calendar.get(Calendar.YEAR);
            int c_mes = calendar.get(Calendar.MONTH) + 1;

            // Verifica se o contrato é do ano e mês especificados
            if (c_ano == ano && c_mes == mes) {
                sum += c.totalHora();
            }
        }

        return sum;
    }
}
