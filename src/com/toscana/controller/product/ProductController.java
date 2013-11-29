/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.toscana.controller.product;

import com.toscana.dao.managers.ProductsDAOManager;
import com.toscana.model.products.Product;
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
public class ProductController {
    private ProductsDAOManager productDAOManager;
    private Vector columnName;

    public ProductController() {
        this.productDAOManager = new ProductsDAOManager();
        this.columnName= new Vector();
        columnName.add("ID");
        columnName.add("Nombre");
        columnName.add("Precio");
        columnName.add("Descripción");
        columnName.add("Descuento");
    }
    
    public void renderTable(JTable table){
        this.showProductsTable(table);
    }
    
    public void showProductsDataToEdit(JTable table, int row,JTextField id, JTextField name, JTextField price, JTextField description, JTextField discount ){
        Product product = parseProduct(table, row);
        id.setText(String.valueOf(product.getID()));
        name.setText(product.getName());
        price.setText(toString(product.getPrice()));
        description.setText(product.getDescription());
        discount.setText(toString(product.getDiscount()));
    }
    
    public void saveProduct(JTextField fieldName, JTextField fieldPrice, JTextField fieldDescription,JTextField fieldDiscount){
        //Product(int ID, String name, double price, String description, double discount) {
        String name = fieldName.getText();
        double price = toDouble(fieldPrice.getText());
        String description = fieldDescription.getText();
        double discount = toDouble(fieldDiscount.getText());
        
        Product product = new Product(name,price,description,discount);
 
        this.productDAOManager.add(product);
    }
    
    public  void updateProduct(JTextField fieldID, JTextField fieldName, JTextField fieldPrice, JTextField fieldDescription,JTextField fieldDiscount){
        String name = fieldName.getText();
        double price = toDouble(fieldPrice.getText());
        String description = fieldDescription.getText();
        double discount = toDouble(fieldDiscount.getText());
        int id = toInt(fieldID.getText());
        
        Product product = new Product(name,price,description,discount);
        product.setID(id);
        
        this.productDAOManager.update(product);
    }
    
    public void deleteProduct(JTextField fieldID, JTextField fieldName, JTextField fieldPrice, JTextField fieldDescription,JTextField fieldDiscount){
        String name = fieldName.getText();
        double price = toDouble(fieldPrice.getText());
        String description = fieldDescription.getText();
        double discount = toDouble(fieldDiscount.getText());
        int ID = toInt(fieldID.getText());
        
        Product product = new Product(name,price,description,discount);
        product.setID(ID);
        
        this.productDAOManager.delete(product);
    }
  
    private void showProductsTable(JTable tabla){
        ArrayList<Product> productsArrayList = (ArrayList<Product>) productDAOManager.findAll(); //cargarTodosLosClientes();
        Vector productsVector = parseVector(productsArrayList);
        DefaultTableModel dtm = new DefaultTableModel(productsVector, columnName);
        
        tabla.setModel(dtm);
    }
    
    private static Vector parseVector(ArrayList<Product> array){
        Vector parsedVector = new Vector();
        
        for (int i = 0; i < array.size(); i++) {
            Vector internalVector = new Vector();
            Product internalUser = array.get(i);
            internalVector.add(internalUser.getID());
            internalVector.add(internalUser.getName());
            internalVector.add(internalUser.getPrice());
            internalVector.add(internalUser.getDescription());
            internalVector.add(internalUser.getDiscount());
            
            parsedVector.add(internalVector);
        }
        return parsedVector;
    }
    
    private static Product parseProduct(JTable table, int row){
        TableModel tableModel = table.getModel();
        Product user =  new Product();
        int idClient = (Integer)tableModel.getValueAt(row, 0);
        user.setID(idClient);
        user.setName((String) tableModel.getValueAt(row, 1));
        user.setPrice((Double)tableModel.getValueAt(row, 2));
        user.setDescription((String) tableModel.getValueAt(row, 3));
        user.setDiscount((Double)tableModel.getValueAt(row, 4));
        
        return user;
    }
    
    private static Product parseProduct(Vector vector){
        Product product = new Product((String)vector.get(1), (Double)vector.get(2), (String)vector.get(3), (Double)vector.get(4));
        return product;
    } 
    
    private String toString(Double param){
        return String.valueOf(param);
    }  
    
    private double toDouble(String param){
        return Double.parseDouble(param);
    } 
    
    private int toInt(String param){
        return Integer.parseInt(param);
    }
}
