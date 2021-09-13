import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class PairCheck {

    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Scanner sc = new Scanner(System.in);
        int value= sc.nextInt();

        List<String> item = Arrays.asList(s.split("\\s*,\\s*"));
        HashSet<Integer> numberList= new HashSet<Integer>();
       List<Integer>  x = new ArrayList<>();
        for(String number : item) {
            x.add(Integer.parseInt(number));
        }


        System.out.println(item);

        //[1, 2, 3, 4, 5]

        for(int i =0;i<item.size();++i)
        {
            int temp= value - x.get(i);

            if(numberList.contains(temp))
            {
                System.out.println(x.get(i)+","+temp);
            }
            numberList.add(x.get(i));
        }



    }



}
