import java.util.*;
public class Coloroverdose
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);  
        System.out.println("Enter the N & M");
        int N=in.nextInt();
        int C=in.nextInt();
        int M=in.nextInt();
        int NA[]=new int[N];
        for(int i=0;i<N;i++)
        {
            NA[i]=in.nextInt();
        }
        int countsub=0;int subset[]=new int[Math.pow(2,N)];int ss=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<=i;j++)
            {
                subset[ss]=NA[j];
                ss++;
            }
        }
        
        System.out.println(countsub+1);
                }
        
    }
    
                
                    