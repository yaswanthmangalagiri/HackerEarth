import java.util.*;
public class Ropes
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");        
        int T=in.nextInt();
        for(int x=0;x<T;x++)
        {
            int min=0;
            int L=in.nextInt();   
            int upper[]=new int[L-1];
            int lower[]=new int[L-1];
            for(int i=0;i<L-1;i++)
            {
                upper[i]=in.nextInt();
            }
            for(int j=0;j<L-1;j++)
            {
                lower[j]=in.nextInt();
            }   
            for(int i=2;i<=L;i++)
            {
                for(int j=1;j<i;j++)
                {
                    if(upper[j-1]>0)
                    {
                    upper[j-1]=upper[j-1]-1;
                }
                if(lower[j-1]>0)
                    {
                    lower[j-1]=lower[j-1]-1;
                }
                }
            }
            int maxup=upper[0];
            for(int i=0;i<L-1;i++)
            {
                if(maxup<=upper[i])
                {
                    maxup=upper[i];
                }
            }
            int maxlow=lower[0];
            for(int i=0;i<L-1;i++)
            {
                if(maxlow<=lower[i])
                {
                    maxlow=lower[i];
                }
            }            
            if(maxup<maxlow)
            {
                min=maxlow+L;
            }
            else
            {
                min=maxup+L;
            }
            System.out.println("Minutes "+min);
                }
            }
            
            }