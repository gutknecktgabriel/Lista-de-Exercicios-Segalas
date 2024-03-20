package POO.Interface;

public interface Veiculo {
    public String placa = "";
    public float velMax = 100;
    public void inicar();
    public void parar();
    default void buzinar(){
        System.out.println("Buzinando");
    }
}
