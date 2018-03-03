import java.util.*;
public class MagicalShoptest
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the A , B & String");
        long A=in.nextLong();
        long B=in.nextLong();
        String allow=in.next();
        long potion=A;
        long buy=0;
        for(int i=allow.length()-1;i>=0;i--)
        {
            if(allow.charAt(i)=='1')
            {
                buy+=potion;
                System.out.println("The Buy: "+buy);
            }
            potion=potion*potion;
        }
        System.out.println("Result "+buy%B);
    }
}
            
                