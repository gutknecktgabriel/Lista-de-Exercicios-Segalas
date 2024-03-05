package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        int idadeMedia = 0;
        int maiorIdade = 0;
        int menorIdade = 0;
        double salario = 0;
        double mediaSalario = 0;
        int mulheresQueGanhamAte200 = 0;
        String sexo;

        for (int i = 1; i <=2 ; i++) {
            System.out.printf("Usuário " + i + " informe através dos comandos se você se identifica como homem ou mulher\nH para homem e M para mulher: ");
            sexo = scanner.next();

            if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M")){

                System.out.print("Usuário " + i + " informe sua idade: ");
                idade = scanner.nextInt();

                System.out.print("Usuário " + i + " informe seu salário: ");
                salario = scanner.nextDouble();
            }
            if (idade > maiorIdade){
                maiorIdade = idade;
            } else if (menorIdade < idade) {
                menorIdade= idade;
            }else{
                idade = menorIdade;
            }
            if (sexo.equalsIgnoreCase("M")&& salario <=200){
                mulheresQueGanhamAte200++;
            }

            mediaSalario += salario;
        }
        System.out.println("A média do salário da população é de: " + mediaSalario /2 + " reais");
        System.out.println("A maior idade dentre os analisados é: " + maiorIdade + " anos.");
        System.out.println("A menor idade dentre os analisados é: " + menorIdade + " anos.");
        System.out.println("Quantidade de mulheres que ganha até 200 reais: " + mulheresQueGanhamAte200);
    }
}
