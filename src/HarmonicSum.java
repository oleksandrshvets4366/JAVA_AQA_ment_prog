public class HarmonicSum {
    public static void main (String[] args)
    {
        int n = 50000;          // count of n, where n by taks n=50000
        double h;              //Harmonic sum variable
        h=0;

        for (int i = 2; i < n; i++)
        {
            h = 1 + ((double) 1 / i);
        }

       System.out.println("Harmonic Sum = " + h);
    }
}
