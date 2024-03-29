public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getX1() {
        return (-b + Math.sqrt(getDiscriminant()))/(2*a);
    }

    public double getX2() {
        return (-b - Math.sqrt(getDiscriminant()))/(2*a);
    }

}
