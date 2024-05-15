package POO_Praticas.Metodos;

public class Teste_Carro {
    public static void main(String[] args) {

        //Instanciando objeto
        Carro c1 = new Carro();
        c1.anoFrabricao = 2004;
        c1.modelo = "Civic";
        c1.marca = "Honda";
        c1.vel = 120;



        //Chamando metodos
        c1.acelelar(10);
        System.out.println(c1.vel);
    }
}
