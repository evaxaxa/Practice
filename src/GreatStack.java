public class GreatStack {

    int top=0;
    public static int[] a = {11, 13, 21, 3};
    int item[] = new int[a.length];

    int push (int a)
    {
       if(top ==item.length-1)
       {
           System.out.println("STACK OVERFLOW");
       }
       else {
           item[top++]=a;

       }
        //System.out.println("a="+a);
        return a;
    }
    int pop()
    {
        if(top == -1)
        {
            System.out.println("STACK UNDERFLOW");
            return -1;
        }
        else{
            int temp;

            temp=item[top--];
            //System.out.println("item[top]="+item[top]);
            return item[top];
        }
    }

    void nextGreat(int a[])
    {
        int next;
        int y=0;
       item[y]=push(a[0]);
       // System.out.println("item[y]"+item[y]);
        for(int i=1;i<a.length;i++)
        {
            next = a[i];
            int k=-1;
          // System.out.println("a[i]="+a[i]);
            if(next>item[y])
            {
                //next =a[i+1];
                int x=pop();
                k=next;
                push(next);
                System.out.println(x+"----->"+k);
            }                                   //{11, 13, 21, 3};
            else {
                 push(next);
                 //System.out.println(next+"----->"+-1);
            }
        }

       /* for(int i=0;i<item.length;i++)
        {
            System.out.println("value="+item[i]);
        }*/
        int i=item.length-1;
        while(i>=0){

           if (item[i]!=0)
           {
               System.out.println(item[i]+"----->"+-1);
           }
           i--;

    }

    }

        public static void main(String args[])
        {
            GreatStack g = new GreatStack();

           g.nextGreat(a);
        }

    }



