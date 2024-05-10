package Exercicios.Exercicios_Logica_OO.Ex1_Ate_04;


public class Pessoa_Program {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Princeton");
        Pessoa albert = new Pessoa(0, 14, 3, 1879, "Albert Einstein", universidade);
        Universidade universidade2 = new Universidade("Cambridge");
        Pessoa isaac = new Pessoa(0, 4, 1, 1643, "Isaac Newton", universidade2);


        int diaAtual = 8;
        int mesAtual = 5;
        int anoAtual = 2024;

        albert.calculaIdade(diaAtual, mesAtual, anoAtual);
        isaac.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println("Idade de Albert Einsten " + albert.informaIdade());
        System.out.println("Idade de Isaac Newton " + isaac.informaIdade());
        System.out.println("Albert Einstein professor em " + universidade.getNome());
        System.out.println("Isaac Newton professor em " + universidade2.getNome());

        Departamento juridico = new Departamento("Juridico");
        Departamento contabilidade = new Departamento("Contabilidade");
        Departamento tecnlogia = new Departamento("Tecnlogia da informação");
        Departamento rh = new Departamento("Recursos Humanos");
        Departamento controleDeQualiade = new Departamento("Controle de Qualidade");
        Departamento compras = new Departamento("Compras");

        universidade.add(juridico);
        universidade.add(contabilidade);
        universidade.add(tecnlogia);
        universidade2.add(rh);
        universidade2.add(controleDeQualiade);
        universidade2.add(compras);



    }
}
