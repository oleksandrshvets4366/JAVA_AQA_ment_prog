package JavaMentorProgram;

public class BublSortAlgr {
    void bubbleSort (int a[])
    {
            int n = a.length;
            for (int i=0; i<n-1; i++)
                for (int j=0; j<n-i-1; j++)
                    if (a[j] > a [j+1]) {                         // swapping temp and a[i]
                    int temp =a[j];
                    a[j] = a[j+1];
                    a [j+1] = temp;
                    }
        }

        void printArray(int a[])                                // print the array
        {
            int n=a.length;
            for (int i=0; i<n; ++i)
                System.out.print(a[i] + " ");
            System.out.println();
        }

    public static void main (String [] args) {               // declaring the array
        int [] a = {74, 12, 92, 56, 45, 34, 65, 1, 83, 23};
        BublSortAlgr ob = new BublSortAlgr();
        ob.bubbleSort(a);
        System.out.println("Sorted by bubble method array: ");
        ob.printArray(a);
    }
}
