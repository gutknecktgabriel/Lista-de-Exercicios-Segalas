package main.java.POO.Exceptions;


public class Account {
    private Integer nunber;
    private String holder;
    private Double balance;
    private Double withdrawLimit;


    //Criado construtor para receber os parametros
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.nunber = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;

    }

    //METODOS GET AND SET
    public Integer getNumber() {
        return nunber;
    }

    public void setNumber(Integer number) {
        this.nunber = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }


    //Metodo deposit e saque
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;

    }

    private void validateWithdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            throw new POO_Praticas.Exceptions.BussinesException("Erro no saque: A quantia excede o limite de saque");
        }
        if (amount > getBalance()) {
           throw new POO_Praticas.Exceptions.BussinesException("Erro de saque: Saldo Insuficiente");
        }
    }
}
