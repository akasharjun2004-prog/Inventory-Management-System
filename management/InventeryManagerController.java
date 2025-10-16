
package inventery.management;

import java.sql.SQLException;
    import java.util.List;
import java.util.Scanner;
public class InventeryManagerController 
{



    private final ProductDAO DAO = new ProductDAO();
    private final Scanner sc = new Scanner(System.in);
    private final Scanner sc1 = new Scanner(System.in);

    public void launchApp() throws SQLException, ClassNotFoundException {
        while (true) {
            System.out.println("\n=== Inventory Management ===\n Press Num to Select your choice");
            System.out.println("1. Add Product\n2.View all Product\n3.Update Product Quantity\n4.Delete Product\n5.Exit");
            System.out.print("Your Choise :");
            int choise =sc.nextInt();
            switch(choise)
            {
                case 1 :
                {
                    AddProduct();
                    break;
                }
                  case 2:
                {
                   displayProducts();
                    break;
                }
                    case 3:
                {
                    UpdateProduct();
                    break;
                }
                      case 4 :
                {
                    deleteProduct();
                    break;
                }
                        case 5 :
                {
                    System.out.println("Exiting.....");
                    return;
                }
                        default :
                        {
                        
                            System.out.println("Invalid Choise....");
                        }
               
            }
        }
    }

    private void AddProduct() throws SQLException, ClassNotFoundException {
        System.out.print("Enter product name: ");
        String name = sc1.nextLine();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        DAO.insertProduct(new ProductModel(name, qty, price));
    }

    private void displayProducts() throws SQLException, ClassNotFoundException {
        List<ProductModel> list = DAO.Select();
        System.out.printf("%-5s %-20s %-10s %-10s%n", "ID", "Name", "Qty", "Price");
        for (ProductModel p:list)
        {
            System.out.printf("%-5d %-20s %-10d %-10f%n",
            p.getProductId(),p.getProductName(),p.getQuantity(),p.getPrice());
        }

    }
    private void UpdateProduct() throws SQLException, ClassNotFoundException
    {
        System.out.println("Enter Id to Update");
        int id=sc.nextInt();
        System.out.println("Enter New Quantity");
        int Qyt=sc.nextInt();
        DAO.updateProductQuantity(id, Qyt);
    
    }
    
    private void deleteProduct() throws ClassNotFoundException
    {
        System.out.println("Enter Product Id To Del");
        int id=sc.nextInt();
        DAO.DeleteProduct(id);
    
    }
    
}


