package POO.Interface;

public class Carro implements Veiculo{

    Veiculo tesla = new Carro();
    @Override
    public void inicar() {
        System.out.println("Ligando o motor...");
    }
    public void parar(){
        System.out.println("Desligando motor...");
    }
}
