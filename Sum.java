import java.util.*;
public class Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int multiply = a*b;
        int sum = a+b;
        int substract = a-b;
        int devide = a/b;
        System.out.println("multiplication = " +multiply);
        System.out.println("sum = " +sum);
        System.out.println("substract = " +substract);
        System.out.println("devide = " +devide);
    }
}