package Calc2;

public class PersonCalc {
    public static void main(String[] args) {
        Person person1 = new Person(/*"Oleksandr", " Shvets",   " oleksandr_shvets@epam.com "*/);
        person1.setName("Olehandro");
        person1.setSurname("Shvetso");
        person1.setEmail("olehandro_shvets@epam.com");
        System.out.println("Output Person name via main method: " + person1.getName());
        System.out.println("Output Person surname via main method: " + person1.getSurname());
        System.out.println("Output Person email via main method: " + person1.getEmail());
    }

}

class Person {
    private String name;
    private String surname;
    private String email;

    public Person() {
        System.out.println("Default constructor");
    }

    public Person(String name, String surname, String email) {
        System.out.println("Constructor with parameters: " +  name + surname + email);
    }


    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("You entered an empty name");
        } else {
            this.name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setSurname(String userSurname) {
            this.surname = userSurname;
    }

    public String getSurname() {
        return surname;
    }

    public void setEmail(String userEmail) {
        this.email = userEmail;
    }

    public String getEmail() {
        return email;
    }
}

