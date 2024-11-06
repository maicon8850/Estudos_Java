package Heranca_e_Polimorfismo;

public class Juridica extends Contribuinte{
    public Juridica(double numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public Juridica(String nome, Double rendaAnual, double numeroFuncionario) {
        super(nome, rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }

    public double getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(double numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    private double numeroFuncionario;

    @Override
    public double imposto() {
        if (numeroFuncionario >10 ){

            return getNumeroFuncionario() * 0.14;
        }else {
            return getNumeroFuncionario() * 0.16;
        }
    }
}
