package POO.Interface;

import POO.Interface.Passaro;

public class papagaio {
    public static void main(String[] args) {
        Passaro papagaio = new Passaro();
        String direcao = papagaio.voar(" ao norte");
        String imitacao = papagaio.canto(" para a fêmea");
        System.out.println(direcao + imitacao);

    }
}

