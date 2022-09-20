import java.util.Scanner;

public class factorialOfNumber {
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("invalid number");
            return;
        }
        //loop (i-n to 1 , dec by 1)
        int factorial=1;
        for(int i=n; i>=1 ;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
           return;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to get factorial:");
        int n= sc.nextInt();
        printFactorial(n);


    }
}
