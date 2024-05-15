package POO_Praticas.Interface;

public class Passaro implements Ave {


    @Override
    public String voar(String direcao) {
        return "Voando..." + direcao;
    }
    public String canto(String musica){
        return " cantando" + musica;
    }
}
