import java.util.*;
public class Simpletask
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the cases & Array");
        int T=in.nextInt();
        String result="";
        for(int t=0;t<T;t++)
        {
        int NA[]=new int[3];
        int OA[]=new int[3];
        int CA[]=new int[3];
        for(int n=0;n<3;n++)
        {
            NA[n]=in.nextInt();
            OA[n]=NA[n];
            CA[n]=NA[n];
        }
        String LA[]=new String[3];
        LA[0]="R";
            LA[1]="K";
            LA[2]="V";        
        for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<3;j++)
            {
                if(NA[i]<NA[j])
                {
                    int temp=NA[j];
                    NA[j]=NA[i];
                    NA[i]=temp;
                }
            }
            System.out.println("NA Arranged "+NA[i]);
        }
        int max[]=new int[3];
        for(int i=0;i<3;i++)
        {
            if(OA[i]!=0)
            if(NA[0]==OA[i])
            {
                max[0]=i;
                OA[i]=0;
            }
            if(NA[1]==OA[i])
            {
                max[1]=i;
                OA[i]=0;
            }
            if(NA[2]==OA[i])
            {
                max[2]=i;
                OA[i]=0;
            }
        }
        String word="";
        while(!(CA[max[0]]==0))
        {
            word+=LA[max[0]];
            CA[max[0]]--;
            if(CA[max[1]]!=0)
            {
                word+=LA[max[1]];
                CA[max[1]]--;
            }             
            }
            int count=0;
            if(word.length()>1)
            {
                count=1;
            for(int i=0;i+1<word.length();i++)
            {
                if(word.charAt(i)!=word.charAt(i+1))
                {
                      count++;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            
    System.out.println("Word "+word);
        result+=count+"\n";
        }
    System.out.println("Result "+result);
}
}