import java.util.*;
public class Divisorsrangetest
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the N A & B");
        long N=in.nextLong();
        int A=in.nextInt();
        int B=in.nextInt();
        int count=0;
        for(long i=1;i<=N;i++)
        {
            if(i%A==0)
            {
                count++;
            }
            else if(i%B==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}