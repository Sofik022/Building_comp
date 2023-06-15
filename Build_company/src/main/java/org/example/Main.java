
import org.example.Employee;
import java.sql.SQLException;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws SQLException {
//        Employee employee = new Employee(1, 123456, "Ivan", "Fedorovych", 3);

//        System.out.println(employee);
        Connection con = Database.getConnection();

        if (con != null) {
            System.out.println("Database connection succesfull!");
        }
    }
}