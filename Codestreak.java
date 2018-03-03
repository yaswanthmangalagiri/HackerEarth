import java.util.*;
public class Codestreak
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");        
        int T=in.nextInt();
        String result=""; 
        for(int x=1;x<=T;x++)
        {
            int N=in.nextInt();
            int SR[][]=new int[N][2];
            for(int n=0;n<N;n++)
            {
                SR[n][0]=in.nextInt();
                SR[n][1]=in.nextInt();
            }
            int count=0;
            for(int  i=0;i<N;i++)
            {
                System.out.println("Testing "+"i "+SR[i][0]);
            	if(SR[i][0]!=0)
            	{
            		int repeat=0;
                	for(int n=0;n<N;n++)
                	{
                	if(SR[i][0]==SR[n][0])
                	{
                		if(SR[n][1]==1)
                		{
                    		count++;
                    		System.out.println("Counting of "+SR[n][0]+" "+count);
                    		if(i!=n)
                    		{
                    		    count--;
                    		    System.out.println("Making Zero "+"n "+n);
                    			SR[n][0]=0;	
                    		}
                		}
                	}
            		}  
            	}
            }        
            result+=count+"\n";
        }
        System.out.println(result);
    }
}
            