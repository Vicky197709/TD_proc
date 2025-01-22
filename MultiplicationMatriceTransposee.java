import java.util.Scanner;

public class MultiplicationMatriceTransposee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriceA = new int[4][4];
        int[][] matriceB = new int[4][4];
        int[][] transposeB = new int[4][4];
        int[][] resultat = new int[4][4];

        System.out.println("Initialisation de la première matrice (4x4) :");
        remplirMatrice(matriceA, sc);

        System.out.println("Initialisation de la seconde matrice (4x4) :");
        remplirMatrice(matriceB, sc);

        System.out.println("Matrice A :");
        afficherMatrice(matriceA);

        System.out.println("Matrice B :");
        afficherMatrice(matriceB);

        // Calcul de la transposée de la matrice B
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transposeB[j][i] = matriceB[i][j];
            }
        }

        System.out.println("Transposée de B :");
        afficherMatrice(transposeB);

        // Multiplication de matriceA par transposeB
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    resultat[i][j] += matriceA[i][k] * transposeB[k][j];
                }
            }
        }

        System.out.println("Résultat de la multiplication A * Transposée(B) :");
        afficherMatrice(resultat);

        sc.close();
    }

    public static void remplirMatrice(int[][] matrice, Scanner sc) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print("Élément [" + i + "][" + j + "] : ");
                matrice[i][j] = sc.nextInt();
            }
        }
    }

    public static void afficherMatrice(int[][] matrice) {
        for (int[] ligne : matrice) {
            for (int valeur : ligne) {
                System.out.print(valeur + "\t");
            }
            System.out.println();
        }
    }
}
