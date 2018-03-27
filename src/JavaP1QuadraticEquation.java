public class JavaP1QuadraticEquation {
    public static void main (String [] argrs) {
        double a = 5;
        double b = 0;
        double c = 30;
        double d;      // to define discriminant
        d = b*b  - 4*a*c;
        double x1;
        double x2;

        //x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        //x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.println("Discriminant = " + d);

        //System.out.println(x1 +  " = Result for positive scenario");
        //System.out.println(x2 +  " = Result for negative scenario");

        x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;

        if (d > 0) {
            System.out.println("x1 = " + x1 + " - Result for positive scenario");
            System.out.println("x2 = " + x2 + " - Result for negative scenario");
        }
        if (d == 0) {
            System.out.println("x1 = x2 = " + x1);
        }
        if (d < 0) {
            System.out.println("complex root r1 = " + ((-b)/2*a) + " + " + "i" + (Math.sqrt(Math.abs(d))/2*a));
            System.out.println("complex root r2 = " + ((-b)/2*a) + " - " + "i" + (Math.sqrt(Math.abs(d))/2*a));
        }
    }
}
