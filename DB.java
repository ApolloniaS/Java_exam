package Java_Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {

    public static void saveContact(Contact contact) throws SQLException {

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection
                    = DriverManager.getConnection("jdbc:mariadb://localhost/demo", "root", "root");
            PreparedStatement ps = connection.prepareStatement("INSERT INTO contacts (name, email, phone) VALUES(?,?,?)");
            ps.setString(1, contact.getName());
            ps.setString(2, contact.getEmail());
            ps.setString(3, contact.getPhone());
            ps.execute();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
