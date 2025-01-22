import java.util.Scanner;

public class EquationSecondDegre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le coefficient a : ");
        double a = sc.nextDouble();
        System.out.print("Entrez le coefficient b : ");
        double b = sc.nextDouble();
        System.out.print("Entrez le coefficient c : ");
        double c = sc.nextDouble();

        System.out.println("L'équation à résoudre est : " + a + "x² + " + b + "x + " + c + " = 0");

        double delta = calculerDelta(a, b, c);
        System.out.println("la valeur de delta est: "+delta);
        afficherSolutions(a, b, c, delta);

        sc.close();
    }

    public static double calculerDelta(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public static void afficherSolutions(double a, double b, double c, double delta) {
        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Deux solutions réelles : x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Une solution réelle unique : x = " + x);
        } else {
            System.out.println("Pas de solutions réelles.");
        }
    }
}
