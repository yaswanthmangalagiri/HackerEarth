import java.util.*;
public class Enlighten
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the N and K");
            ArrayList<Integer> li=new ArrayList<Integer>();
            int N=in.nextInt();
            int temple[]=new int[N];
            int K=in.nextInt();
            for(int n=0;n<N;n++)
            {
                temple[n]=in.nextInt();
            }
            int diff=0;
            for(int tem=1;tem<N;tem++)
            {
                for(int tem2=tem-1;tem2<tem;tem2++)
                {
                    diff=(temple[tem]-temple[tem2])/2;
                    li.add(diff);
                }
            }
            int min=li.get(0);
            for(int i=1;i<N-1;i++)
            {
                if(li.get(i)<min)
                {
                    min=li.get(i);
                }
            }      
            System.out.println(min);
        }
    }
                    