package Module17;

public abstract class Vehicle {
    public String type;
    public String steeringWheel;
    public int speedGears;
    public String breaks;
    public int maxSpeed;

    public Vehicle(String type, String steeringWheel, int speedGears,String breaks, int maxSpeed){
        this.type = type;
        this.steeringWheel = steeringWheel;
        this.speedGears = speedGears;
        this.breaks = breaks;
        this.maxSpeed = maxSpeed;
    }

    public abstract int numberOfWheels();

}
