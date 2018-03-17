public class SevenPatternLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
                for (int j =1; j<=i; j++) {
                    System.out.print(j);
                }
                for (int j=i; j<7; j++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
