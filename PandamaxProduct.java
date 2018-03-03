import java.util.*;
public class PandamaxProduct
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the cases");
        int N=in.nextInt();
        long NA[]=new long[N];
        for(int n=0;n<N;n++)
        {
            NA[n]=in.nextLong();
        }
        int k=0;
        long productarray[]=new long[2*N];
        for(int i=0;i<N;i++)
        {
             for(int j=i+1;j<N;j++)
             {
                 productarray[k]=NA[i]*NA[j];
                 k++;
                }
            }
        long max=productarray[0];
         for(int i=0;i<2*N;i++)
        {   
            if(max<productarray[i])
            {
                max=productarray[i];
            }
        }
        System.out.println(max);
    }
}
       