package POO.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ativiade_3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String fraseSobreoUsuario = null;
        String nomeUsuario = null;
        int idade = 0;


        try {
            System.out.printf("Olá! Comente um pouco sobre você para realizarmos nossa pesquisa referente a nossos clientes\nObrigado pela atenção!\n");


            System.out.printf("Informe seu nome: ");
            nomeUsuario = scanner.next();


            System.out.printf("Informe sua idade: ");
            idade = scanner.nextInt();


            System.out.printf("Fale um produto que você gostaria que tivesse em na nossa loja: ");
            fraseSobreoUsuario = null;

            try {
                fraseSobreoUsuario = reader.readLine();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("OK!, seu nome é " + nomeUsuario + " você tem " + idade + " anos e gostaria de " + fraseSobreoUsuario);

        } catch (InputMismatchException e) {
            System.out.println("Erro, informe apenas números ao mencionar sua idade ");

        }
        System.out.println("End of program");
        scanner.close();

    }
}

