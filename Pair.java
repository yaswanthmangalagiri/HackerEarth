import java.util.*;
public class Pair
{      
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter N and Strings");
        int N=in.nextInt();
        int NArr[]=new int[N];
        for(int n=0;n<N;n++)
        {
            NArr[n]=in.nextInt();
        }
        int countpair=0;
        for(int i=0;i<N;i++)
        {
            int a=NArr[i];
            System.out.println("NArr[i]: "+NArr[i]);
            int count=0;
            if(NArr[i]!=0)
            {
            for(int j=0;j<N;j++)
            {
                if(a==NArr[j])
                {
                     NArr[j]=0;
                    count++;
                    if(count==2)
                    {
                        countpair++;
                        count=0;
                    }
                }
            }
        }
        }
        System.out.println("Result "+ countpair);
    }
}
        