package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.Pessoa;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void mostrarDados(){
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Idade da pessaoa: " + idade);
    }
}
