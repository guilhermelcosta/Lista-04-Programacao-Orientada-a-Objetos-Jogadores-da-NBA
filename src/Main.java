import java.util.ArrayList;
import java.util.Scanner;

import classes.Jogador;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        String input = scanner.nextLine();
        int qtde, ref;

        while (!input.equals("FIM")) {
            String[] infoJogador = input.split(",", -1);
            int id = Integer.parseInt(infoJogador[0]);
            String nome = ehVazio(infoJogador[1]) ? "nao informado" : infoJogador[1];
            int altura = Integer.parseInt(infoJogador[2]);
            int peso = Integer.parseInt(infoJogador[3]);
            String universidade = ehVazio(infoJogador[4]) ? "nao informado" : infoJogador[4];
            int anoNascimento = Integer.parseInt(infoJogador[5]);
            String cidadeNascimento = ehVazio(infoJogador[6]) ? "nao informado" : infoJogador[6];
            String estadoNascimento = ehVazio(infoJogador[7]) ? "nao informado" : infoJogador[7];
            Jogador jogador = new Jogador(id, nome, altura, peso, universidade, anoNascimento, cidadeNascimento, estadoNascimento);
            jogadores.add(jogador);
            input = scanner.nextLine();
        }
        qtde = scanner.nextInt();

        for (int i = 0; i < qtde; i++) {
            ref = scanner.nextInt();
            jogadores.get(ref).imprimir();
        }

    }
    public static boolean ehVazio(String str) {
        return str.isBlank();
    }
}
