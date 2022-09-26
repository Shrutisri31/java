import java.util.*;
public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n:");
        int num = sc.nextInt();
        int rem = 0,temp=0;
        int n=num;
        while(n>0)
        {
            rem=n%10;
            temp=temp*10+rem;
            n=n/10;

        }
        System.out.println(temp);
    }
}
