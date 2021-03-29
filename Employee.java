package Java_Exam;

public class Employee extends Person {
    
    private double salary;

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(double salary, String birthday, String firstname, String lastname) {
        super(birthday, firstname, lastname);
        this.salary = salary;
    }

    public Employee(String name, String email, String phone, String birthdate, String firstname, String lastname,
            double salary) {
        super(name, email, phone, birthdate, firstname, lastname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + ", lastname=" + getLastname()+ ", firstname=" + getFirstname() + ", birthday=" + getBirthday() 
                + ", phone=" + getPhone() + ", email=" + getEmail() + ", name=" + getName() + '}';
    }
    
    
    
    
}
