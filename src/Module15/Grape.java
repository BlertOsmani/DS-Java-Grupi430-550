package Module15;

public class Grape extends Fruits{
        public Grape(String name, String color, double calories){
            super(name, color, calories);
        }
        public boolean hasSeed(){
            return false;
        }
        public String origin(){
            return "Asia";
        }
}
