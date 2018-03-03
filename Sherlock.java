import java.io.*;
import java.util.*;
public class Sherlock

{      
    public static void main(String args[]) throws IOException
    {Scanner in=new Scanner(System.in);
                    String sherlock="";
        System.out.println("Enter the cases");
        int n=in.nextInt();  
        for(int c=1;c<=n;c++)
        {

        ArrayList<Integer> li= new ArrayList<Integer>();        

        System.out.println("Enter the size");
        int N=in.nextInt();         
        System.out.println("Enter the K");
        int K=in.nextInt();
        System.out.println("Enter the P");
        int P=in.nextInt();
        System.out.println("Enter the array");
        int k[]=new int[K];
        for(int s=0;s<K;s++)
        {
            k[s]=in.nextInt();
        }
         for(int i=1;i<=N;i++)
        {
            li.add(i);
        }        
        System.out.println("The Initial Array "+li);
        for(int x=0;x<K;x++)
        {
            li.remove(k[x]-1);
   }      
     System.out.println("The Array after removal "+li);
        if(P>li.size())
        {
            sherlock+="-1"+"\n";
        }
        else
        {
        sherlock+=li.remove(P-1)+"\n";        
    }
}
System.out.println(sherlock);
    }
    }
