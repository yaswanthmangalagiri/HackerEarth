import java.util.*;
public class Interest
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");
        int T=in.nextInt();
         String nth="";
        for(int t=1;t<=T;t++)
        {       
        int x=in.nextInt();       
        int y=in.nextInt();
        int N=in.nextInt();
        int Series[]=new int[N];
        for(int i=0;i<N;i++)
        {
            if(i<x)
            {
                Series[i]=y;
            }
            else if(i>=x)
            {
                for(int j=i-1;j>=i-x;j--)
                {
                    Series[i]+=Series[j];
                }
            }
             System.out.println("The Number is "+Series[i]);
        }     
        nth+=Series[N-1]+"\n";
    }
    System.out.println("The Nth is "+nth);
}
}