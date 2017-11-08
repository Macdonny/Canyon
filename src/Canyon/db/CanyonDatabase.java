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
    static String DB_URL = "jdbc:derby://localhost:1527/";
    
    // Netbeans comes with the server drivers needed to use this Derby server, which
    // is good so Bhola will not have problems running it when he is grading.
    
    public static Statement stmt;
    public static Connection conn;
    
    EmployeesTable employeesTable;
    MenuTable menuTable;
    PayrollTable payrollTable;

// Connect to the local Derby/SQL database
// Username for the Database is "root" and the password is "toor"
    public CanyonDatabase(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DB_URL = DB_URL + "CanyonDatabase" + ";user=" + "root" + ";password=" + "toor";
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
            build();
        }
        catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // End DB connection
    public void end(){
        try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
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

        // To add:
        // Table table
        // Bill/Check table
        // Inventory table
        // Sales Records? Table
        
    }
    
    public static String dispNull(String input) {
        if (input == null || input.length() == 0) {
            return "N/A";
        } else {
            return input;
        }
    }
      
// Other methods here:
    // Table
    // Inventory
    // Chef
    // Bill/Check
    // Reports, etc.
    
}