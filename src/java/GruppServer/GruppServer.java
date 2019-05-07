package GruppServer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import jordfuktighetsSensor.jordfuktighetssensor;

public class GruppServer {
        
    public void GruppServer(){}
    
    
    public int Displayluftfuktighet() throws ClassNotFoundException, FileNotFoundException, IOException{
        jordfuktighetssensor jfgsensor = new jordfuktighetssensor();
        List<jordfuktighetssensor> jfgList = new ArrayList<>();
        int id = 0;

        
    Class.forName("com.mysql.cj.jdbc.Driver");
    Properties p = new Properties();
    p.load(new FileInputStream("/Users/Joel/grupparbetet/src/java/GruppServer/settings.properties"));
    try(Connection con = DriverManager.getConnection(p.getProperty("connection"), p.getProperty("username"), p.getProperty("password"));)
        {
         Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("Select id,value,sensorname,created from Jordfuktighetssensor");
        while(rs.next()){
            id = rs.getInt("id");
            float value = rs.getFloat("value");
            String sensorname = rs.getString("sensorname");
            Timestamp time = rs.getTimestamp("created");
            
            System.out.print(id);
            System.out.print(value);
            System.out.print(sensorname);
            System.out.print(time);
           
        }
        }
        catch(SQLException e){
        e.printStackTrace();   
        }
        return id;
        
    }
    
}
