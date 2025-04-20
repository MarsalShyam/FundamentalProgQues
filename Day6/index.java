class index{
    // 21. Create a program that shows use of left shift operator.
//     a = 5 → Binary: 101
// a << 1 → 1010 → 10 (Multiply 5 by 2)
// a << 2 → 10100 → 20 (Multiply 5 by 4)
    private static void leftShift(int a){
          // Binary: 101
        System.out.println("a = " + a);
        System.out.println("a << 1 = " + (a << 1));  // Shift left by 1 (multiply by 2)
        System.out.println("a << 2 = " + (a << 2));  // Shift left by 2 (multiply by 4)
    }
    // 22. Create a program that shows use of right shift operator.
//     a = 20 → Binary: 10100
// a >> 1 → 01010 → 10 (Divide 20 by 2)
// a >> 2 → 00101 → 5 (Divide 20 by 4)
    private static void rightShift(int a){
        // Binary: 101
      System.out.println("a = " + a);
      System.out.println("a >> 1 = " + (a >> 1));  // Shift left by 1 (multiply by 2)
      System.out.println("a >> 2 = " + (a >> 2));  // Shift left by 2 (multiply by 4)
  }
//   23. Write a program to check if a given number is even or odd using bitwise operators. 
// Bitwise AND with 1 (num & 1):
// If the result is 0, the number is even (because the LSB is 0).
// If the result is 1, the number is odd (because the LSB is 1).
private static void bitCheckOdEv(int num){
    if((num&1)==0){
        System.out.println(num + "is Even");
    }else{
        System.out.println(num+" is odd");
    }
}
// 24. Develop a program that prints the multiplication table for a given number.
    private static void table(int a){
        for(int i=1;i<=10;i++){
            // 2X1=2;
            System.out.println(a+" X "+i+" = "+a*i);
        }
    }
    // 25. Create a program to sum all odd numbers from 1 to a specified number N.  
    private static int sumOfodd(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        leftShift(5);
        rightShift(20);
        bitCheckOdEv(45);
        table(5);
        System.out.println(sumOfodd(5));
    }
}