import java.util.*;
public class Armstrong_no {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
        System.out.println("enter number n:");
        int n = sc.nextInt();
                double temp;
                double  Armstrong=0;
               int original = n;
               while(n>0){
                   temp=n%10;
                   temp = (Math.pow(temp,3));
                   Armstrong = Armstrong + temp;
                   n = n/10;
               }
               if(Armstrong==original)
                   System.out.println("Armstrong number");
               else
                   System.out.println("Not an Armstrong number");
        }
    }
