package org.example.ComposicaoDeObjeto;

public class Departamento {

    private String nome;

    // Construtor sem argumentos (padrão)
    public Departamento() {
    }

    // Construtor com argumento (nome)
    public Departamento(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { // se eu quiser alterar o valor do atributo
        this.nome = nome;
    }

    // toString para exibir o nome do departamento
    @Override
    public String toString() {
        return "Departamento: " + nome;
    }
}
