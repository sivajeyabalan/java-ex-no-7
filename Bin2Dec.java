
package javaex7;
import java.util.*;

/**
 *
 * @author SIVAJB
 */

public class Bin2Dec
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s;
        int dec=0,result=1;
        
        System.out.print("\nEnter a Binary string: ");
        s=obj.next();
        char arr[]=s.toCharArray();
        int n=arr.length;
        
        for(int i=n-1;i>=0;i--)
        {
            char t=arr[i];
            int num=Character.getNumericValue(t);
            if(num==1)
            {
                dec+=Math.pow(2,n-1-i);
            }
            else if(num==0)
            {
                dec+=0;
            }
            else
            {
                result=0;
                break;
            }
        }
        
        if(result==1)
            System.out.println("\nThe equivalent decimal number for binary \""+s+"\" is: "+dec);  
        else
            System.out.println("\nerror: invalid binary string \""+s+"\"");
    }    
}
