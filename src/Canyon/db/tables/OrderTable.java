/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canyon.db.tables;

import static Canyon.db.CanyonDatabase.conn;
import Canyon.orders.MenuItem;
import Canyon.orders.Order;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author macdonny
 */
public class OrderTable {
    
    private static OrderTable instance = new OrderTable();
    
    private OrderTable() {

    }
    
    public static OrderTable getInstance(){
        return instance;
    }
    
    //Add Menu table to SQL DB
    public void create() {
        PreparedStatement prep;
        
        try {
            prep = conn.prepareStatement("create table ordersTbl( "
               + "tableNumber varChar (20), seatNumber varChar (20), itemName varChar (20), "
               + "fulfilled boolean, "
               + "FOREIGN KEY (itemName)" + "REFERENCES menu (itemName))");
            prep.executeUpdate();
        }
        catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
    
    public ArrayList<Order> getAllUnfulfilledOrders(){
        ArrayList<Order> orders = new ArrayList();
        String sql = "select * from ordersTbl where fulfilled = ?";
        ResultSet query = null;
        
        try {
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setBoolean(1, false);
            query = prep.executeQuery();
            
            while(query.next()){
                Order order = new Order();
                order.setTable(query.getString("tableNumber"));
                order.setSeat(query.getString("seatNumber"));
                order.setItem(query.getString("itemName"));
                orders.add(order);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
        return orders;
    }
    
    public ArrayList<String> getOrdersByTableSeat(String itemName){
        ArrayList<String> list = new ArrayList<String>();
        try {
            PreparedStatement prep = conn.prepareStatement("select * from ordersTbl where itemName = ?");
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
    
    public ArrayList<MenuItem> getOrdersByTable(String category) throws SQLException {
        
        ArrayList<MenuItem> menuItems = new ArrayList();
        String sql = "select * from ordersTbl where category = ?";
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
    
    public void insertOrder(String table, String seat, String item, Boolean status){
        System.out.println(table);
        System.out.println(seat);
        System.out.println(item);
        
        try{
            PreparedStatement prep = conn.prepareStatement("insert into ordersTbl values(?,?,?,?)");
            prep.setString(1, table);
            prep.setString(2, seat);
            prep.setString(3, item);
            prep.setBoolean(4, status);
            prep.executeUpdate();
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    
    // TODO May need to redo
    public void updateOrder(String table, String seat, String item, Boolean status){
        deleteOrder(table, seat, item);
        insertOrder(table, seat, item, status);
    }
    
    public void deleteOrder(String table, String seat, String item){
        
        try{
            PreparedStatement prep = conn.prepareStatement("delete from ordersTbl where tableNumber = ? and seatNumber = ? and itemName = ?");
            prep.setString(1, table);
            prep.setString(2, seat);
            prep.setString(3, item);
            prep.executeUpdate();
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
}
