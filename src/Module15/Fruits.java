package Module15;

public abstract class Fruits {
    private String name;
    private String color;
    private double calories;

    public Fruits(String name, String color, double calories){
        this.name = name;
        this.color = color;
        this.calories = calories;
    }

    public abstract boolean hasSeed();
    public abstract String origin();

    public String getName(){
        return this.name;
    }

    public String getColor() {
        return color;
    }

    public double getCalories() {
        return calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
