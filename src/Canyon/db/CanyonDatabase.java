package Canyon.db;

/* This is the main file that will create the database and launch the login class/Jframe.
This could also hold all of the methods that write to the database, and the other classes
could call those methods as needed. For example, the methods to create a table in 
the database for the menu could be here and then those methods could be called from the
class that needs them (like a Jframe that would appear for a server or manager.
*/
import java.sql.*;
import Canyon.db.tables.*;

public class CanyonDatabase {
    static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static String DB_URL = "jdbc:derby://localhost:1527/" + "CanyonDatabase" + ";user=" + "root" + ";password=" + "toor";
    
    // Netbeans comes with the server drivers needed to use this Derby server, which
    // is good so Bhola will not have problems running it when he is grading.
    
    public static Statement stmt = null;
    public static Connection conn = null;
    
    EmployeesTable employeesTable;
    MenuTable menuTable;
    PayrollTable payrollTable;
    OrderTable orderTable;

    // Connect to the local Derby/SQL database
    // Username for the Database is "root" and the password is "toor"
    public CanyonDatabase() throws SQLException{
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
            build();
        }
        catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
    
// Create SQL tables
    public void build(){
        employeesTable = EmployeesTable.getInstance();
        employeesTable.create();
        menuTable = MenuTable.getInstance();
        menuTable.create();
        payrollTable = PayrollTable.getInstance();
        payrollTable.create();
        orderTable = OrderTable.getInstance();
        orderTable.create();

        // To add:
        // Table table
        // Bill/Check table
        // Inventory table
        // Sales Records? Table
        
    }
    
    // Other methods here:
    // Table
    // Inventory
    // Chef
    // Bill/Check
    // Reports, etc.
}