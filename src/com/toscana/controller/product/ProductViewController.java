/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.controller.product;

import com.toscana.controller.user.UserController;
import com.toscana.model.products.Product;
import com.toscana.model.sessions.User;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Compac
 */
public class ProductViewController {
    
        /*
     * Altas, Bajas y Cambios desde la GUI
     */
    
    public void addProductFromGUI(JTextField productNameField, JTextField productPriceField, JTextArea productDescArea, JTextField productDiscountField) {
        Product productToAdd = constructProductFromFields(productNameField, productPriceField,productDescArea, productDiscountField);
        productController.addProduct(productToAdd);
    }

    public void updateProductFromGUI(JTextField productIDField ,JTextField productNameField, JTextField productPriceField, JTextArea productDescArea, JTextField productDiscountField) {
        Product productToUpdate = constructProductFromFields(productIDField ,productNameField, productPriceField, productDescArea, productDiscountField);
        productController.updateProduct(productToUpdate);
    }

    public void deleteProductFromGUI(JTable productTable, int selectedRow) {
        Product productToDelete = constructProductFromTableRow(productTable, selectedRow);
        productController.deleteProduct(productToDelete);
    }
    
    /*
     * Bloque Constructs
     */
    public Product constructProductFromTableRow(JTable productTable, int selectedRow) {
        int productId;
        double productPrice,productDiscount;
        String productName,  productDescription;
       
        //Getting info from table in the selected row
        productId = (Integer) productTable.getValueAt(selectedRow, ID_TABLE_INDEX);
        productName = (String) productTable.getValueAt(selectedRow, NAME_TABLE_INDEX);
        productPrice = (Double) productTable.getValueAt(selectedRow, PRICE_TABLE_INDEX);
        productDescription = (String) productTable.getValueAt(selectedRow, DESCRIPTION_TABLE_INDEX);
        productDiscount = (Double) productTable.getValueAt(selectedRow, DISCOUNT_TABLE_INDEX);
        
        Product constructedProduct;
        constructedProduct = new Product(productId, productName, productPrice, productDescription, productDiscount);

        return constructedProduct;
    }
    
        private Product constructProductFromFields(JTextField productIDField ,JTextField productNameField, JTextField productPriceField, JTextArea productDescArea, JTextField productDiscountField) {
        int productId;
        double productPrice,productDiscount;
        String productName,  productDescription;

        productId = Integer.parseInt(productIDField.getText());
        productName = productNameField.getText();
        productPrice = Double.parseDouble(productPriceField.getText());
        productDescription = productDescArea.getText();
        productDiscount = Double.parseDouble(productDiscountField.getText());

        Product constructedProduct;
        constructedProduct = new Product(productId, productName, productPrice,productDescription, productDiscount);

        return constructedProduct;
    }

    private Product constructProductFromFields(JTextField productNameField, JTextField productPriceField, JTextArea productDescArea, JTextField productDiscountField) {
        double productPrice,productDiscount;
        String productName,  productDescription;

        productName = productNameField.getText();
        productPrice = Double.parseDouble(productPriceField.getText());
        productDescription = productDescArea.getText();
        productDiscount = Double.parseDouble(productDiscountField.getText());

        Product constructedProduct;
        constructedProduct = new Product(productName, productPrice,productDescription, productDiscount);

        return constructedProduct;
    }
    
     /*
     * Bloque Shows
     */
    public void showAllProductsInTable(JTable productTable) {
        ArrayList<Product> allProductsArrayList;

        allProductsArrayList = productController.getAllProducts();

        //DefaultTableModel needs a Vector instead of an ArrayList, so its needed to parse the ArrayList into a Vector
        Vector allProductsInfoVector = parseProductsArrayListToVector(allProductsArrayList);
        Vector tableColumnTitles = getProductsTableColumnNames();

        DefaultTableModel productsTableModel = new DefaultTableModel(allProductsInfoVector, tableColumnTitles);
        productTable.setModel(productsTableModel);
    }
    
        public void showAllProductsFromSaleInTable(JTable productTable, ArrayList allProductsInSale) {
        ArrayList<Product> allProductsArrayList;

        allProductsArrayList = allProductsInSale;

        //DefaultTableModel needs a Vector instead of an ArrayList, so its needed to parse the ArrayList into a Vector
        Vector allProductsInfoVector = parseProductsArrayListToVector(allProductsArrayList);
        Vector tableColumnTitles = getProductsTableColumnNames();

        DefaultTableModel productsTableModel = new DefaultTableModel(allProductsInfoVector, tableColumnTitles);
        productTable.setModel(productsTableModel);
    }

    public void showProductsInfoInFields(Product productToShow, JTextField idField, JTextField nameField, JTextField priceField, JTextArea descriptionArea, JTextField discountField) {
        String idFieldText, nameFieldText, priceFieldText, descriptionAreaText, discountFieldText;

        idFieldText = String.valueOf(productToShow.getID());
        nameFieldText = productToShow.getName();
        priceFieldText = String.valueOf(productToShow.getPrice());
        descriptionAreaText = productToShow.getDescription();
        discountFieldText = String.valueOf(productToShow.getDiscount());

        idField.setText(idFieldText);
        nameField.setText(nameFieldText);
        priceField.setText(priceFieldText);
        descriptionArea.setText(descriptionAreaText);
        discountField.setText(discountFieldText);
    }
    

    
    /*
     * Bloque gets Users Info
     */
    private static Vector getProductsTableColumnNames() {

        Vector usersTableColumnNames = new Vector();

        usersTableColumnNames.add(ID_TABLE_COLUMN_NAME);
        usersTableColumnNames.add(NAME_TABLE_COLUMN_NAME);
        usersTableColumnNames.add(PRICE_TABLE_COLUMN_NAME);
        usersTableColumnNames.add(DESCRIPTION_TABLE_COLUMN_NAME);
        usersTableColumnNames.add(DISCOUNT_TABLE_COLUMN_NAME);

        return usersTableColumnNames;
    }
    
        /*
     * Bloque Parses
     */
    private static Vector parseProductsArrayListToVector(ArrayList<Product> ArrayListToParse) {
        Vector resultingVector = new Vector();

        for (int i = 0; i < ArrayListToParse.size(); i++) {
            Vector singleVectorRow = new Vector();
            Product internalProduct = ArrayListToParse.get(i);

            //Do Not change the order of the next add's sentences
            singleVectorRow.add(internalProduct.getID());
            singleVectorRow.add(internalProduct.getName());
            singleVectorRow.add(internalProduct.getPrice());
            singleVectorRow.add(internalProduct.getDescription());
            singleVectorRow.add(internalProduct.getDiscount());

            resultingVector.add(singleVectorRow);
        }

        return resultingVector;
    }
    private static ProductController productController= new ProductController();
    
    private static final int ID_TABLE_INDEX=0;
    private static final int NAME_TABLE_INDEX=1;
    private static final int PRICE_TABLE_INDEX=2;
    private static final int DESCRIPTION_TABLE_INDEX=3;
    private static final int DISCOUNT_TABLE_INDEX=4;
    
    private static final String ID_TABLE_COLUMN_NAME="ID";
    private static final String NAME_TABLE_COLUMN_NAME="Nombre";
    private static final String PRICE_TABLE_COLUMN_NAME="Precio";
    private static final String DESCRIPTION_TABLE_COLUMN_NAME="Descripción";
    private static final String DISCOUNT_TABLE_COLUMN_NAME="Descuento";

    
    
}
