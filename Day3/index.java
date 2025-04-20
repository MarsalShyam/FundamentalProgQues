import java.util.*;

public class index{

	// 8. Create a program to calculate simple interest.  
	// (Simple Interest = (P x T x R)/100)     
	public static double simpleInterest(int p,int t,int r){
		double simInt=(p*t*r)/100;
		return simInt;
	}
// 	9. Create a program to calculate Compound interest.  
// (Compound Interest = P(1 + R/100)t ) 
public static double compoundInterest(int p,int t,int r){
	double compInt=p*(1+r/100)*t;
	return compInt;
}
// 10. Create a program to convert Fahrenheit to Celsius. 
public static float forehenheit(float c){
	float f=(c*9/5)+32;
	return f;
}

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the p: ");
	int p=sc.nextInt();
	System.out.println("Please enter the t: ");
	int t=sc.nextInt();
	System.out.println("Please enter the r: ");
	int r=sc.nextInt();
	System.out.println(simpleInterest(p,t,r));
	}
}