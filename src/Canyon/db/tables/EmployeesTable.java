/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canyon.db.tables;
import static Canyon.db.CanyonDatabase.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macdonny
 */
public class EmployeesTable {
    
    //create an object of SingleObject
    private static EmployeesTable instance = new EmployeesTable();
    
    //Add Employee table to SQL DB
    private EmployeesTable() {  
    }
    
    //Get the only object available
    public static EmployeesTable getInstance(){
        return instance;
    }
    
    public void create() {
        PreparedStatement prep;
        
        try {
        
            prep = conn.prepareStatement("create table Employee("
                   + "fname varChar (20), lname varChar (20), username varChar(20)," 
                   + "password varChar(20), position INT, " 
                   + "CONSTRAINT pk_username " + "PRIMARY KEY (username))");
            prep.executeUpdate();
            
        }
        catch(SQLException sql) {
            System.out.println(sql.getMessage());
        } 
    }
    
    // View all Employee records -- used by Login JFrame and Manager
    // This may be causing my cursor error, too.
    public ArrayList<String> ViewAllEmployeeLogins(){
        ArrayList<String> names = new ArrayList();
        
        try {
            PreparedStatement prep = conn.prepareStatement("Select username from Employee");
            ResultSet query = prep.executeQuery();
            query.next();
            
            while(query.next()){
                names.add(query.getString(1));
            }
        }
        catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
        return names;
    }
    
    // View an Employee record.
    public ArrayList<String> ViewEmployee(String username){
        ArrayList<String> list = new ArrayList();
        
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
        catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
        return list; 
    }
    
    // Add a new Employee record to the DB.
    public void AddEmployee(String fname, String lname, String username, String password, int position) {
        
        try {
            PreparedStatement prep = conn.prepareStatement("INSERT into Employee values(?,?,?,?,?)");
            prep.setString(1, fname);
            prep.setString(2, lname);
            prep.setString(3, username);
            prep.setString(4, password);
            prep.setInt(5, position);
            // Need to add other attributes as needed.
            prep.executeUpdate();
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
            System.out.println(fname);
    }
    
    // Delete an Employee record from the DB
    public void RemoveEmployee(String username) {
        
        try{
            PreparedStatement prep = conn.prepareStatement("Delete from Employee where username = ?");
            prep.setString(1, username);
            prep.executeUpdate();
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    
    // See if the username is in the database
    // This will be used by the Login JFrame.
    // If username is not in DB, then won't even need to check if password matches.
    public boolean VerifyLogin(String username) {
        return !ViewEmployee(username).isEmpty();
    }  
}
