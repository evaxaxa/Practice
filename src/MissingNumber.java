import java.util.Arrays;

public class MissingNumber {

    int MissNum(int a[])
    {
        Arrays.sort(a);
        for(int i =0;i<a.length-1;i++)
        {
            if(a[i]+1!=a[i+1])
            {
                int k= a[i]+1;
                System.out.println("missing num ="+k);
            }
            /*else {
                int k= a[i]+1;
                System.out.println("missing num ="+k);
            }*/
        }

        return 0;
    }

    public static void main(String args[])
    {
        MissingNumber g = new MissingNumber();
        int a[]= {-3,-1,0,1, 2, 3, 5};
        g.MissNum(a);
    }

}
