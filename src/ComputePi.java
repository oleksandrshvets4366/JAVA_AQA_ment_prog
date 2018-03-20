public class ComputePi {
    public static void main (String [] args) {
        int innerCount = 0;      // number of points, which can be paced into the circle
        int count = 20000;       // value for number of points at circle
        double x, y;            // coordinates
        double p;               //result

        for (int i = 0; i < count; i ++) {
          x = (Math.random() * 2)- 1;
          y = (Math.random() * 2)- 1;
          if (Math.pow(x,2) + Math.pow(y, 2) <=1)
              innerCount++;
        }
        p = (double)4*innerCount/count;
        System.out.println("Computed value of PI=" + p + " , but java const Math.PI="+Math.PI);
       // System.out.println(Math.PI);

        }
    }
