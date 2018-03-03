
import java.util.*;

public class Interview
{      
    public static void main(String args[])
    {
        ArrayList<Integer> li=new ArrayList<Integer>();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Test cases");
        int N=in.nextInt();  int S[]=new int[N];      
       int sum=0;
        System.out.println("Enter the array");
        for(int t=1;t<=N;t++)
        {
           
            S[t-1]=in.nextInt();           
            li.add(S[t-1]);
        }       
            for(int x=0;x<li.size();x++)
            {  
                System.out.println("the New array "+li.get(x));
                   sum+=li.get(x);
                   if(li.get(x)==0)
                   {
                       sum=sum-li.get(x-1);
                    }
            }
     System.out.println("Sum: "+sum);
            }            
        }

   
                    