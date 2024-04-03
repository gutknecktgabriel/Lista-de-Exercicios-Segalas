package POO.Exceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Define padrão estadunidense de valor monetário
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe os dados da conta");
        System.out.printf("Número da conta: ");
        int number = scanner.nextInt();

        System.out.printf("Titular: ");
        scanner.nextLine();
        String holder = scanner.next();

        System.out.printf("Saldo inicial: ");
        double balance = scanner.nextDouble();

        System.out.printf("Limite de saque: ");
        double withdrawLimit = scanner.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.printf("Informe uma quantia para sacar: ");
        double amount = scanner.nextDouble();


        try {
            acc.withdraw(amount);
            System.out.println("Novo saldo: " + acc.getBalance() + " reais");
        }
        catch (BussinesException e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
