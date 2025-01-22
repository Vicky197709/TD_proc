import java.util.Scanner;
public class DoubleCalcul {
    public static void main(String[] args) {
        double nbr1,nbr2;
        double calcul,doubleop;
        String operiation;

        Scanner sc= new Scanner(System.in);
        System.out.print("entrez le premier nombre: ");
        nbr1= sc.nextDouble();
        System.out.print("entrez le premier nombre: ");
        nbr2= sc.nextDouble();
        System.out.print("entrez l'operation que vous voulez appliquer entre (+,-,*,/): ");
        operiation= sc.next();
        calcul=0;
        switch (operiation) {
            case "+":
                calcul=nbr1 + nbr2;
                break;
            case "-":
                calcul=nbr1 - nbr2;
                break;
            case "/":
                if (nbr2 == 0){
                    System.out.println("impossible d'éffecctuer la divison par zéro::))");
                }
                else{
                    calcul=nbr1 / nbr2;
                }
                break;
            case "*":
                calcul=nbr1 * nbr2;
                break;
            default:System.out.println("entrez une opération valide :) ");
        }

        System.out.println("le résultat de l'opération est :"+calcul);
        doubleop= calcul * 2;
        System.out.println("le double de l'opération effectuer est: "+ doubleop);

        sc.close();
    }
    }

