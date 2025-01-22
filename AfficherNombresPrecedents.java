import java.util.Scanner;

public class AfficherNombresPrecedents {
    public static void main(String[] args) {
        int nbr_dep,nb_nbr;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre de départ : ");
        nbr_dep = sc.nextInt();

        System.out.print("Combien de nombres précédents voulez-vous afficher ? ");
        nb_nbr = sc.nextInt();

        System.out.println("Les " + nb_nbr + " nombres précédents sont :");
        for (int i = 1; i <= nb_nbr; i++) {
            System.out.println(nbr_dep - i);
        }

        sc.close();
    }
}
