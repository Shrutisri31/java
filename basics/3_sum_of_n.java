import java.util.Scanner;

public class sum_of_n_int {
    public static int sum0fNum(int n){
        int sum = (n*(n+1))/2;
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int sum = sum0fNum(n);
        System.out.println("sum of integer 1 to n: "+sum0fNum(n));
    }
}
