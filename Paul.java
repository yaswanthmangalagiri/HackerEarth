import java.util.*;
public class Paul
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");
        int T=in.nextInt();
        String result="";       
        System.out.println("Enter the Numbers");
        for(int i=1;i<=T;i++)
        {
            int a[]=new int[3];
            for(int j=0;j<3;j++)
            {
                a[j]=in.nextInt();
            } 
            int max=a[0];
            for(int n=0;n<3;n++)
            {
                if(max<a[n])
                {
                    max=a[n];
                }
            }    
           int decision=1;
           if((a[0]!=0)&&(a[1]!=0)&&(a[2]!=0))
              {
           for(int m=2;m<=max;m++)
           {              
           if((a[0]%m==0)&&(a[1]%m==0)&&(a[2]%m==0))
                {
                    decision=0;
                }
            }
        }
            else
            {
                decision=0;
            }
               if(decision==1)
                {
                    double C=(a[2]*a[2]);
                    double B=(a[1]*a[1]); 
                    double A=(a[0]*a[0]);
                    if(C==(A+B))
                    {
                        result+="YES"+"\n";
                    }  
                    if(B==(A+C))
                    {
                        result+="YES"+"\n";
                    }  
                    if(A==(C+B))
                    {
                        result+="YES"+"\n";
                    }  
                    else
                     {
                        result+="NO"+"\n";  
                    }
                }
                else
                {
                    result+="NO\n";
                }
                
    }
    System.out.println(result);
    }
}
