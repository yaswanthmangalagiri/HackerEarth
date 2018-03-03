import java.util.*;
public class Difference
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");
        int T=in.nextInt();
        String result=""; 
        for(int x=1;x<=T;x++)
        {
            System.out.println("Enter the N,M,A,B&C");
            int N=in.nextInt();
            int D=in.nextInt();
            int NArray[]=new int[N];
            for(int n=0;n<N;n++)
            { 
                NArray[n]=in.nextInt();
            }  
            int count=0;
            for(int i=0;i<N;i++)
            {
                for(int j=i+1;j<N;j++)
                {
                int diff=NArray[j]-NArray[i]; 
                if(diff<=D)
                {
                    System.out.println("Difference "+diff);
                    count++;
                }
            }
        }
        if(count>=1)
        {
            result+="YES";
        }
        else
        {
            result+="NO";
        }
    }
    System.out.println(result);
}
}
