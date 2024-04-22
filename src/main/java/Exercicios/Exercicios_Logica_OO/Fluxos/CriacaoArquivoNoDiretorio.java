package Exercicios.Exercicios_Logica_OO.Repeticao;

import Exercicios.Exercicios_Logica_OO.Fluxos.Criacao_Diretorio;

import java.io.File;
import java.io.IOException;

public class CriacaoArquivoNoDiretorio extends Criacao_Diretorio {
    public static void main(String[] args) {

        //Criando arquivo para adicionarmos no Diretorio
        String caminhoDoArquivo = "C:\\Users\\gabriel.gutkneckt\\IdeaProjects\\SegalasExercicio\\src\\Meu_Novo_Diretorio\\";
        String nomeArquivo = "MeuArquivo.txt";

        File file_Arquivo = new File(caminhoDoArquivo + nomeArquivo);
        try {

            boolean arquivoCriado = file_Arquivo.createNewFile();
            if (arquivoCriado) {
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("Erro ao criar novo arquivo, verifique se o meso já existe em: " + caminhoDoArquivo);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
