package POO;

import java.util.Scanner;

public class Tic_Tac_Toe_Main {
    public static void main(String[] args) {
        campo[][] velha = new campo[3][3];
        iniciarJogo(velha);
        char simboloAtual = 'x';
        Boolean game = true;
        String vitoria = "";
        Scanner scanner = new Scanner(System.in);

        while (game) {
            desenhaJogo(velha);
            vitoria = verificaVitoria(velha);
            if (!vitoria.equals("")) {
                System.out.printf("Jogador %s venceu%n", vitoria);
                break;
            }
            try {
                if (verificarJogada(velha, jogar(scanner, simboloAtual), simboloAtual)) {
                    if (simboloAtual == 'x') {
                        simboloAtual = 'o';
                    } else {
                        simboloAtual = 'x';
                    }
                }
            } catch (Exception e) {
                System.out.println("Erro!");
            }
        }
        System.out.println("Fim de jogo.");
    }

    public static void desenhaJogo(campo[][] velha) {
        limparTela();
        System.out.print("      0    1   2");
        System.out.printf("%n0   %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println("   -------------");
        System.out.printf("1   %c | %c | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.println("   -------------");
        System.out.printf("2   %c | %c | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
    }


    public static void limparTela() {
        for (int cont = 0; cont < 200; cont++) {
            System.out.println(" ");
            break;
        }
    }

    public static int[] jogar(Scanner scanner, char sa) {
        int p[] = new int[2];
        System.out.printf("%s %c%n", "Quem joga: ", sa);
        System.out.print("Informe a linha: ");
        p[0] = scanner.nextInt();
        System.out.print("Informe a coluna: ");
        p[1] = scanner.nextInt();
        return p;
    }

    public static boolean verificarJogada(campo[][] velha, int p[], char simboloAtual) {
        if (velha[p[0]][p[1]].getSimbolo() == ' ') {
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        } else {
            return false;
        }
    }

    public static void iniciarJogo(campo[][] velha) {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                velha[1][c] = new campo();
            }
        }
    }

    public static String verificaVitoria(campo[][] velha) {
        return " ";
    }
}
