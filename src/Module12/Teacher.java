package Module12;

public class Teacher extends Person{
    public String subject;

    public Teacher(String subject, String name, String surname, int age, String gender){
        super(name, surname, age,gender);
        this.subject = subject;
    }
}
