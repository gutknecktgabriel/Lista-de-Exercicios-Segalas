package POO;

public class Cachorro implements Terrestre {

    @Override
    public String andar(String direcao) {
        return "Indo ali..." + direcao + ".... wolf wolf....";
    }
}
