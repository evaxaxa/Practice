import java.util.Arrays;

public class GreatestNumber {

    public int greatest(int a[])
    {
       /* Element       NGE
        4      -->   5 ------------2 4 5 25
        5      -->   25
        2      -->   25
        25     -->   -1*/

        /*13      -->    -1
           7       -->     12
           6       -->     12
           12      -->     -1*/

        //4,5,7,6,2,25
        int b[]=new int[a.length];
        b=a;
        for(int i =0;i<a.length-1;i++)
        {
               int j=i+1;
                Arrays.sort(b,j,a.length-1); // 2 5 25 // 26,4,5,2,25}
                for(int k =1;k<b.length;k++)
                {
                    if(a[i]>b[b.length-1]) // 13 7 6 12
                    {
                        System.out.println(a[i] + "---->" + -1);
                        break;
                    }
                    if(a[i]<b[k]) {
                        System.out.println(a[i] + "---->" + b[k]);
                        break;
                    }

                }
        }
        Arrays.sort(b,1,a.length-1);
        System.out.println(a[a.length-1]+"---->"+-1);

        return 0;
    }


    public static void main(String args[])
    {
        GreatestNumber g = new GreatestNumber();
        int a[]= {13,7,6,12};
        int k =g.greatest(a);
    }

}
