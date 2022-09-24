import java.util.Scanner;

public class Digits_frequency {
    public static int getDigitFrequency(int n , int d){
        int rev=0;

        while(n>0){
            int dig = n % 10;
            n = n/10;

            if(dig==d){
                rev++;
            }
        }
        return rev;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number n:");
        int n = sc.nextInt();
        System.out.println("enter the digit to find frequency");
        int d = sc.nextInt();
        int f = getDigitFrequency(n,d);
        System.out.println(d+" is occurred "+f+" times in given number");
    }

}
