package Calc2;

public class PersonCalc2Extended {
   /* public static void main(String[] args) {
        PersonCalc pc = new PersonCalc();
        System.out.println("Output of user data via extended class: ");
    }
*/
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Output of user data via extended class: " + p.getName() + p.getSurname() + p.getEmail());
    }
}
