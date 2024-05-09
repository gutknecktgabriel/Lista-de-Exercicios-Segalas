package main.java.Exercicios.Exercicios_Logica_OO.Basico;

import java.util.Scanner;

public class Pessoa_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Departamento departamento1 = new Departamento("Direção");
        Departamento departamento2 = new Departamento("Contabilidade");

        Universidade universidade = new Universidade("Princeton");
        Pessoa albert = new Pessoa(0, 14, 3, 1879, "Albert Einstein", universidade, departamento1);

        Universidade universidade2 = new Universidade("Cambridge");
        Pessoa isaac = new Pessoa(0, 4, 1, 1643, "Isaac Newton", universidade2, departamento2);



        int diaAtual = 8;
        int mesAtual = 5;
        int anoAtual = 2024;

        albert.calculaIdade(diaAtual, mesAtual, anoAtual);
        isaac.calculaIdade(diaAtual, mesAtual, anoAtual);
        universidade.setDepartamento(departamento1);

        System.out.println("Idade de Albert Einsten " + albert.informaIdade());
        System.out.println("Idade de Isaac Newton " + isaac.informaIdade());
        System.out.println("Albert Einstein professor em " + universidade.getNome());
        System.out.println("Isaac Newton professor em " + universidade2.getNome());
        System.out.println(albert.retornaUniversadeEPessoa());
        System.out.println(isaac.retornaUniversadeEPessoa());


        //Talvez será usado com o scanner para o usuário escolher seu setor da Universidade
//        System.out.println(albert.retornaDepartamentoEPessoa());
//        System.out.println(isaac.retornaDepartamentoEPessoa());

    }
}