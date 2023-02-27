package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class sqlconnection {
    public static Connection getcon()
    {
        try 
        {
            //Class.forName("com.mysql.cj.jdbc.driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","harshitha150502$");
            return con;
        } catch (Exception e) 
        {
            return null;
        }
    }
    public Statement createStatement()
    {
        throw new UnsupportedOperationException("Not supported yet");
    }
}
