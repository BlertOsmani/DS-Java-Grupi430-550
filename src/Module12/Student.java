package Module12;

public class Student extends Person{
    public double notaMesatare;

    public Student(double notaMesatare, String name, String surname, int age, String gender){
        super(name,surname,age,gender);
        this.notaMesatare = notaMesatare;
    }
}
