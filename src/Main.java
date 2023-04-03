import java.util.Scanner;
import classes.Jogador;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int i=0;
        // input.useDelimiter(System.getProperty("line.separator"));
        // input.useCharset("UTF-8");

        int QUANTIDADE_JOGADORES = 1;
        Jogador[] jogadores = new Jogador[QUANTIDADE_JOGADORES];
        

        while (!input.equals("FIM")) {
            QUANTIDADE_JOGADORES++;
            jogadores[i++].ler();
        }



        //Jogador jog01 = new Jogador();
        //jog01.ler();

    }
}
