package Module14;

public class Main {
    public static void main(String[]args){
            House house = new House();
            House speedters = new Speedters();
            House shadows = new Shadows();

//            house.showMission();
//            speedters.showMission();
//            shadows.showMission();

            showMission(speedters);

    }

    public static void showMission(Object house){
        if(house instanceof Speedters){
            ((Speedters)house).showMission();
        }
    }
}
