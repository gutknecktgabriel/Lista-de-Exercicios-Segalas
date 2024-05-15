package POO_Praticas.Interface;

public class papagaio {
    public static void main(String[] args) {
        Passaro papagaio = new Passaro();
        String direcao = papagaio.voar(" ao norte");
        String imitacao = papagaio.canto(" para a fêmea");
        System.out.println(direcao + imitacao);

    }
}

