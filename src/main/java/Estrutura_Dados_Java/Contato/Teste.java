package Estrutura_Dados_Java.Contato;

public class Teste {
    public static void main(String[] args) {


        Contato contato = new Contato();
        contato.setNome("Gabriel");
        contato.setEndereco("Joao Rausch");
        contato.setTelefone("4002-8922");
        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco());
        System.out.println(contato.getTelefone());
    }
}
