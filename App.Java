import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        char[][] playfield = { { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' } };
        char oOderx = ' ';
        char computerXoderO = ' ';

        printplayfield(playfield);
        oOderx = womitSpielen(oOderx);

        if (Character.compare(oOderx, 'x') == 0) {
            computerXoderO = 'o';
        } else {
            computerXoderO = 'x';
        }

        // Spiel beginnt
        while (true) {
            playerturn(playfield, oOderx);
            if (!spielNichtZuende(playfield, oOderx)) {
                break;
            }
            computerTurn(playfield, computerXoderO);
            if (!spielNichtZuende(playfield, computerXoderO)) {
                break;
            }
        }

        if (!nichtGewonnen(playfield, oOderx)) {
            System.out.println("Herzlichen glückwunsch du hast gewonnen!");
        } else if (!nichtGewonnen(playfield, computerXoderO)) {
            System.out.println("Der Computer hat gewonnen!");
        }

    }

    private static char womitSpielen(char oOderx) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wollen sie mit `x` oder `o` spielen?");
        oOderx = scan.next(".").charAt(0);

        return oOderx;
    }

    private static boolean checkIfLegal(char[][] playfield, int position) {
        if (position == 0 && playfield[0][0] == ' ') {
            return true;
        } else if (position == 1 && playfield[0][1] == ' ') {
            return true;
        } else if (position == 2 && playfield[0][2] == ' ') {
            return true;
        } else if (position == 3 && playfield[1][0] == ' ') {
            return true;
        } else if (position == 4 && playfield[1][1] == ' ') {
            return true;
        } else if (position == 5 && playfield[1][2] == ' ') {
            return true;
        } else if (position == 6 && playfield[2][0] == ' ') {
            return true;
        } else if (position == 7 && playfield[2][1] == ' ') {
            return true;
        } else if (position == 8 && playfield[2][2] == ' ') {
            return true;
        } else {
            return false;
        }

    }

    private static char[][] computerTurn(char[][] playfield, char computerXoderO) {
        Random rand = new Random();

        while (true) {
            int zug = rand.nextInt(10);
            if (checkIfLegal(playfield, zug)) {
                zugSetzen(playfield, computerXoderO, zug);
                printplayfield(playfield);
                break;
            }
        }

        return playfield;
    }

    private static char[][] playerturn(char[][] playfield, char oOderx) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Wo wollen sie ihren nächsten zug setzen?");
            int zug = scan.nextInt();
            if (checkIfLegal(playfield, zug)) {
                zugSetzen(playfield, oOderx, zug);
                printplayfield(playfield);
                break;
            } else {
                System.out.println("dieser zug ist nicht möglich");
            }
        }

        return playfield;
    }

    private static void printplayfield(char[][] playfield) {
        System.out.println(playfield[0][0] + "|" + playfield[0][1] + "|" + playfield[0][2]);
        System.out.println("-" + " " + "-" + " " + "-");
        System.out.println(playfield[1][0] + "|" + playfield[1][1] + "|" + playfield[1][2]);
        System.out.println("-" + " " + "-" + " " + "-");
        System.out.println(playfield[2][0] + "|" + playfield[2][1] + "|" + playfield[2][2]);
        System.out.println("");
        System.out.println("");

    }

    private static char[][] zugSetzen(char[][] playfield, char oOderx, int zug) {
        switch (zug) {
            case 0:
                playfield[0][0] = oOderx;
                break;

            case 1:
                playfield[0][1] = oOderx;
                break;

            case 2:
                playfield[0][2] = oOderx;
                break;

            case 3:
                playfield[1][0] = oOderx;
                break;

            case 4:
                playfield[1][1] = oOderx;
                break;

            case 5:
                playfield[1][2] = oOderx;
                break;

            case 6:
                playfield[2][0] = oOderx;
                break;

            case 7:
                playfield[2][1] = oOderx;
                break;

            case 8:
                playfield[2][2] = oOderx;
                break;

            default:
                System.out.println("Hast du einen Schaden? :)");

        }
        return playfield;
    }

    private static boolean spielNichtZuende(char[][] playfield, char oOderx) {
        if (!nichtGewonnen(playfield, oOderx)) {
            return false;
        }

        return nichtUnentschieden(playfield);

    }

    private static boolean nichtUnentschieden(char[][] playfield) {
        for (int i = 0; i <= 2; i++) {
            for (int o = 0; o <= 2; o++) {
                if (playfield[i][o] == ' ') {
                    return true;
                }
            }
        }
        System.out.println("Das Spiel endet in einem unentschieden!");
        return false;
    }

    private static boolean nichtGewonnen(char[][] playfield, char oOderx) {
        if (playfield[0][0] == oOderx && playfield[0][1] == oOderx && playfield[0][2] == oOderx) {
            return false;
        } else if (playfield[1][0] == oOderx && playfield[1][1] == oOderx && playfield[1][2] == oOderx) {
            return false;
        } else if (playfield[2][0] == oOderx && playfield[2][1] == oOderx && playfield[2][2] == oOderx) {
            return false;
        } else if (playfield[0][0] == oOderx && playfield[1][0] == oOderx && playfield[2][0] == oOderx) {
            return false;
        } else if (playfield[0][1] == oOderx && playfield[1][1] == oOderx && playfield[2][1] == oOderx) {
            return false;
        } else if (playfield[0][2] == oOderx && playfield[1][2] == oOderx && playfield[2][2] == oOderx) {
            return false;
        } else if (playfield[0][0] == oOderx && playfield[1][1] == oOderx && playfield[2][2] == oOderx) {
            return false;
        } else if (playfield[0][2] == oOderx && playfield[1][1] == oOderx && playfield[2][0] == oOderx) {
            return false;
        }

        return true;
    }
}