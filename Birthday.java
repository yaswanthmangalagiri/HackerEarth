import java.util.*;
import java.lang.*;
public class Birthday
{      
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Test cases");
         int T=in.nextInt();
         String list="";  
        for(int t=1;t<=T;t++)
        {
            ArrayList<String> li=new ArrayList<String>();
            ArrayList<String> ll=new ArrayList<String>();
            System.out.println("Enter the N");
            int N=in.nextInt();
            String S[]=new String[N];            
            System.out.println("Enter the array");
            for(int i=0;i<N;i++)
            {
                S[i]=in.next();           
                li.add(S[i]);
            } 
            for(int i=0;i<li.size();i++)
            {
                int count=0;
                for( int k=0;k<li.size();k++)
                {
                   System.out.println("the Entering array: "+li.get(k)); 
                    if(li.get(i).equals(li.get(k)))
                    {
                        count+=1; 
                        if(count>1)
                        {
                            li.remove(k); 
                        }
                    } 
                }
                ll.add(li.get(i));
                System.out.println("the New array: "+ll.get(i));
            }
            for(int j=0;j<ll.size();j++)
            { 
                for(int m=j+1;m<ll.size();m++)            
                {         
                    if(ll.get(m).compareTo(ll.get(j))<0)
                    {
                        String al=ll.get(j);
                        ll.set(j,ll.get(m));
                        ll.set(m,al);
                    }                     
                }
                list+=ll.get(j)+"\n";
            }
    }
       System.out.println("The Alphabet: "+list);
}    
}      