import java.util.*;
public class Operations
{      
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter N & K");
        int N=in.nextInt();
        int NArr[]=new int[N];
        for(int n=0;n<N;n++)
        {
            NArr[n]=in.nextInt();
        }
        int O=in.nextInt();
        int D=in.nextInt();
        for(int o=0;o<O;o++)
        {
            for(int n=0;n<N;n++)
            {
                NArr[n]=NArr[n]/D;
            }
        }
        for(int n=0;n<N;n++)
        {
            System.out.print(NArr[n]+" ");
        }
    }
}
        
            