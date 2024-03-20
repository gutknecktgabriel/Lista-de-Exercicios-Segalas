package POO.Interface;

public abstract class Conta implements Regras {
    String agencia;
    String conta;
    double saldo;
    public Conta(String a, String c) {
        this.setAgencia(a);
        this.setConta(c);
        this.setSaldo(0);
    }


    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getConta() {
        return conta;
    }
    public void setConta (String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.setSaldo(this.saldo + valor);
    }

    public String toString (){
        return "Agencia: " + this.getAgencia() +
                "\nConta: " + this.getConta() +
                "\nSaldo: " + this.getSaldo();
    }
}
