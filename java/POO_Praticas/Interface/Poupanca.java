package POO_Praticas.Interface;

public class Poupanca extends Conta {
    private int aniversario;

    public Poupanca(String a, String c, int an){
        super(a, c);
        this.setAniversario(an);
    }
    public double getAniversario(){
        return aniversario;
    }
    public void setAniversario(int aniversario){
        this.aniversario = aniversario;
    }
    public String toString (){
        String texto = super.toString();
        texto += "\nAniversario: " + this.getAniversario();
        return texto;
    }
    public void sacarDinheiro(double valor){
        if (valor <= super.getSaldo())
        super.setSaldo(super.getSaldo() - valor);
        else System.out.println("Saldo insuficiente para realizar o saque");
    }
}
