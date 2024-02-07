package Module11;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
//        Person person = new Person();
//        person.getName();
//        person.setName("Blert");
//        System.out.println(person.getName());
//        person.name = "Blert";

//         Login login = new Login();
//         login.username = "blert-osmani";
//         login.setPassword("blerti123");
//         System.out.println("Username: " + login.username + " and Password: " + login.getPassword());

            BankAccount[] bankAccount = new BankAccount[5];
            for(int i =0; i < bankAccount.length; i++){
                bankAccount[i] = new BankAccount(i);
            }
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an id: ");
            int enteredId = input.nextInt();

            while(true){
                if(enteredId>4){
                    System.out.println("Enter a correct id: ");
                    enteredId = input.nextInt();
                }
                if(enteredId == bankAccount[enteredId].getId()){
                    System.out.println("Main menu: ");
                    System.out.println("1: Press B to check account");
                    System.out.println("2: Press W to withdraw money");
                    System.out.println("3: Press D to deposit money");
                    System.out.println("4: Press E to exit the menu");

                    System.out.print("Enter a choice: ");
                    char choice = input.next().charAt(0);
                    if(choice == 'B' || choice == 'b'){
                        System.out.println("Your balance is: " + bankAccount[enteredId].getBalance());
                    }
                    else if(choice == 'W' || choice == 'w'){
                        System.out.print("Enter withdraw amount: ");
                        int withdrawAmount = input.nextInt();
                        bankAccount[enteredId].withDraw(withdrawAmount);
                        continue;
                    }
                    else if(choice == 'D' || choice == 'd'){
                        System.out.print("Enter deposit amount: ");
                        int depositAmount = input.nextInt();
                        bankAccount[enteredId].deposit(depositAmount);
                        continue;
                    }
                    else if(choice == 'E' || choice == 'e'){
                        System.out.print("Enter an ID: ");
                        enteredId = input.nextInt();
                    }
                }
            }
    }
}


