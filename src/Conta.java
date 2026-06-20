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

    public boolean Depositar(double deposito) {
        if (deposito > 0) {
            saldo = saldo + deposito;
            return true;
        } else {
            return false;
        }
    }
    public boolean Sacar(double valor){
         if (valor>0){
             if (valor>saldo){
                 return false;
             } else{
                 saldo = saldo - valor;
                 return true;
             }
         } else{
             return false;
         }
    }

    public Conta (String nomeTitular, Integer numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;

    }
}
