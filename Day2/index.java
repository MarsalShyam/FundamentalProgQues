import java.util.*;
class index{

    //Q4. Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%).  
    static void arith(int a ,int b){
        System.out.println("a+b= "+(a+b));
        System.out.println("a-b= "+(a-b));
        System.out.println("a*b= "+(a*b));
        System.out.println("a/b= "+(a/b));
        System.out.println("a%b= "+(a%b));
    }
    //Q5. Create a program to calculate product of two floating points numbers. 
    //*****************doubt */
    public static void productOfFloat(float a,float b){
        System.out.println(a+b);
    }
    // 6. Create a program to calculate Perimeter of a rectangle. Perimeter of rectangle ABCD = A+B+C+D
    public static double perimeterOfRect(double a,double b,double c,double d){
        return a+b+c+d;
    }

    //7. Create a program to calculate the Area of a Triangle. Area of triangle = ½*B*H  
    static double AreaOfTriangle(double b,double h){
        return (b*h)/2;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        // System.out.println("Enter a value: ");
        // int a=sc.nextInt();
        // System.out.println("Enter b value: ");
        // int b=sc.nextInt();
        // arith(a, b);

        // productOfFloat(12,2);

        // System.out.println("now we are going to findout the perimeter of a rectangle");
        // System.out.print("Enter a Value: ");
        // double a=sc.nextDouble();
        // System.out.print("Enter b Value: ");
        // double b=sc.nextDouble();
        // System.out.print("Enter c Value: ");
        // double c=sc.nextDouble();
        // System.out.print("Enter d Value: ");
        // double d=sc.nextDouble();
        // System.out.println("then Perimeter Of rectangle ABCD is "+perimeterOfRect(a, b, c, d));

        System.out.println("Now we are going to find out the Area of teangle");
        System.out.println("Pease enter the Breadth of triangle: ");
        double b=sc.nextDouble();
        System.out.println("Pleases enter the Height of the triangle: ");
        double h=sc.nextDouble();
        System.out.println("The Area of Triangle for above given data is "+AreaOfTriangle(b, h));

    }
}