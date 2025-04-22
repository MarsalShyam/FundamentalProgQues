import java.util.*;

public class index{
    
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter number a: ");
	int a = sc.nextInt();
	System.out.print("Enter number b: ");
	int b = sc.nextInt();
	//System.out.print();
	int temp = a;
	a = b;
	b = temp;
	System.out.print(a+""+b);
	
	}
}