package POO.Exceptions;

public class CheckVSNoCheck {
    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        geraErro2();

        System.out.println("Fim");
    }


    //Exceção NÃO checada ou NÃO verificada
    static void geraErro1() {
        throw new RuntimeException("Erro 01");
    }

    //Exceção checada ou verificada
    static void geraErro2() {
        try {
            throw new Exception("Ocorreu um erro");
        } catch (Exception e) {
            System.out.println("........");
        }
    }
}
