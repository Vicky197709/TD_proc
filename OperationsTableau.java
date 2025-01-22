import java.util.Scanner;

public class OperationsTableau {
    public static void main(String[] args) {
        double somme = 0, produit = 1;
        Scanner sc = new Scanner(System.in);
        double[] tableau = new double[10];

        System.out.println("Entrez 10 nombres réels :");
        for (int i = 0; i < 10; i++) {
            System.out.print("Élément " + (i + 1) + ": ");
            tableau[i] = sc.nextDouble();
        }

        
        for (double valeur : tableau) {
            somme += valeur;
            produit *= valeur;
        }

        double moyenne = somme / tableau.length;

        System.out.println("Somme : " + somme);
        System.out.println("Produit : " + produit);
        System.out.println("Moyenne : " + moyenne);

        sc.close();
    }
}
