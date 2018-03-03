import java.io.*;
class Trailingzeros
{
   
    static long fact(long N)
        {
              while(N>=0)
               if(N<0)
                return -1; 
               else if(N==0)
               return 1;     
               else
               return N*fact(N-1);
        return N*fact(N-1);
    }
    public static void main(String args[] ) throws Exception
    {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         Trailingzeros f=new Trailingzeros();
        System.out.println("Enter the Number");
        long m= Long.parseLong(br.readLine());
        long result=fact(m);
              System.out.println("Factorial: "+result);
            String no=Long.toString(result);
               char c[] = new char[no.length()];
               no.getChars(0, no.length(), c, 0);
               int count =0;
               for (int j=c.length-1;j>=0;j--)
                {
                    
                    if(c[j]=='0')
                    count++;
                    else
                    break; 
                }
                System.out.println("Number of Zeros: "+count);
               }
}
