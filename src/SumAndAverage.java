public class SumAndAverage {
    public static void main (String [] args) {
        int a [] = new int [101];
        int average = 0;
        int sum = 0;

        for (int i=1; i <= 100 && i >= 1; i++) {
            a[i]=i;                 //fill array with variables
        sum = sum + a[i];   // sum of all array variables
        }

        average = (sum/100);
        System.out.println( "Average of sum is: " + average);
    }
}
