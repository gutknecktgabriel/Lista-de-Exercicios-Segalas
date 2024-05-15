package POO_Praticas.Interface;

public class PrincipalSaldo_Conta {
    public static void main(String[] args) {
        Poupanca cpp = new Poupanca("7800", "11811-2", 15);
        cpp.depositar(11000);
        cpp.sacarDinheiro(0);
        System.out.println(cpp);
    }
}
