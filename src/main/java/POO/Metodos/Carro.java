package POO.Metodos;

public class Veiculo {

    //atributos
    String marca;
    String modelo;
    int vel;
    int anoFrabricao;

    //métodos

    void acelelar(int aceleracao){
        vel += aceleracao;
    }
    void freiar(int reduzir){
        vel -= reduzir;
    }
    void buzinar(){
        System.out.println("buzinando...");
    }
}
