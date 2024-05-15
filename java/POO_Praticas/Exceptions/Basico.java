package POO_Praticas.Exceptions;

public class Basico {
    public static void main(String[] args) {

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }
        System.out.println("Fim");
    }
}
