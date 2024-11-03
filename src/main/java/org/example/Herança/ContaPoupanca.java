package org.example.Herança;

public class ContaPoupanca extends Conta{
    private Double taxaJuros;

    public ContaPoupanca(){
        super();
    }
    public ContaPoupanca(Integer numero, String titular, Double balanco, Double taxaJuros) {
        super(numero, titular, balanco); // referencia os construtores da classe principal
        this.taxaJuros = taxaJuros;
    }
    // Getter para taxaJuros
    public Double getTaxaJuros() {
        return taxaJuros;
    }

    // Setter para taxaJuros
    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    // Exemplo de método adicional para aplicar juros ao saldo
    public void aplicarJuros() {
        if (taxaJuros != null && getBalanco() != null) {  //teste
            double novoBalanco = getBalanco() + (getBalanco() * taxaJuros);
            setBalanco(novoBalanco);
        }
    }
}