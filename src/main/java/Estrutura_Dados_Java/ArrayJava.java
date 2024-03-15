package Estrutura_Dados_Java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayJava {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();

    }{
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 21));

          System.out.println(supermarket.peek());
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());


    }
    static record Person(String name, int age){}
}

