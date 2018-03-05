public class JavaP1QuadraticEquation {
    public static void main (String [] argrs) {
        double a = 2;
        double b = -5;
        double c = -4;
        double x1;
        double x2;
        x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
