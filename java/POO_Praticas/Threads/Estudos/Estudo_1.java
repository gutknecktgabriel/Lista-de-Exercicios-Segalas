package POO_Praticas.Threads.Estudos;

public class Estudo_1 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Estudo_1 thread = new Estudo_1();
        thread.start();
        thread.sleep(3000);

        int cont = 0;

        System.out.println("Esse codigo ta rodando fora da thread.");
        for (int i = 0; i <10 ; i++) {
            thread.sleep(300);
            cont++;
            System.out.println("Quantas vezes a contagem foi realizada: " + cont);
        }

    }
    public void run(){
        //rodando o codigo aqui primeiro
        System.out.println("Esse codigo está rodando dentro de uma thread");

    }
}
