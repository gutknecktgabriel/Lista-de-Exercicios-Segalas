package Exercicios.Exercicios_Logica_OO.Basico;

public class Pessoa_App {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Princeton");
        Pessoa albert = new Pessoa(0, 14,3,1879,"Albert",universidade);
        Universidade universidade2 = new Universidade("Cambridge");
        Pessoa isaac = new Pessoa(0, 4,1,1643, " ", universidade2);

         int diaAtual = 8;
         int mesAtual = 5;
         int anoAtual = 2024;

         albert.calculaIdade(diaAtual,mesAtual,anoAtual);
         isaac.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println("Idade de Albert Einsten " + albert.informaIdade());
        System.out.println("Idade de Isaac Newton " + isaac.informaIdade());
        System.out.println("Albert Einstein professor em " + universidade.getNome());
        System.out.println("Isaac Newton professor em " + universidade2.getNome());
        System.out.println(albert.retornaUniversadeEPessoa());
    }
}
