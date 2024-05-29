package POO_Praticas.Threads.Estudos;

public class Estudo_3 extends Thread {
    public static int cont = 0;

    public static void main(String[] args) throws InterruptedException {
        Estudo_3 thread = new Estudo_3();
        thread.start();

        while (thread.isAlive()) {
            System.out.println("Aguarde...");
            thread.sleep(1000);
            System.out.println("Contador desatualizado: " + cont);

            cont++;
            System.out.println("Contador atualizado: " + cont);  //atualiza o valor e imprime

            System.out.println("ID thread: " + thread.getId());
            System.out.println("Interrupted thread: " + thread.isInterrupted());
            thread.setName("Gabss");
            System.out.println("Name thread modified to: " + thread.getName());


        }
    }

    public void run() {
        cont++;
    }
}
