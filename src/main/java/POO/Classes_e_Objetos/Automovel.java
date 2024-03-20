package POO.Classes_e_Objetos;

import POO.Classes_e_Objetos.Carro;

public class Automovel {
    public static void main(String[] args) {

        Carro carro_1 = new Carro();

        carro_1.marca = "Chevrolet";
        carro_1.modelo ="Camaro";
        carro_1.cor = "Amarelo";
        carro_1.anoDeFrabricacao = 2020;
        carro_1.gasolina = false;



        carro_1.status();
        carro_1.sairComCarro();
        carro_1.movimento();

    }
}
