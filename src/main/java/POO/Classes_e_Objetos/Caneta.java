package POO.Classes_e_Objetos;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.print("Caneta " + this.cor);
        System.out.println(" Com ponta: " + this.ponta);
        System.out.println("Carga: " +  carga);
        System.out.printf("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (tampada == true){
            System.out.println("Erro! impossível rabiscar tampado.");
        }
        else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
}
