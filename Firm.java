package Java_Exam;

public class Firm extends Contact {
    
    private String tva;

    public Firm() {
    }

    public Firm(String tva) {
        this.tva = tva;
    }

    public Firm(String tva, String name, String email, String phone) {
        super(name, email, phone);
        this.tva = tva;
    }

    public String getTva() {
        return tva;
    }

    public void setTva(String tva) {
        this.tva = tva;
    }

    @Override
    public String toString() {
        return "Firm{" + "tva=" + tva + ", name=" + getName() + ", email=" + getEmail() + ", phone=" + getPhone() + '}';
    }
    
    
    
}
