import java.util.*;
public class Lemurs
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the N and K");
        int N=in.nextInt();
        int K=in.nextInt(); int minute=0;
        if(N%K!=0)
        {
            N++;
            System.out.println(N);
            minute++;
        }
        if(N%K!=0)
        {
            N--;
            minute++;
        }
        if(N%K!=0)
        {
            K++;
            minute++;
        }
        if(N%K!=0)
        {
            if(K>=2)            
            K--;
            minute++;
        }
        System.out.println("The minute: "+minute);
    }
}
            