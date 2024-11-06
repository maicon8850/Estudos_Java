package Heranca_e_Polimorfismo;

public abstract class Contribuinte {
    private String nome;
    private Double rendaAnual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public Contribuinte(){

    }
    public Contribuinte( String nome, Double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }
// herança total sig. qe não vou isntanciar um objeto da superclasse
    public abstract double imposto();
}
