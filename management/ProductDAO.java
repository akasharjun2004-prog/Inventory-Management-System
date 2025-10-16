/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventery.management;
    import java.sql.*;
import java.util.*;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDAO 
{
    

    private final String URL = "jdbc:postgresql://localhost:7010/inventory_management";
    private final String USER = "postgres";
    private final String PASSWORD = "Akashamutha";

    private Connection connect() throws SQLException, ClassNotFoundException 
    {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void insertProduct(ProductModel mo) throws SQLException, ClassNotFoundException 
    {
        String sql = "INSERT INTO products (product_name, quantity, price) VALUES (?, ?, ?)";
        try 
        {
            Connection con = connect(); 
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,mo.getProductName());
            pstm.setInt(2, mo.getQuantity());
            pstm.setDouble(3,mo.getPrice());
            pstm.executeUpdate();
            System.out.println("Product Added Sucessfully!!!");
            
        }
        catch(SQLException ex)
       {
           ex.printStackTrace();
       }
    }
    public ArrayList Select() throws SQLException, ClassNotFoundException
    {
        String sql="select * from products ";
      ArrayList productList=new ArrayList<>();
        try {
           Connection  con = connect();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs=pstm.executeQuery();
            while(rs.next())
            {
                productList.add(new ProductModel(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4)));
            }
        }
         catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return productList;
   
    }
      public void updateProductQuantity(int id, int newQuantity) throws SQLException, ClassNotFoundException
    {
        String sql = "UPDATE products SET quantity = ? WHERE product_id = ?";
        try 
        {Connection con = connect(); 
         PreparedStatement pstm = con.prepareStatement(sql);
        
            pstm.setInt(1,newQuantity);
            pstm.setInt(2,id);
            int Update=pstm.executeUpdate();
            System.out.println(Update>0?"Quantity Updated":"Product Not Found");  
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      
    public void DeleteProduct(int id) throws ClassNotFoundException
    {
     String sql = "Delete from products where Product_Id=?";
        try 
        {Connection con = connect(); 
         PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1,id);
            int Delete=pstm.executeUpdate();
             System.out.println(Delete>0?"Product Deleted":"Product Not Found");  
  
     
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
           
        

    }

   




