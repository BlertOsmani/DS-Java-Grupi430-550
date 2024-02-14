package Module15;

public class Apple extends Fruits{
    public Apple(String name, String color, double calories){
        super(name, color, calories);
    }

    public boolean hasSeed(){
        return true;
    }
    public String origin(){
        return "America";
    }
}
