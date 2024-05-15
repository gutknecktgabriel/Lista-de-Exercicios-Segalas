package Contato_Relacionamento_Classes;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Gabriel Gutkneckt");

        Endereco end = new Endereco();
        end.setNomeRua("Joao Rausch");
        end.setNumeroCasa("514");
        end.setBairro("Passo Manso");
        end.setCidade("Blumenau");
        end.setEstado("Santa Catarina");
        end.setCep("89032-570");

        Telefone telefone = new Telefone();
        telefone.setNumero("4002-8922");
        telefone.setTipo("Fixo");
        telefone.setDdd("11");

        contato.setEndereco(end);
        contato.setTelefone(telefone);
        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco()!= null){
            System.out.println(contato.getEndereco().getCidade());
            System.out.println(contato.getEndereco().getEstado());
            System.out.println("CEP: "+ contato.getEndereco().getCep());
        }
        if (contato != null && contato.getTelefone()!= null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }
    }
}
