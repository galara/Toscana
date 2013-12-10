/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.controller.user;

import com.toscana.model.sessions.User;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Compac
 */
public class AdminUserViewController {

    public AdminUserViewController() {
        userController = new UserController();
    }

    /*
     * Altas, Bajas y Cambios desde la GUI
     */
    public void addUserFromGUI(JTextField userNameField, JTextField userPasswordField, JTextField userNicknameField, JCheckBox userIsAdminCheck) {
        User userToAdd = constructUserFromFields(userNameField, userPasswordField, userNicknameField, userIsAdminCheck);
        userController.addUser(userToAdd);
    }

    public void updateUserFromGUI(JTextField userId, JTextField userNameField, JTextField userPasswordField, JTextField userNicknameField, JCheckBox userIsAdminCheck) {
        User userToUpdate = constructUserFromFields(userId, userNameField, userPasswordField, userNicknameField, userIsAdminCheck);
        userController.updateUser(userToUpdate);
    }

    public void deleteUserFromGUI(JTable userTable, int selectedRow) {
        User userToDelete = constructUserFromTableRow(userTable, selectedRow);
        userController.deleteUser(userToDelete);
    }
    
    /*
     * Bloque Shows
     */
    public void showAllUsersInTable(JTable usersTable) {
        ArrayList<User> allUsersArrayList;

        allUsersArrayList = userController.getAllUsers();

        //DefaultTableModel needs a Vector instead of an ArrayList, so its needed to parse the ArrayList into a Vector
        Vector allUsersInfoVector = parseUsersArrayListToVector(allUsersArrayList);
        Vector tableColumnTitles = getUsersTableColumnNames();

        DefaultTableModel clientsTableModel = new DefaultTableModel(allUsersInfoVector, tableColumnTitles);
        usersTable.setModel(clientsTableModel);
    }

    public void showUsersInfoInFields(User userToShow, JTextField idField, JTextField nameField, JTextField passwordField, JTextField nicknameField) {
        String idFieldText, nameFieldText, passwordFieldText, nicknameFieldText;

        idFieldText = String.valueOf(userToShow.getID());
        nameFieldText = userToShow.getName();
        passwordFieldText = userToShow.getPassword();
        nicknameFieldText = userToShow.getNickname();

        idField.setText(idFieldText);
        nameField.setText(nameFieldText);
        passwordField.setText(passwordFieldText);
        nicknameField.setText(nicknameFieldText);
    }

    /*
     * Bloque Constructs
     */
    private User constructUserFromTableRow(JTable userTable, int selectedRow) {
        int userId;
        String userName, userPassword, userNickname;
        boolean isUserAnAdmin;

        //Getting info from table in the selected row
        userId = (Integer) userTable.getValueAt(selectedRow, ID_TABLE_INDEX);
        userName = (String) userTable.getValueAt(selectedRow, NAME_TABLE_INDEX);
        userPassword = (String) userTable.getValueAt(selectedRow, PASSWORD_TABLE_INDEX);
        userNickname = (String) userTable.getValueAt(selectedRow, NICKNAME_TABLE_INDEX);
        isUserAnAdmin = userHasAdminPrivilege(userTable, selectedRow);

        User constructedUser;
        constructedUser = new User(userId, userName, userPassword, userNickname, isUserAnAdmin);

        return constructedUser;
    }

    private User constructUserFromFields(JTextField idField, JTextField nameField, JTextField passwordField, JTextField nicknameField, JCheckBox isAdminCheck) {
        int userId;
        String userName; 
        String userPassword; 
        String userNickname;
        boolean isUserAnAdmin;

        userId = Integer.parseInt(idField.getText());
        userName = nameField.getText();
        userPassword = passwordField.getText();
        userNickname = nicknameField.getText();
        isUserAnAdmin = isAdminCheck.isSelected();

        User constructedUser;
        constructedUser = new User(userId, userName, userPassword, userNickname, isUserAnAdmin);

        return constructedUser;
    }

    private User constructUserFromFields(JTextField nameField, JTextField passwordField, JTextField nicknameField, JCheckBox isAdminCheck) {
        String userName; 
        String userPassword; 
        String userNickname;
        boolean isUserAnAdmin;

        userName = nameField.getText();
        userPassword = passwordField.getText();
        userNickname = nicknameField.getText();
        isUserAnAdmin = isAdminCheck.isSelected();

        User constructedUser;
        constructedUser = new User(userName, userPassword, userNickname, isUserAnAdmin);

        return constructedUser;
    }

    /*
     * Bloque gets Users Info
     */
    private boolean userHasAdminPrivilege(JTable userTable, int selectedRow) {
        String userPrivilegeStatus;
        userPrivilegeStatus = (String) userTable.getValueAt(selectedRow, PRIVILEGE_TABLE_INDEX);

        boolean userIsAdmin = false;
        if (userPrivilegeStatus.equals(USER_IS_ADMIN)) {
            userIsAdmin = true;
        }
        return userIsAdmin;
    }

    private static Vector getUsersTableColumnNames() {

        Vector usersTableColumnNames = new Vector();

        usersTableColumnNames.add(ID_TABLE_COLUMN_NAME);
        usersTableColumnNames.add(NAME_TABLE_COLUMN_NAME);
        usersTableColumnNames.add(PASSWORD_TABLE_COLUMN_NAME);
        usersTableColumnNames.add(NICKNAME_TABLE_COLUMN_NAME);
        usersTableColumnNames.add(PRIVILEGE_TABLE_COLUMN_NAME);

        return usersTableColumnNames;
    }

    /*
     * Bloque Parses
     */
    private static Vector parseUsersArrayListToVector(ArrayList<User> ArrayListToParse) {
        Vector resultingVector = new Vector();

        for (int i = 0; i < ArrayListToParse.size(); i++) {
            Vector singleVectorRow = new Vector();
            User internalUser = ArrayListToParse.get(i);

            //Do Not change the order of the next add's sentences
            singleVectorRow.add(internalUser.getID());
            singleVectorRow.add(internalUser.getName());
            singleVectorRow.add(internalUser.getPassword());
            singleVectorRow.add(internalUser.isPrivalegeAdmin());

            resultingVector.add(singleVectorRow);
        }

        return resultingVector;
    }
    private static UserController userController;

    private static final int ID_TABLE_INDEX = 0;
    private static final int NAME_TABLE_INDEX = 1;
    private static final int PASSWORD_TABLE_INDEX = 2;
    private static final int NICKNAME_TABLE_INDEX = 3;
    private static final int PRIVILEGE_TABLE_INDEX = 4;

    private static final String ID_TABLE_COLUMN_NAME = "ID";
    private static final String NAME_TABLE_COLUMN_NAME = "Nombre";
    private static final String PASSWORD_TABLE_COLUMN_NAME = "Contraseña";
    private static final String NICKNAME_TABLE_COLUMN_NAME = "Nickname";
    private static final String PRIVILEGE_TABLE_COLUMN_NAME = "Privelegios";

    private static final String USER_IS_ADMIN = "Administrador";
}
