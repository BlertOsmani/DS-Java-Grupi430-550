package Module15;

public class Fridge {
    private Fruits[] fruits;
    private int index = 0;

    public Fridge(int nrFruits){
        fruits = new Fruits[nrFruits];
    }

    public void addFruit(Fruits fruit){
        fruits[index++] = fruit;
    }

    public void printFruitsWithSeed(){
        for(int i= 0; i < index; i++){
            if(fruits[i].hasSeed()){
                System.out.println(fruits[i].getName());
            }
        }
    }
}
