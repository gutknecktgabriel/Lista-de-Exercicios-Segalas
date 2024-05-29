package POO_Praticas.Threads;

public class Estudo_3 extends Thread {
    public static int cont = 0;

    public static void main(String[] args) {
        Estudo_3 thread = new Estudo_3();
        thread.start();

        while (thread.isAlive()) {
            System.out.println("Aguarde...");
            System.out.println("Contador desatualizado: " + cont);

            cont++;
            System.out.println("Contador atualizado: " + cont);  //atualiza o valor e imprime
        }
    }
    public void run() {
        cont++;
    }
}
