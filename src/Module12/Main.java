package Module12;

public class Main {
    public static void main(String[]args){
        Student student = new Student(4.4, "Leon", "Krasniqi", 14, "Male");
        System.out.println(student.name);
        System.out.println(student.notaMesatare);

        Teacher teacher = new Teacher("Matematike", "Agim", "Emini", 120, "Male");
        System.out.println(teacher.subject);
        System.out.println(teacher.name);

        PersonalBankAccount personalBankAccount = new PersonalBankAccount(1,350.55);
        personalBankAccount.depositAmount(400);
        System.out.println(personalBankAccount.balance);
    }
}
