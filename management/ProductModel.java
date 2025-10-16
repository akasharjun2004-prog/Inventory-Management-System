/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventery.management;


public class ProductModel 
{
    
   private int productId;
    private String productName;
    private int quantity;
    private double price;

    public ProductModel(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public ProductModel(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId()
    {
        return productId;
    }
    public String getProductName() 
    {
        return productName;
    }
    public int getQuantity() 
    {
        return quantity; 
    }
    public double getPrice() 
    {
        return price;
    }
    public void setQuantity(int quantity) 
    {
    this.quantity = quantity; 
    }
    public void setPrice(double price) 
    { 
        this.price = price; 
    }
}


    



