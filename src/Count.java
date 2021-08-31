import java.util.*;
public class Count{
    public static void main(String args[]){

        String str = "Malayalam";
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();//Creating HashMap
      // map.put('M',1);  //Put elements in Map
       /* map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");*/
        for(int i=0;i<str.length();i++)
        {
            System.out.println(map.get(str.charAt(i)));
            int value =  map.get(str.charAt(i));

           if(map.containsKey(str.charAt(i))==true)
            {

              if(value==0)
              {
                  value=1;
              }
              else value++;

                map.put(str.charAt(i),value);

            }
           else{
               map.put(str.charAt(i),value);
           }

        }


        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}  