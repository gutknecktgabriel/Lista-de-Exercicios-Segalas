package Exercicios.Exercicios_Logica_OO.Fluxos;

import java.io.File;
import java.io.IOException;

public class Criacao_Diretorio {
    public static void main(String[] args) {
        String nomeDoDiretorio = "Meu_Novo_Diretorio";
        String diretorioAtual = System.getProperty("user.dir");
        String caminhoDoDiretorio = diretorioAtual + File.separator + nomeDoDiretorio;
        File file = new File(caminhoDoDiretorio);

        boolean isCreated = file.mkdir();

        if (isCreated == true) {
            System.out.println("Arquivo criado com sucesso em: " + caminhoDoDiretorio);
        } else {
            System.out.println("Falha ao criar o novo diretório, verifique se o mesmo já existe em: " + caminhoDoDiretorio);

        }
    }
}