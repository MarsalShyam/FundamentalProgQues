import java.util.Scanner;
public class index{

    // 11. Create a program that determines if a number is positive, negative, or zero. 
    public static void checknum(int n){
        if(n>0){
            System.out.println("Given Number positive.");
        }else if(n<0){
            System.out.println("Given Number negative.");
        }else{
            System.out.println("Given Number is zero");

        }
    }
    // 12. Create a program that determines if a number is odd or even.  
    private static void checkodev(int n){
        if(n%2==0){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }
    }
    // 13. Create a program that determines the greatest of the three numbers.
    private static int greatest(int a,int b,int c){
        if(a>b&&a>c){
            return a;
        }else if(b>a&&b>c){
            return b;
        }else{
            return c;
        }
    }
//     14. Create a program that determines if a given year is a leap year (considering conditions like divisible by 4 but 
// not 100, unless also divisible by 400).  
private static void leapCheck(int y){
    if(y%4==0 && (y % 100 !=0 || y%400==0)){
        System.out.println("Given number is leap year");
    }else{
        System.out.println("Given year is not leap year");
    }
}
// 15. Create a program that calculates grades based on marks 
// A -> above 90%  
// B -> above 75%  
// C -> above 60%  
// D -> above 30%  
// F -> below 30% 
private static void greadCal(int x){
    double y=x*100.0/500;
    if(y>90){
        System.out.println("above 90%");
    }else if(y>75){
        System.out.println("above 75%");
    }else if(y>60){
        System.out.println("above 60%");
    }else if(y>30){
        System.out.println("above 30%");
    }else{
        System.out.println("below 30%");
    }
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ram Is a good boy");
        checknum(4);
        checkodev(5);
        System.out.println(greatest(3,9,4));
        greadCal(450);
        leapCheck(2024);
        leapCheck(1900);
        leapCheck(2000);
        // System.out.println(400*100/500);
    }
}