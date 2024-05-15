package POO_Praticas.Classes_e_Objetos;

public class Carro {
    String marca;
    String modelo;
    String cor;
    int anoDeFrabricacao;
    boolean gasolina;
    boolean freiar;

    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor do veículo: " + this.cor);
        System.out.println("Ano de fabricação: " + this.anoDeFrabricacao);
        System.out.println("Possui gasolina? " + this.gasolina);

    }

    void sairComCarro(){
        if (gasolina == false){
            System.out.println("Veículo sem gasolina");
        }
        else {
            System.out.println("Ligando motores... Droga é o Braia");
        }
    }
    void movimento(){
        this.gasolina = true;
    }
    void parado (){
        this.gasolina = false;
    }
}
