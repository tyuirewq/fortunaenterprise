package mainpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Homepage{
	static Connection conn; 
	public static void main(String[] args) {

		conn = null;
    	try {
    		conn = DriverManager.getConnection("jdbc:sqlserver://10.10.1.10;encrypt=false;databaseName=casedb;user=caseuser;password=IoC@1PtI#2");
    		if(conn != null) {
    			System.out.println("Connection established");
    			
    		}
    		else {
    			System.out.println("Connection is not established");
    		}
    	}
    	catch (SQLException ex) {
    		System.out.println(ex);
    	}
    	
    	 Loginpage LoginFrame = new Loginpage();
         LoginFrame.setVisible(true);
         LoginFrame.pack();
         LoginFrame.setLocationRelativeTo(null); 
         
    }

}
