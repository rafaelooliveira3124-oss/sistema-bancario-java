public class Conta {
    private String nomeTitular;
    private Integer numeroConta;
    private double saldo;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Conta (String nomeTitular, Integer numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;

    }
}
