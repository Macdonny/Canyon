/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canyon.db.tables;

import static Canyon.db.CanyonDatabase.conn;
import Canyon.orders.MenuItem;
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
               + "itemName varChar (20), price double, category varChar (20), "
               + "CONSTRAINT pk_itemName "
               + "PRIMARY KEY (itemName))");
            prep.executeUpdate();
        }
        catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
        
        insertItem("Steak", 15.99, "entree");
        insertItem("Fish", 12.99, "entree");
        insertItem("Wings", 5.99, "appetizer");
        insertItem("Nachos", 3.99, "appetizer");
        insertItem("Rice", 5.99, "side item");
        insertItem("Mash Potatoes", 5.99, "side item");
        insertItem("Ice Cream", 5.99, "dessert");
        insertItem("Cake", 5.99, "dessert");
        insertItem("Vodka", 7.99, "liquor");
        insertItem("Whiskey", 7.99, "liquor");
        insertItem("Pale ale", 4.99, "beer");
        insertItem("Lager", 4.99, "beer");
        insertItem("Merlot", 10.99, "wine");
        insertItem("Sauvignon Blanc", 10.99, "wine");
        insertItem("Mixed Drink Special", 5.99, "mixed drink");
        insertItem("Mixed Lemonade", 5.99, "mixed drink");
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
    
    public double getPrice(String itemName){
        double price = -1; 
        try {
            PreparedStatement prep = conn.prepareStatement("select price from menu where itemName = ?");
            prep.setString(1, itemName);
            ResultSet r = prep.executeQuery();
            r.next();
            price = Double.parseDouble(r.getString(1));
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
        return price;
    }
    
    public ArrayList<MenuItem> getItemByCategory(String category) throws SQLException {
        
        ArrayList<MenuItem> menuItems = new ArrayList();
        String sql = "select * from menu where category = ?";
        ResultSet query = null;
        
        try {
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setString(1, category);
            query = prep.executeQuery();

            while(query.next()) {
                MenuItem item = new MenuItem();
                item.setItemName(query.getString("itemName"));
                item.setPrice(query.getDouble("price"));
                item.setCategory(query.getString("category"));
                menuItems.add(item);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        } finally {
            if(query != null) {
                query.close();
            }
        }
        return menuItems;
    }
    
    public void insertItem(String itemName, double price, String category){
        try{
            PreparedStatement prep = conn.prepareStatement("insert into menu values(?,?,?)");
            prep.setString(1, itemName);
            prep.setString(2, price+"");
            prep.setString(3, category);
            prep.executeUpdate();
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    
    // TODO May need to redo
    public void updateItemPrice(String itemName, double price, String category){
        deleteItem(itemName);
        insertItem(itemName, price, category);
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
