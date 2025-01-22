import java.util.Scanner;
public class EchangeData {
    public static void main(String[] args) {
        int nbr1,nbr2,somme,produit,passage;

        Scanner sc= new Scanner(System.in);
        System.out.print("entrez le premier nombre: ");
        nbr1 = sc.nextInt();
        System.out.print("entrez le deuxième nombre: ");
        nbr2= sc.nextInt();

        somme= nbr1 + nbr2;
        produit= nbr1 * nbr2;

        if (produit < 0){
            passage= nbr1;
            nbr1= nbr2;
            nbr2=passage;
        }
        else{
            nbr1= produit;
            nbr2= somme;
            
        }
        
        System.out.print("la valeur du premier variable est maintenant:"+nbr1+
        "\ncelui du second vaut aussi: "+ nbr2);
        sc.close();
    }
}
