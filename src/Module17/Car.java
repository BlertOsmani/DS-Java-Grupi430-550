package Module17;

public class Car extends Vehicle implements Motorized{
    public int doors;

    public Car(String type, String steeringWheel, int speedGears, String breaks,int maxSpeed, int doors){
        super(type,steeringWheel,speedGears,breaks,maxSpeed);
        this.doors = doors;
    }

    @Override
    public int numberOfWheels(){
        return 4;
    }
    @Override
    public void startEngine(){
        System.out.println("Vrooom...");
    }

    @Override
    public int horsePower(){
        return 360;
    }
}
