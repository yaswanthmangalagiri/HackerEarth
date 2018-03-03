import java.util.*;
public class PokeTravel
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the D & K");
        int D=in.nextInt();
        int K=in.nextInt();
        int Ver[][]=new int[K][K];
        for(int i=0;i<K;i++)
        {
            for(int j=0;j<K;j++)
            {
                Ver[i][j]=in.nextInt();
            }
        }
        int sum=0;int sum2=D
        for(int i=0;i<K;i++)
        {
            if(Ver[i][0]==i)
            {
                if((Ver[i][1]-Ver[i][0])>=Ver[i][2])
                {                   
                    sum+=Ver[i][2];
                     System.out.println("Sum "+sum);
                }
            }
            else
            {
                sum+=
            }
        }
        System.out.println("Cost "+sum);
    }
}