import java.util.*;
public class Witch
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the cases");
        int T=in.nextInt();
        String result="";
        System.out.println("Enter the N,M & K");
        for(int t=0;t<T;t++)
        {  
            int NA[]=new int[3];
            for(int n=0;n<3;n++)
            {
                NA[n]=in.nextInt();
            }
            int count=0;
            while((NA[0]<=NA[1]-1)&&(NA[1]+1<=NA[2]))
            {
                int diff1=NA[1]-NA[0];
                int diff2=NA[2]-NA[1];
                if(diff1<diff2)
                {
                    NA[0]=NA[2]-1;
                    count++;
                }
                else if(diff1>diff2) 
                {
                    NA[2]=NA[0]+1;
                    count++;
                }
                else if((diff1==diff2)&&(diff1>1)&&(diff2>1))
                {                   
                    NA[0]=NA[2]-1;
                    count++;
                }
                else 
                {
                    break;
                }
                Arrays.sort(NA);
            }
            System.out.println(count);
        }
    }
}