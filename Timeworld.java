import java.util.*;
public class Timeworld
{      
    public static void main(String args[]) throws NullPointerException
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Cases");
        int T=in.nextInt();
        String result="";        
        for(int t=0;t<T;t++)
        {
            System.out.println("Enter the N& K");
        int N=in.nextInt();
        int K=in.nextInt();
        int A[]=new int[N];
           System.out.println("Enter the Array");
        for(int n=0;n<N;n++)
        {
            A[n]=in.nextInt();
        }  
        int n=0;
        int sum[]=new int[N];
        for(int i=0;i<N;i++)
        {  
             int x=0; int y=A[i];
            for(int j=i+K+1;j<N;j=x+K+1)
            {
                int ind[]=new int[N];
                int initialsum=y;
                System.out.println("Y value "+y);
                int addarr[]=new int[N];
                for(int l=j;l<N;l++)
                { 
                   addarr[l-j]=initialsum+A[l];
                    ind[l-j]=l;                     
                }
               int max=addarr[0]; y=max;x=ind[0];
               for(int no=0;no<addarr.length;no++)
               {
                   if(max<addarr[no])
                   {
                       max=addarr[no];  
                       x=ind[no]; 
                       y=max;
                   } 
               }
                 System.out.println("The picked up number "+x);
                  System.out.println("The Max. Sum "+y);
               sum[n]=y;
            }           
            n++;
        }
            long max1=sum[0];
            for(int m=0;m<sum.length;m++)
            {
                if(max1<sum[m])
                {
                    max1=sum[m];
                }            
            }
            result+=max1+"\n";
        }
        System.out.println(result);
    }
}
//1 2 -3 -5 4 6 -3 2 -1 2