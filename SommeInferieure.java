import java.util.Scanner;

public class SommeInferieure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier positif : ");
        int nombre = scanner.nextInt();

        if (nombre < 0) {
            System.out.println("Veuillez entrer un nombre entier positif.");
        } else {
            int somme = 0;
            int i = 0;

            while (somme < nombre) {
                somme += i;
                i++;
            }

            System.out.println("La somme des entiers naturels jusqu'à " + (i - 1) + " est " + somme);
        }

        scanner.close();
    }
}
