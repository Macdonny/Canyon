package Canyon;

/* This is the main file that will create the database and launch the login class/Jframe.
This could also hold all of the methods that write to the database, and the other classes
could call those methods as needed. For example, the methods to create a table in 
the database for the menu could be here and then those methods could be called from the
class that needs them (like a Jframe that would appear for a server or manager.
*/
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CanyonDatabase {
    static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static String DB_URL = "jdbc:derby://localhost:1527/";
    
    // Netbeans comes with the server drivers needed to use this Derby server, which
    // is good so Bhola will not have problems running it when he is grading.
    
    static Statement stmt;
    static Connection conn;

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
        employee();
        menu();
        payroll();
        // To add:
        // Table table
        // Bill/Check table
        // Inventory table
        // Sales Records? Table
        
    }
    
//Add Employee table to SQL DB
    private void employee(){
        PreparedStatement prep;   
        try{
        
        prep = conn.prepareStatement("create table Employee("
               + "fname varChar (20), lname varChar (20), username varChar(20)," 
               + "password varChar(20), position INT, " 
               + "CONSTRAINT pk_username " + "PRIMARY KEY (username))");
        prep.executeUpdate();}
        catch(SQLException sql){System.out.println(sql.getMessage());}
    }
   
    public static String dispNull(String input) {
        if (input == null || input.length() == 0) {
            return "N/A";
        } else {
            return input;
        }
    }
    
// See if the username is in the database
// This will be used by the Login JFrame.
// If username is not in DB, then won't even need to check if password matches.
    public boolean VerifyLogin(String username)
    {
        if(ViewEmployee(username).size() != 0)
            return true;
        return false;
    }

// Add a new Employee record to the DB.
    public void AddEmployee(String fname, String lname, String username, String password, int position)
    {
        
        try{
       PreparedStatement prep = conn.prepareStatement("INSERT into Employee values(?,?,?,?,?)");
       prep.setString(1, fname);
       prep.setString(2, lname);
       prep.setString(3, username);
       prep.setString(4, password);
       prep.setInt(5, position);
       // Need to add other attributes as needed.
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
       System.out.println(fname);
    }
   
// View an Employee record.
    public ArrayList<String> ViewEmployee(String username){
        ArrayList<String> list = new ArrayList<String>();
        try{
       PreparedStatement prep = conn.prepareStatement("Select * from Employee where username = ?");
       prep.setString(1, username);
       ResultSet query = prep.executeQuery();
       query.next();
       
       // This, ideally, is supposed to loop over the table to get employee data.
       // I think this may be causing my cursor error, but I'm, not sure.
       for(int i = 1; i < 6; i++){ 
           list.add(query.getString(i));
         }
       
       }
        catch(SQLException sql){System.out.println(sql.getMessage());}
       return list; 
    }
    
// View all Employee records -- used by Login JFrame and Manager
    // This may be causing my cursor error, too.
    public ArrayList<String> ViewAllEmployeeLogins(){
        ArrayList<String> names = new ArrayList<>();
        try{
       PreparedStatement prep = conn.prepareStatement("Select username from Employee");
       ResultSet query = prep.executeQuery();
       query.next();
       while(query.next()){
           names.add(query.getString(1));
       }
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
        return names;
    }

// Delete an Employee record from the DB
    public void RemoveEmployee(String username){
        
        try{
       PreparedStatement prep = conn.prepareStatement("Delete from Employee where username = ?");
       prep.setString(1, username);
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
       //System.out.println(fname);
    }
 
    private void menu(){
        PreparedStatement prep;
        try{
       prep = conn.prepareStatement("create table menu( "
               + "itemName varChar (20), price INT, CONSTRAINT pk_itemName "
               + "PRIMARY KEY (itemName))");
        prep.executeUpdate();
        }
        catch(SQLException sql){/*System.out.println(sql.getMessage());*/}
    }
 
    public boolean isMenuItem(String item){
        if(getItemData(item).size() != 0)
            return true;
        return false;
    }
   
    public void insertItem(String itemName, int price){
        try{
       PreparedStatement prep = conn.prepareStatement("insert into menu values(?,?)");
       prep.setString(1, itemName);
       prep.setString(2, price+"");
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
    }
 
    public void deleteItem(String itemName){
        
        try{
       PreparedStatement prep = conn.prepareStatement("delete from menu where itemName = ?");
       prep.setString(1, itemName);
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
       //System.out.println(fname);
    }

    public void updateItemPrice(String itemName, int price){
        deleteItem(itemName);
        insertItem(itemName, price);
    }

    public int getPrice(String itemName){
        int price = -1; 
        try{
        PreparedStatement prep = conn.prepareStatement("select price from menu where itemName = ?");
       prep.setString(1, itemName);
        ResultSet r = prep.executeQuery();
        r.next();
        price = Integer.parseInt(r.getString(1));
        }
        catch(SQLException sql){System.out.println(sql.getMessage());
        }
        return price;
    }

    public ArrayList<String> getAllItems(){
        ArrayList<String> names = new ArrayList<String>();
        try{
        PreparedStatement prep = conn.prepareStatement("select itemName from menu");
        ResultSet r = prep.executeQuery();
        while(r.next()){
            names.add(r.getString(1));
        }
        }
        catch(SQLException sql){System.out.println(sql.getMessage());
        }
        return names;
    }
   
    public ArrayList<String> getItemData(String itemName){
        ArrayList<String> list = new ArrayList<String>();
        try{
       PreparedStatement prep = conn.prepareStatement("select * from menu where itemName = ?");
       prep.setString(1, itemName);
       ResultSet query = prep.executeQuery();
       query.next();
       for(int i = 1; i < 3; i++){
           list.add(query.getString(i));
         }
       
       }
        catch(SQLException sql){System.out.println(sql.getMessage());}
       return list; 
    }
    
    private void payroll(){
        PreparedStatement prep;   
        try{
        
        prep = conn.prepareStatement("create table Payroll("
               + "PAY_ID varChar(20), HOURS integer NOT NULL, HOURLY_RATE integer NOT NULL," 
               + "FOREIGN KEY (PAY_ID) " + "REFERENCES Employee (username))");
        prep.executeUpdate();}
        catch(SQLException sql){System.out.println(sql.getMessage());}
    }
    
    public ArrayList<String> getEmployeePayrollInfo(String username) {
                ArrayList<String> list = new ArrayList<String>();
        try{
       PreparedStatement prep = conn.prepareStatement("select * from payroll where PAY_ID = ?");
       prep.setString(1, username);
       ResultSet query = prep.executeQuery();
       query.next();
       for(int i = 1; i < 4; i++){
           list.add(query.getString(i));
         }
       
       }
        catch(SQLException sql){System.out.println(sql.getMessage());}
       return list; 
    }
    
    
// Other methods here:
    // Table
    // Inventory
    // Chef
    // Bill/Check
    // Reports, etc.
    
}
    
