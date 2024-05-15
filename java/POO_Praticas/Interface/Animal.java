package POO_Praticas.Interface;

public class Animal implements SerVivo{

    private Boolean vivo;

    public Animal (){
        this.vivo =true;
    }

    public void mover(){}
    public void comer(int massa){}
    public void info(){
        System.out.println("O gato está vivo?" + this.vivo);
    }
}
