
package inventery.management;

import java.sql.SQLException;


public class InventeryManagement {

  
    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {
       InventeryManagerController Execute =new InventeryManagerController();
       Execute.launchApp();
    }
    
}
