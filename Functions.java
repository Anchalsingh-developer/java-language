import java.util.*;
public class Functions{
    public static int calculateproduct(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first product a value(a) = ");
        int a = sc.nextInt();
        System.out.print("Enter second product b value(b) = ");
        int b = sc.nextInt();
        int result = (a*b);
        System.out.println("Calculation the product of 2 numbers( a and b) = " + result);
    }
}