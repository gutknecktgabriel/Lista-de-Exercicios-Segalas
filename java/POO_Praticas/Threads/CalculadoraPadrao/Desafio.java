package POO_Praticas.Threads.CalculadoraPadrao;

public class Desafio extends Thread {
    private int number_1;
    private int number_2;
    private String op;

    public int getNumber_1() {
        return number_1;
    }

    public void setNumber_1(int number_1) {
        this.number_1 = number_1;
    }

    public int getNumber_2() {
        return number_2;
    }

    public void setNumber_2(int number_2) {
        this.number_2 = number_2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}
