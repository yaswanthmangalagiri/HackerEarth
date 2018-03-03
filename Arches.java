import java.util.*;
public class Arches
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the T ");
        int N=in.nextInt();
        String NA[]=new String[N];
        for(int t=0;t<N;t++)
        {
            NA[t]=in.next();
        }
            int decision=0;
        int count=0; 
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<NA[i].length();j++)
            { 
                if(NA[i].length()==2)
                {
                    count++;
                }
                else if(NA[i].length()>=3)
                {
                if((NA[i].charAt(j)!=NA[i].charAt(j+1))&&(NA[i].charAt(j+1)!=NA[i].charAt(j+2)))                    
                    {
                        count++;     
                        decision=1;
                        break;                                           
                    }  
                }
                if(decision==1)
                {
                    break;
                }                
            }
            }
        System.out.println("Count "+count);
    }
}
                        