class Index{
//     16. Create a program that categorize a person into different age groups 
// Child -> below 13  
// Teen -> below 20  
// Adult -> below 60  
// Senior-> above 60 
// Create a program that shows bitwise AND of two numbers.
// 12 in binary: 1100
// 5 in binary: 0101
// AND: 0100 → 4
private static int bitAnd(int a,int b){
    int c=(a&b);
    return c;
}  
// 18. Create a program that shows bitwise OR of two numbers.
// 1100   (12)
// | 0101   (5)
// = 1101   (13) 
private static int bitOr(int a,int b){
    int c=(a | b);
    return c;
}   
// 19. Create a program that shows bitwise XOR of two numbers. 
// 1100   (12)
// ^ 0101   (5)
// = 1001   (9)XOR gives 1 only when the bits are different → Result: 9

private static int bitXor(int a,int b){
    int c=(a ^ b);
    return c;
}
// Create a program that shows bitwise compliment of a number. ~00000000 00000000 00000000 00001100
//  =11111111 11111111 11111111 11110011 → This is -13 in decimal (2's complement form)

private static int bitComp(int a){
    int c=~a;
    return c;
}
private static void ageGroup(int age){
    if(age<13){
        System.out.println("Child");
    }else if(age<20){
        System.out.println("Teen");
    }else if(age<60){
        System.out.println("Adult");
    }else{
        System.out.println("Senior");
    }
}
    public static void main(String[]args){
        ageGroup(60);
        System.out.println(bitAnd(12, 5));
        System.out.println(bitOr(12, 5));
        System.out.println(bitXor(12, 5));
        System.out.println(bitComp(12));
        
    }
}