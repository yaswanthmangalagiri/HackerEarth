import java.util.*;
import java.lang.*;
public class Laptop
{      
    public static void main(String args[]) throws NullPointerException
    {
        ArrayList<String> li=new ArrayList<String>();
         ArrayList<String> ll=new ArrayList<String>();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Test cases");
        int N=in.nextInt();
       int counter[]=new int[N];
       String S[]=new String[N];
       String company="";  String com="";
       int max=0;
            System.out.println("Enter the array");
        for(int t=1;t<=N;t++)
        {
            S[t-1]=in.next();           
            li.add(S[t-1]);
        }       
          int count=0;
           for(int i=0;i<li.size();i++)
            {
                count=0;
                for( int k=0;k<li.size();k++)
                {
                    if(li.get(i).equals(li.get(k)))
                    {
                        count++;                        
                        if(counter[i]>1)
                        {
                        li.remove(k);                        
                        }
                    }    
                    counter[i]=count;
                } 
            }              
                max=counter[0];int ind=0;
              count=0;
            for(int x=0;x<li.size()-1;x++)
            {  
                if(max<counter[x+1])
                    {
                    max=counter[x+1];
                    ind=x+1;
                }     
        }
        System.out.println("The max "+max);
         for(int l=0;l<li.size()-1;l++)
        {
            if(max==counter[l])
            {               
                count++;
                ll.add(li.get(l));
        }
    }
    if(count>1)
    { 
        for(int j=0;j<ll.size();j++)
        { 
            for(int m=j+1;m<ll.size();m++)            
            {         
                    if(ll.get(m).compareTo(ll.get(j))<0)
                    {
                        String al=ll.get(j);
                        ll.set(j,li.get(m));
                        ll.set(m,al);
                    }                     
            }
            company+=ll.get(j)+"\n";
        }
    }
     else
     {
             com=li.get(ind);
             company=com;
    }  
       System.out.println("The Alphabet: "+company);
}
}          