package Exercicios.Intermediario43;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class Intermediario_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int candidato;
        int contagemVotosTotal = 0;
        int contagemCandidato_1 = 0;
        int contagemCandidato_2 = 0;
        int contagemCandidato_3 = 0;
        int contagemCandidato_4 = 0;
        int contagemVotoNulo = 0;
        int contagemVotoBranco = 0;
        double porcentagemVotosNulos = 0;
        int porcentagemVotosBrancos = 0;

        for (int i = 1; i <= 61; i++) {
            System.out.println("Informe o candidato através dos seguintes comandos: 1 = José, 2 = Marcos, 3 = Fernando e 4 = Marcio.\nPara voto nulo digite 5 e para votos em branco digite 6");
            candidato = scanner.nextInt();

            if (candidato == 1) {
                contagemCandidato_1++;
            } else if (candidato == 2) {
                contagemCandidato_2++;
            } else if (candidato == 3) {
                contagemCandidato_3++;
            } else if (candidato == 4) {
                contagemCandidato_4++;
            } else if (candidato ==5) {
                contagemVotoNulo++;
            } else if (candidato ==6) {
                contagemVotoBranco++;
            }
            contagemVotosTotal++;

        }
        porcentagemVotosNulos = (contagemVotoNulo * 100) / contagemVotosTotal;
        porcentagemVotosBrancos = (contagemVotoBranco * 100) / contagemVotosTotal;

        System.out.println("O candidato 1 recebeu " + contagemCandidato_1 + " votos.");
        System.out.println("O candidato 2 recebeu " + contagemCandidato_2 + " votos.");
        System.out.println("O candidato 3 recebeu " + contagemCandidato_3 + " votos.");
        System.out.println("O candidato 4 recebeu " + contagemCandidato_4 + " votos.");
        System.out.println("O total de votos nulos foi de: " + contagemVotoNulo + " votos.");
        System.out.println("O total de votos em branco foi de: " + contagemVotoBranco + " votos.");
        System.out.println("A porcentagem de votos nulos sobre o total de votos foi: " + porcentagemVotosNulos + "%");
        System.out.println("A porcentagem de votos brancoss sobre o total de votos foi: " + porcentagemVotosBrancos + "%");



    }
}


