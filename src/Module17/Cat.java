package Module17;

public class Cat implements Animal, CatKingdom{
    @Override
    public void animalSound(){
        System.out.println("Meow meow");
    }

    @Override
    public void lifes() {
        System.out.println("Cats have 9 lives");
    }
}
