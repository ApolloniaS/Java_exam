//Apollonia SORELLA -- Examen JAVA 2020
package Java_Exam;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

    static Scanner in = new Scanner(System.in);
    static ArrayList<Contact> cl = new ArrayList<Contact>();

    public static void main(String[] args) throws SQLException {

        String cmd;
        do {
            if (cl.isEmpty()) {
                System.out.println("Pas de contacts");
            }
            System.out.println("________________");
            System.out.println("Choisissez entre une de ces options: ");
            System.out.println("C pour ajouter un contact");
            System.out.println("P pour ajouter une personne");
            System.out.println("E pour ajouter un employé");
            System.out.println("F pour ajouter une firme");
            System.out.println("Q pour quitter");
            System.out.println("________________");
            if (!cl.isEmpty()) {
                System.out.println(cl);
            }
            System.out.println("________________");
            cmd = in.nextLine();

            switch (cmd) {
                case "C":
                    Contact c = readContact(in);
                    DB.saveContact(c);
                    cl.add(c);
                    break;
                case "P":
                    Person p = readPerson(in);
                    DB.saveContact(p);
                    cl.add(p);
                    break;
                case "E":
                    Employee e = readEmployee(in);
                    DB.saveContact(e);
                    cl.add(e);
                    break;
                case "F":
                    Firm f = readFirm(in);
                    DB.saveContact(f);
                    cl.add(f);
                    break;
                case "Q":
                    quit();
                    break;
            }
        } while (!cmd.equals("Q"));

    }

    public static Contact readContact(Scanner scanner) {
        System.out.print("Nom: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Tel: ");
        String phone = scanner.nextLine();
        return new Contact(name, email, phone);
    }

    public static Person readPerson(Scanner scanner) {
        Contact contact = readContact(scanner);
        System.out.print("Date de naissance: ");
        String birthday = scanner.nextLine();
        System.out.print("Prénom: ");
        String firstname = scanner.nextLine();
        System.out.print("Nom de famille: ");
        String lastname = scanner.nextLine();
        return new Person(contact.getName(),
                contact.getEmail(),
                contact.getPhone(),
                birthday,
                firstname,
                lastname);
    }

    public static Employee readEmployee(Scanner scanner) {
        Person person = readPerson(scanner);
        System.out.print("Salaire: ");
        String line = scanner.nextLine();
        double salary = Double.parseDouble(line);
        return new Employee(person.getName(),
                person.getEmail(),
                person.getPhone(),
                person.getBirthday(),
                person.getFirstname(),
                person.getLastname(),
                salary);
    }

    public static Firm readFirm(Scanner scanner) {
        Contact contact = readContact(scanner);
        System.out.print("TVA: ");
        String tva = scanner.nextLine();
        return new Firm(contact.getName(),
                contact.getEmail(),
                contact.getPhone(), tva);
    }

    private static void quit() {
        System.out.println("Byebye !");
    }

}
