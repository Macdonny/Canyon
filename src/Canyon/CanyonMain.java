/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canyon;

import Canyon.db.CanyonDatabase;

/**
 *
 * @author macdonny
 */
public class CanyonMain {
    public static void main(String[] args) {
        CanyonDatabase db = new CanyonDatabase();
        Login loginView = new Login();
        loginView.setVisible(true);
    }
}
