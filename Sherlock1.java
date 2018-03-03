import java.util.*;
public class Sherlock1

{      
    public static void main(String args[]) 
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
        int l=0;
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
            l=li.indexOf(k[x]);
            li.remove(l);
   }   
    System.out.println("The New Array "+li);
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
