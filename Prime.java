import java.io.*;
import java.util.*;
public class Prime 
{      
    public static void main(String args[]) throws IOException
    {
        ArrayDeque<Integer> st = new ArrayDeque<Integer>();        
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size");
        int size=Integer.parseInt(br.readLine());
        int counter =0; int k=0;
        System.out.println("Enter the array");
        int a[]=new int[size];       
         for(int s=0;s<a.length;s++)
        {
            a[s]=Integer.parseInt(br.readLine());
        }
        try
        {
         int i=0;
         while(i<size)
         {
            counter=0;
             int j=0;
           while(j<size)
        
           {    System.out.println("The Dividend is "+a[i]);
                      if(a[i]%a[j]==0)  
                      {
                           System.out.println("The Successful divisor is "+a[j]); 
                                  counter=counter+1;
                    }
                         System.out.println("The New divisor is "+a[j]);                                                
                   j++;                 
           }
                 if(counter==1)
                 {
                     System.out.println("Yes "+a[i]);
                    st.add(a[i]);
                                       }   
               i++;
        }
        
      while(st.peek()!=null)
      {
System.out.print(st.pop()+ " ");
    }
}
        catch(ArithmeticException e)
            {
                System.out.println("Exception");
            }
                   }
    }
