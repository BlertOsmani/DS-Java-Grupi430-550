package Module9;

public class Main {
    public static void main(String[]args){
//        for(int i =0; i<10; i++){
//            sum+=i; // sum = sum + i
//        }
//        System.out.println("Shuma e numrave prej 0-10:" + sum);
//        sum=0;
//        for(int i=0; i<20;i++){
//            sum+=i;
//        }
//        System.out.println("Shuma e numrave prej 0-20:" + sum);
//        sum=0;
//        for(int i=0; i<30; i++){
//            sum+=i;
//        }
//        System.out.println("Shuma e numrave prej 0-30:" + sum);
//        System.out.println( shuma(45));
//        System.out.println(shuma(30));
//       grade(85,"Blert");
        System.out.println(shuma(1,2));
        System.out.println(shuma(1,2,3));
        System.out.println(shuma(1.0, 2.0));
    }

//    public static int shuma(int end){
//        int sum =0;
//        for(int start = 0; start<end; start++){
//            sum+=start;
//        }
//        return sum;
//    }

//    public static void grade(double score, String name){
//        if(score >= 90.0){
//            System.out.println(name + "nota juaj eshte 5");
//        }
//        else if(score >=80.0){
//            System.out.println(name + "nota juaj eshte 4");
//        }
//        else if(score >=70){
//            System.out.println(name + "nota juaj eshte 3");
//        }
//        else if(score >= 60){
//            System.out.println(name + "nota juaj eshte 2");
//        }
//        else{
//            System.out.println(name + "nota juaj eshte 1");
//        }
//    }

    public static int shuma(int nr1, int nr2){
        return nr1+nr2;
    }
    public static int shuma(int nr1, int nr2, int nr3){
        return nr1+nr2+nr3;
    }
    public static double shuma(double nr1,double nr2){
        return nr1+nr2;
    }


}
