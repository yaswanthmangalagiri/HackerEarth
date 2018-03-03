import java.util.*;
public class Game
{      
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Test cases");
         int T=in.nextInt();
         String list=""; 
         for(int t=1;t<=T;t++)
        {
            System.out.println("Enter the N:");
            int N=in.nextInt();  int counter[]=new int[N+1];
                String sign[]=new String[N+1];
            for(int x=0;x<=N;x++)
            {  
                 System.out.println("The picked no. is: "+x);
               String ch=""; int count=0;int m=0;
               for(int i=1;i<=N;i++)
               {                  
                if((x-i)>=0)
                {
                       count++;
                       ch+="-"; m=x-i;                       
                } 
                else if((m+i)==N)
                {
                        count++;
                        ch+="+";
                       m+=i;
                }
            }
                System.out.println("The string is: "+ch);
                sign[x]=ch;
                counter[x]=count;
            }                
            int max=counter[0]; 
            for(int i=1;i<N;i++)
            {
                if(max<=counter[i])
                {
                    max=counter[i];
                }  
            }            
            System.out.println("The Max is "+max);
            for(int i=0;i<N;i++)
            {
                if(max==counter[i])
                {
            list+=counter[i]+" "+i+"\n"+sign[i]+"\n";
            }  
            }
                    }
        System.out.println("The Result is "+list);
    }
}
        