package org.example.Herança;

public class BusinessConta extends Conta {

    private Double limiteDeEmprestimo;

    public BusinessConta() {
        super();
    }

    public BusinessConta(Integer numero, String titular, Double balanco, Double limiteDeEmprestimo) {
        super(numero, titular, balanco); // referencia os construtores da classe principal
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    // Getter para limiteDeEmprestimo
    public Double getLimiteDeEmprestimo() {
        return limiteDeEmprestimo;
    }

    // Setter para limiteDeEmprestimo
    public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }
    public void emprestimo( double quantia){
        if (quantia <= limiteDeEmprestimo){

        }
        deposito(quantia);

    }
}
