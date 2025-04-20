class Index{
    // 26. Write a function that calculates the factorial of a given number
    private static int fact(int n){
        if(n>1){
            int fac=1;
            for(int i=1;i<=n;i++){
                fac*=i;
            }
            return fac;
        }else{
            return 1;
        }
    }
    // 27. Create a program that computes the sum of the digits of an integer.  
    private static int DigitSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10; //getting the last digit
            n=n/10; //removeing the last digit
        }
        return sum;
    }
//     28. Create a program to find the Least Common Multiple (LCM) of two numbers.  
// LCM(a, b) = (a × b) / GCD(a, b)
    private static int findLCM(int a,int b){
        int gcd=findGCD(a, b);
        int lcm=(a*b)/gcd;
        return lcm;
    }
// 29. Create a program to find the Greatest Common Divisor (GCD) of two integers. 
private static int findGCD(int a, int b) {
    while(b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
// 30. Create a program to check whether a given number is prime.  
private static void checkPrime(int n){
    boolean isPrime=true;
    if(n<=1){
        isPrime=false;
    }else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
    }

    if (isPrime){
            System.out.println(n + " is a prime number.");}
        else{
            System.out.println(n + " is not a prime number.");}
}
    public static void main(String[] args) {
        System.out.println(fact(0));
        System.out.println(fact(10));
        System.out.println(DigitSum(12345));//15
        System.err.println(findGCD(36, 60));//12
        System.err.println(findLCM(12, 8));//24
    }
}