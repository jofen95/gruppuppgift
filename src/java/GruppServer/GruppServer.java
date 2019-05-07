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
    
    
    public List<jordfuktighetssensor> Displayluftfuktighet() throws ClassNotFoundException, FileNotFoundException, IOException{
        List<jordfuktighetssensor> jfgList = new ArrayList<>();

        
    Class.forName("com.mysql.cj.jdbc.Driver");
    Properties p = new Properties();
    p.load(new FileInputStream("/Users/Joel/grupparbetet/src/java/GruppServer/settings.properties"));
    try(Connection con = DriverManager.getConnection(p.getProperty("connection"), p.getProperty("username"), p.getProperty("password"));)
        {
         Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("Select id,value,sensorname,created from Jordfuktighetssensor");
        while(rs.next()){
            jordfuktighetssensor jfgsensor = new jordfuktighetssensor();
            int id = rs.getInt("id");
            float value = rs.getFloat("value");
            String sensorname = rs.getString("sensorname");
            Timestamp time = rs.getTimestamp("created");            
            jfgsensor.setSensorId(id);
            jfgsensor.setSensorName(sensorname);
            jfgsensor.setSensorValue(value);
            jfgsensor.setTime(time);
            jfgList.add(jfgsensor);


           
        }
        }
        catch(SQLException e){
        e.printStackTrace();   
        }
        return jfgList;
        
    }
    
}
