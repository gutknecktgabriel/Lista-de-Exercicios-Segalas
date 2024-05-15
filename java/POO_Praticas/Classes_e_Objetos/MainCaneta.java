package POO_Praticas.Classes_e_Objetos;

public class MainCaneta {
    public static void main(String[] args) {
        //Criada uma caneta instanciada a partir da classe caneta

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.rabiscar();
        c1.status();
    }
}
