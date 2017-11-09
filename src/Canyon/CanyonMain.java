/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canyon;

import Canyon.db.CanyonDatabase;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macdonny
 */
public class CanyonMain {
    public static void main(String[] args) {
        try {
            CanyonDatabase db = new CanyonDatabase();
        } catch (SQLException ex) {
            Logger.getLogger(CanyonMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
    }
}
