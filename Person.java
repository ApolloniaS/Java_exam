package Java_Exam;

public class Person extends Contact {
    
    private String birthday;
    private String firstname;
    private String lastname;

    public Person() {
    }

    public Person(String birthday, String firstname, String lastname) {
        this.birthday = birthday;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person(String birthday, String firstname, String lastname, String name, String email, String phone) {
        super(name, email, phone);
        this.birthday = birthday;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" + "birthday=" + birthday + ", firstname=" + firstname + ", lastname=" + lastname + ", name=" + getName() + ", email=" + getEmail() + ", phone=" + getPhone() +'}';
    }
    
    
    
}
