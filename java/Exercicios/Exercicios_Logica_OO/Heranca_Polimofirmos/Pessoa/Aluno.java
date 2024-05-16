package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.Pessoa;

public class Aluno extends Pessoa{
    String curso;

    public Aluno(String nome, int idade, String curso){
        super(nome,idade);
        this.curso = curso;
    }
    public void mostrarDados(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Curso que o aluno realiza: " + curso);
    }
}
