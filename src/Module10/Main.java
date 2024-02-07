package Module10;
import java.util.*;

public class Main {
    public static void main(String[]args){
//        String[] programmingLanguages = {"Php", "Python", "Java"};
//        int[] numbers = {1,2,3,4};
//        double[] doubleNumbers = {1.2,1.3,1.4};
//
//        System.out.println(programmingLanguages[0]);
//
//        programmingLanguages[0] = "C#";
//        System.out.println(programmingLanguages[0]);
//
//
//        int nrProgrammingLanguages = programmingLanguages.length;
//        System.out.println(nrProgrammingLanguages);


//        Scanner input = new Scanner(System.in);
//        double[] numbers2 = new double[10];
//        System.out.println("Enter values:");
//        for(int i = 0; i< 9; i++) {
//            numbers2[i] = Math.random() * 100;
//        }
//
//        System.out.println("Vlerat e array-it:");
//        for(int i=0; i<numbers2.length; i++){
//            System.out.println(numbers2[i] + ",");
//        }


//        int[] numbers3 = {3,4,6,1,2,5};
//        int max = numbers3[0];
//
//        for(int i=0; i < numbers3.length; i++){
//            if(numbers3[i] > max){
//                max = numbers3[i];
//            }
//        }
//        System.out.println(max);


        Scanner input = new Scanner(System.in);
        double[] numbers = new double[4];
        double sum=0;
        double avarage;

        System.out.println("Enter the values:");
        for(int i = 0; i<numbers.length;i++){
            numbers[i] = input.nextDouble();
        }
        for(int i =0; i<numbers.length;i++){
            sum+=numbers[i];
        }

        avarage = sum/numbers.length;

        System.out.println("Avarage: " + avarage);

        int count = 0;
        for(int i =0; i<numbers.length;i++){
            if(numbers[i] > avarage){
                count++;
            }
        }

        System.out.println("Numrat permbi mesatare jane: " + count);



    }
}
