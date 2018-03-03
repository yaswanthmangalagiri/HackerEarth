import java.io.*;
public class Climbingstairs
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter nos.");   
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        
    	  int up=0,down=0;int daycount=0;
        while(up<=n)
       { 
            up+=a;                     
            down=up-b;
            up=down;
            daycount++;   
        }
                    
         System.out.println(daycount);            
    }
}