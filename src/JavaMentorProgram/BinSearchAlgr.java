package JavaMentorProgram;

public class BinSearchAlgr {
    public static void main(String[] args) {
        //BinSearchAlgr ob = new BinSearchAlgr();
        int a[] = {1, 12, 23, 34, 45, 56, 65, 74, 83, 92};
        int first = 0;
        int last = a.length-1;
        int x = 74;

        while (first < last) {
            int mid = (first + last)/2;
            int midVal = a[mid];

            if (midVal < x) {
                first = mid + 1;
            }
            else if (midVal > x) {
                last = mid - 1;
            }
            else
                System.out.print(mid);         // X was found
            }
            System.out.println(-(first + 1));         // X cannot be found
        }
    }



