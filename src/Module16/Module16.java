package Module16;

import java.util.Scanner;

public class Module16 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
//    try {
//        System.out.println("Enter two integers: ");
//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
//        System.out.println(number1 / number2);
//        System.out.println("End of the program");
//    }
//    catch(ArithmeticException e){
//        System.out.println("Division by zero is undefined");
//    }
        try{
            int a[] = new int[5];
            a[6] = 9;

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You are trying to access an array element that doesnt exist");
        }
    }
}
