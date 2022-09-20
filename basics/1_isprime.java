import java.util.Scanner;

public class isPrime {
    public static void main(String[]args){
        System.out.println("enter t:");
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        System.out.println("enter n:");
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            //check prime
            int count=0;
            for(int div=1;div<=n;div++){
              if(n%div==0){
                  count++;
              }
            }
            //out of loop , check count
            if(count==2){
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }

        } 

        //optimized solution
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            //check prime
            int count=0;
            for(int div=2;div * div<= n;div++){
                if(n%div==0){
                    count++;
                    break;
                }
            }
            //out of loop , check count
            if(count==0){
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }

        }
    }
}
