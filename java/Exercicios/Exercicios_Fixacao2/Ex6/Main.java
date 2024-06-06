package Exercicios.Exercicios_Fixacao2.Ex6;

public class Main {
    public static void main(String[] args) {
        Pais pais = new Pais("66498-1","Qatar", 214341131,8483481);
        Pais pais2 = new Pais("66498-1","Brasil", 51351152,565216513);
        Pais pais3 = new Pais("66498-1","Mexico", 2141131,74755656);

        System.out.println("País: " + pais.getNome());
        System.out.println("Código ISO:" + pais.getCodIso());
        System.out.println("Dimensão: " + pais.getDimensao());
        System.out.println("População: " + pais.getPopulacao());



    }
}
