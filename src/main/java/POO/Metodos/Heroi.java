package POO.Metodos;

public class Heroi {
    public static void main(String[] args) {

        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        int dano = 23;
        heroi.mostrarStatus();
        heroi.atacar("Hydra", "");


    }
}
