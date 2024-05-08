package Exercicios.Exercicios_Logica_OO.Basico;

public class Pessoa_App {
    public static void main(String[] args) {
        Pessoa albert = new Pessoa(0, 14,3,1879);
        Pessoa isaac = new Pessoa(0, 4,1,1643);

         int diaAtual = 8;
         int mesAtual = 5;
         int anoAtual = 2024;

         albert.calculaIdade(diaAtual,mesAtual,anoAtual);
         isaac.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println("Idade de Albert Einsten " + albert.informaIdade());
        System.out.println("Idade de Isaac Newton " + isaac.informaIdade());
    }
}
