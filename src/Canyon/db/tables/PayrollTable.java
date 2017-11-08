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

/**
 *
 * @author macdonny
 */
public class PayrollTable {
    
    private static PayrollTable instance = new PayrollTable();
    
    private PayrollTable() {
    }
    
    public static PayrollTable getInstance(){
        return instance;
    }
    
    //Add Payroll table to SQL DB
    public void create() {
        PreparedStatement prep;
        
        try {
        
        prep = conn.prepareStatement("create table Payroll("
               + "PAY_ID varChar(20), HOURS integer NOT NULL, HOURLY_RATE integer NOT NULL," 
               + "FOREIGN KEY (PAY_ID) " + "REFERENCES Employee (username))");
        prep.executeUpdate();
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    
    public ArrayList<String> getEmployeePayrollInfo(String username) {
        ArrayList<String> list = new ArrayList();

        try{
            PreparedStatement prep = conn.prepareStatement("select * from payroll where PAY_ID = ?");
            prep.setString(1, username);
            ResultSet query = prep.executeQuery();
            query.next();

            for(int i = 1; i < 4; i++){
                list.add(query.getString(i));
            }
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
        return list; 
    }
}
