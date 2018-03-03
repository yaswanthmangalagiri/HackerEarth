import java.util.*;
public class JosephString
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the N");
        int N=in.nextInt();
        String S=in.next();
        int Q=in.nextInt();
        for(int i=0;i<Q;i++)
        {            
            int[] QA=new int[3];
            for(int j=0;j<3;j++)
            {
               QA[j]=in.nextInt();
            }
            for(int k=QA[1];k<=QA[2];k++)
            {
                System.out.println("The query "+k);
                int count=0; ArrayList<Integer> ll=new ArrayList<Integer>();
                String newS=S.substring(QA[0]-1,k);
                    for(int m=QA[0]-1;m+newS.length()<=S.length();m++)
                    {
                        if(S.substring(m,m+newS.length()).equals(newS))
                        {
                            count++;
                        }
                    }
                     System.out.println("The query "+k+" count "+count);
                    int occurance=count*newS.length();
                    ll.add(occurance);
             
                int max=0;
                for(int l=0;l+1<ll.size();l++)
                {
                    if(ll.get(l)<ll.get(l+1))
                    {
                        max=ll.get(l+1);
                    }
                }
                System.out.println("Max "+max);
        }
    }
}
}


            
            