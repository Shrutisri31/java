public class Fibonacci_recursive {

    static int a=0,b=1,c;
    void printFib(int i){
        if(i>=1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            printFib(i-1);

        }
    }
    public static void main(String[]args){
        System.out.println("fibonacci series is:");
        System.out.print(a+" "+b);
        Fibonacci_recursive ob = new Fibonacci_recursive();
        ob.printFib(10);
    }
}
