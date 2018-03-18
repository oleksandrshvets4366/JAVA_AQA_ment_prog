public class CheckOddEven {
    public static void main(String[] args) {
        int a[] = {1, 12, 23, 34, 45, 56, 65, 74, 83, 92, 101, 109, 230};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0){
                System.out.println("Selected number: " + a[i]+" - Even number");
            } else {
                System.out.println("Selected number: " + a[i]+" - Odd Number");
            }
        }
    }
}
