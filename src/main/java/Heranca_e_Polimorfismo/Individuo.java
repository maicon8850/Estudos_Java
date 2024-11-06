package Heranca_e_Polimorfismo;

public class Individuo extends Contribuinte{

    public Individuo(Double despesasSaude) {
        DespesasSaude = despesasSaude;
    }

    public Double getDespesasSaude() {
        return DespesasSaude;
    }

    public void setDespesasSaude(Double despesasSaude) {
        DespesasSaude = despesasSaude;
    }

    public Individuo(String nome, Double rendaAnual, Double despesasSaude) {
        super(nome, rendaAnual);
        DespesasSaude = despesasSaude;
    }

    private Double DespesasSaude;
    @Override
    public double imposto() {
       double impostoBasico;
        if (getRendaAnual() < 20000.0){
            impostoBasico = getRendaAnual() * 15.0;
        }else {
            impostoBasico = getRendaAnual() * 25.0;
        }
        impostoBasico = impostoBasico - (getDespesasSaude() *0.5);
        if (impostoBasico <0.0){
            impostoBasico = 0.0;
        }
        return impostoBasico;
    }

}
