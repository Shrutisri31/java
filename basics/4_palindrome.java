import java.util.Scanner;

public class palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int temp=n;
        int rev=0,rem;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println(n+" is palindrome number");
        }
        else{
            System.out.println(n+" is not a palindrome number");
        }
    }
}
