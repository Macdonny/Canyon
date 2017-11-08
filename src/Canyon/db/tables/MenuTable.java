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
public class MenuTable {
    
    private static MenuTable instance = new MenuTable();
    
    private MenuTable() {

    }
    
    public static MenuTable getInstance(){
        return instance;
    }
    
    //Add Menu table to SQL DB
    public void create() {
        PreparedStatement prep;
        
        try {
            prep = conn.prepareStatement("create table menu( "
               + "itemName varChar (20), price INT, CONSTRAINT pk_itemName "
               + "PRIMARY KEY (itemName))");
            prep.executeUpdate();
        }
        catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
    
    public ArrayList<String> getAllItems(){
        ArrayList<String> names = new ArrayList<String>();
        try {
            PreparedStatement prep = conn.prepareStatement("select itemName from menu");
            ResultSet r = prep.executeQuery();
            while(r.next()){
                names.add(r.getString(1));
            }
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
        return names;
    }
    
    public ArrayList<String> getItemData(String itemName){
        ArrayList<String> list = new ArrayList<String>();
        try {
            PreparedStatement prep = conn.prepareStatement("select * from menu where itemName = ?");
            prep.setString(1, itemName);
            ResultSet query = prep.executeQuery();
            query.next();
            for(int i = 1; i < 3; i++){
                list.add(query.getString(i));
            }
        }
        catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
        return list; 
    }
    
    public int getPrice(String itemName){
        int price = -1; 
        try {
            PreparedStatement prep = conn.prepareStatement("select price from menu where itemName = ?");
            prep.setString(1, itemName);
            ResultSet r = prep.executeQuery();
            r.next();
            price = Integer.parseInt(r.getString(1));
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
        return price;
    }
    
    public void insertItem(String itemName, int price){
        try{
            PreparedStatement prep = conn.prepareStatement("insert into menu values(?,?)");
            prep.setString(1, itemName);
            prep.setString(2, price+"");
            prep.executeUpdate();
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    
    // TODO May need to redo
    public void updateItemPrice(String itemName, int price){
        deleteItem(itemName);
        insertItem(itemName, price);
    }
    
    public void deleteItem(String itemName){
        
        try{
            PreparedStatement prep = conn.prepareStatement("delete from menu where itemName = ?");
            prep.setString(1, itemName);
            prep.executeUpdate();
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    
    public boolean isMenuItem(String item){
        if(getItemData(item).size() != 0)
            return true;
        return false;
    }
}
