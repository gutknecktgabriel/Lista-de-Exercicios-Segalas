package POO_Praticas.Threads;

public class Estudo_2 extends Thread{
    public static int cont = 0;

    public static void main(String[] args) {
        Estudo_2 thread = new Estudo_2();
        thread.start();
        System.out.println(cont); // valor zero
        cont++;
        System.out.println(cont); // adicionado valor
    }
    public void run(){
        cont++;
    }
}
