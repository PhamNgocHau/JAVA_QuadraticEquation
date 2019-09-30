import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.printf("QuadraticEquation has 2 root: x1 = %.2f, x2 = %.2f",
                    quadraticEquation.getX1(), quadraticEquation.getX2());
        } else if (delta == 0) {
            System.out.printf("QuadraticEquation has 1 root: x = %.2f", quadraticEquation.getX1());
        } else if (delta < 0) {
            System.out.println("The equation has no roots");
        }
    }
}

