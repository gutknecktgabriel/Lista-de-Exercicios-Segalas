package POO_Praticas.Classes_e_Objetos;

import POO_Praticas.Interface.Terrestre;

public class Cachorro implements Terrestre {

    @Override
    public String andar(String direcao) {
        return "Indo ali..." + direcao + ".... wolf wolf....";
    }
}
