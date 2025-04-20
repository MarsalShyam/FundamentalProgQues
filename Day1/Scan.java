import java.util.*;

public class Scan{

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+","+b);
    }
    public static void arith(int a, int b){
        System.out.println("a+b: "+(a+b));
        System.out.println("a-b: "+(a-b));
        System.out.println("a*b: "+(a*b));
        System.out.println("a/b: "+(a/b));
        System.out.println("a%b: "+(a%b));

    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the Name: ");
        // String name=sc.next();
        // System.out.println("Welcome "+name+" skill develpment Training");
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.println("Enter b number: ");
        int b=sc.nextInt();
        arith(a, b);
        //System.out.println("The add of a and b is "+(a+b));
        //System.out.println("a,b : "+a+","+b);
        //swap(a,b);
        //swap(a,b);
        // System.out.println("a,b : "+a+","+b);
        
    }
}