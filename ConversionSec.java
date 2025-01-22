import java.util.Scanner;
public class ConversionSec {
    public static void main(String[] args) {
        int nbr_seconde,heures,minutes,secondes;
        Scanner sc= new Scanner(System.in);
        System.out.print("entrez le nombre des sécondes à convertir: ");
        nbr_seconde= sc.nextInt();

        heures= nbr_seconde /3600;
        minutes = (nbr_seconde % 3600/60);
        secondes= nbr_seconde % 60;

        System.out.print("après conversion, vos secondes sont:");
        System.out.println(heures + " Heures "+ minutes+" Minutes "+secondes+" Secondes");

        sc.close();
        
    }
    
}
