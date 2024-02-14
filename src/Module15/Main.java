package Module15;

public class Main {
    public static void main(String[]args){
//            Houses houses = new Speedsters();
//            houses.showMission();

        Fridge f = new Fridge(4);
        Fruits redApple = new Apple("Red Apple", "red", 50);
        Fruits greenApple = new Apple("Green Apple", "green", 60);
        f.addFruit(greenApple);
        f.addFruit(redApple);
        f.printFruitsWithSeed();
    }
}
