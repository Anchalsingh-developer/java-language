import java.util.*;
public class Function{
//    public static int multiply(int a, int b){
//     return a*b;
//    }
//    public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("enter first value  ");
//     int a = sc.nextInt();
//     System.out.print("enter second value  ");
//     int b = sc.nextInt();
//     //int result=multiply(a,b);
//     System.out.println("multiplication of 2 numbers:-  "+ multiply(a,b));
//    }
public static void printfactorial(int n){
    //loop
    if(n<0){
        System.out.println("invalid number");
        return;
    }
    int factorial=1;
    for(int i=n; i>=1; i--){
factorial=factorial*i;
    }
    System.out.println(factorial);
    return;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number  ");
    int n = sc.nextInt();
    System.out.print("factorial  ");
    printfactorial(n);
}
}