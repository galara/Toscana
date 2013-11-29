/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.toscana.controller.user;

import com.toscana.dao.managers.UserDAOManager;
import com.toscana.helper.security.PasswordEncrypter;
import com.toscana.model.sessions.User;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author SG_05
 */
public class UserController {
    private UserDAOManager userDAOManager;
    private Vector columName;
   
    public UserController(){
        userDAOManager = new UserDAOManager();
        columName= new Vector();
        columName.add("ID");
        columName.add("Name");
        columName.add("Nickname");
        columName.add("Password");
        
    }
   
    public void renderTable(JTable table){
        this.showUsersTable(table);
    }
    
    public void showUsersDataToEdit(JTable tabla, int row,JTextField id, JTextField name, JTextField password, JTextField nickname){
        User user = parseUser(tabla, row);
        id.setText(String.valueOf(user.getID()));
        name.setText(user.getName());
        password.setText(user.getPassword());
        nickname.setText(user.getNickname());
    }
    
    public void saveUser(JTextField fieldName, JTextField fieldPassword, JTextField fieldNickname){
        String name = fieldName.getText();
        String password = fieldPassword.getText();
        String encryptedPassword = PasswordEncrypter.getEncryptedPassword(password);
        String nickname = fieldNickname.getText();
        
        User user = new User(name, encryptedPassword, nickname);
        
        this.userDAOManager.add(user);
    }
    
    public  void updateUser(JTextField fieldID, JTextField fieldName, JTextField fieldPassword, JTextField fieldNickname){
        String name = fieldName.getText();
        String password  = fieldPassword.getText();
        String encryptedPassword = PasswordEncrypter.getEncryptedPassword(password);
        String nickname = fieldNickname.getText();
        Integer id = Integer.parseInt(fieldID.getText());
        
        User user = new User(name, encryptedPassword, nickname);
        user.setID(id);
        
        this.userDAOManager.update(user);
    }
    
    public void deleteUser(JTextField fieldID, JTextField fieldName, JTextField fieldPassword, JTextField fieldNickname){
        String name = fieldName.getText();
        String password  = fieldPassword.getText();
        String nickname = fieldNickname.getText();
        int ID = Integer.parseInt(fieldID.getText());
        
        User user = new User(name, password, nickname);
        user.setID(ID);
        
        this.userDAOManager.delete(user);
    }
  
    private void showUsersTable(JTable tabla){
        ArrayList<User> usersArrayList = (ArrayList<User>) userDAOManager.findAll(); //cargarTodosLosClientes();
        Vector usersVector = parseVector(usersArrayList);
        DefaultTableModel dtm = new DefaultTableModel(usersVector, columName);
        
        tabla.setModel(dtm);
    }
    
    private static Vector parseVector(ArrayList<User> array){
        Vector parsedVector = new Vector();
        
        for (int i = 0; i < array.size(); i++) {
            Vector internalVector = new Vector();
            User internalUser = array.get(i);
            internalVector.add(internalUser.getID());
            internalVector.add(internalUser.getName());
            internalVector.add(internalUser.getPassword());
            internalVector.add(internalUser.getNickname());
            
            parsedVector.add(internalVector);
        }
        return parsedVector;
    }
    
     private static User parseUser(JTable table, int row){
        TableModel tableModel = table.getModel();
        User user =  new User();
        int idClient = (Integer)tableModel.getValueAt(row, 0);
        user.setID(idClient);
        user.setName((String) tableModel.getValueAt(row, 1));
        user.setPassword((String) tableModel.getValueAt(row, 2));
        user.setNickname((String) tableModel.getValueAt(row, 3));
        
        return user;
    }
    
    private static User parseUser(Vector vector){
        User user = new User((String)vector.get(1), (String)vector.get(2), (String)vector.get(3));
        return user;
    } 
}
