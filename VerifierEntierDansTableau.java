import java.util.Scanner;

public class VerifierEntierDansTableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] tableau = new int[4][5];

        System.out.println("Initialisation du tableau 4x5 :");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                tableau[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("Tableau :");
        for (int[] ligne : tableau) {
            for (int valeur : ligne) {
                System.out.print(valeur + "\t");
            }
            System.out.println();
        }

        System.out.print("Entrez un entier à rechercher : ");
        int nombre = scanner.nextInt();

        boolean trouve = false;
        for (int[] ligne : tableau) {
            for (int valeur : ligne) {
                if (valeur == nombre) {
                    trouve = true;
                    break;
                }
            }
            if (trouve) break;
        }

        if (trouve) {
            System.out.println("Le nombre " + nombre + " se trouve dans le tableau.");
        } else {
            System.out.println("Le nombre " + nombre + " ne se trouve pas dans le tableau.");
        }

        scanner.close();
    }
}
