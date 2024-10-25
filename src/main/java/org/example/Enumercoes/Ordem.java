package org.example.Enumercoes;

import java.util.Date;

public class Ordem {

    private Integer id;
    private Date moment;
    private OrdemStatus status;

    // Construtor sem argumentos (padrão)
    public Ordem() {
    }

    // Construtor com argumentos
    public Ordem(Integer id, Date moment, OrdemStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    // toString para exibir os dados da Ordem
    @Override
    public String toString() {
        return "Ordem{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }

}
