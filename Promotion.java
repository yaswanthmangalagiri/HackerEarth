import java.util.*;
public class Promotion
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);  
        System.out.println("Enter the N & M");
        int N=in.nextInt();
        int M=in.nextInt();
        int NA[]=new int[N];
        int MA[]=new int[M];
        String result=""; 
        for(int n=0;n<N;n++)
        {
            NA[n]=in.nextInt();
        }
        for(int m=0;m<M;m++)
        {
            MA[m]=in.nextInt();
        }
        int time=0;int count=N;int a=0;
        for(int i=0;i<N;i=a)
        {
        for(int j=0;j<M;j++)
        {  
            if(i<=N-1)
            {
            if(NA[i]<=MA[j])
            {
                count--;
                i++;
                System.out.println("i in first "+i);
            }
        }
            System.out.println("Count "+count);
        }
        a=i;
        if(count==0)
        {
            time++;
            System.out.println("Time "+time);
        }
        else
        {
            time+=2;
            System.out.println("Time "+time);
        }
        }
        System.out.println(time);
    }
}        
                
    