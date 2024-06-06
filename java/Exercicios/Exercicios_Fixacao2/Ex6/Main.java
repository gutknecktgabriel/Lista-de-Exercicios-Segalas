package Exercicios.Exercicios_Fixacao2.Ex6;

public class Main {
    public static void main(String[] args) {
        Pais pais = new Pais("66498-1","Qatar", 211131,82112181);
        Pais pais2 = new Pais("66498-1","Brasil", 521131152,565216513);


        System.out.println("País: " + pais.getNome());
        System.out.println("Código ISO:" + pais.getCodIso());
        System.out.println("Dimensão: " + pais.getDimensao());
        System.out.println("População: " + pais.getPopulacao());
        System.out.println("Densidade: " + pais.densidade());
        System.out.println("Verificar igualdade: " + pais.verificarIgualdade(pais2));
        System.out.println("O " + pais.getNome() + " é limítrofe do " + pais2.getNome() + " ? " + pais.limitrofe(pais2));


    }
}
