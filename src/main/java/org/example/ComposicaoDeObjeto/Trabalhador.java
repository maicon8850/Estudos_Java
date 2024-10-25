package org.example.ComposicaoDeObjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Date;  // Esta linha deve estar no início da classe Trabalhador


public class Trabalhador {

    private String nome;
    private String nivelTrabalhador; // Corrigido para seguir a convenção camelCase
    private double baseSalario; // Corrigido para seguir a convenção camelCase

    // Associações
    private Departamento departamento; // Renomeado para 'departamento' para clareza
    private List<ContratoPorHora> contratos = new ArrayList<>(); // Para ter a lista de contratos

    // Construtor
    public Trabalhador(String nome, String nivelTrabalhador, double baseSalario, Departamento departamento) {
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

    public String getNivelTrabalhador() {
        return nivelTrabalhador;
    }

    public void setNivelTrabalhador(String nivelTrabalhador) {
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
        double sum = baseSalario; // Começa com o salário base

        // Itera sobre os contratos
        for (ContratoPorHora c : contratos) {
            // Obtém a data do contrato
            Date contratoDate = c.getDate();

            // Usa o Calendar para extrair ano e mês da data do contrato
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(contratoDate);
            int c_ano = calendar.get(Calendar.YEAR);
            int c_mes = calendar.get(Calendar.MONTH) + 1; // Janeiro é 0, então somamos 1

            // Verifica se o contrato é do ano e mês especificados
            if (c_ano == ano && c_mes == mes) {
                sum += c.totalHora(); // Adiciona o total ganho com o contrato ao total
            }
        }

        return sum; // Retorna o total
    }
}
