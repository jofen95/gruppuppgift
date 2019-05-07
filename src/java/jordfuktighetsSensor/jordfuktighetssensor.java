package jordfuktighetsSensor;

import java.io.Serializable;
import java.sql.Timestamp;


public class jordfuktighetssensor implements Serializable {
    private static long serialVersionUID = 1L;
    private int SensorId;
    private double SensorValue;
    private Timestamp time;
    
    public void jordfuktighetssensor(){}
    
    public void jordfuktighetssensor(int SensorId,double SensorValue, Timestamp time){
        this.SensorId = SensorId;
        this.SensorValue = SensorValue;
        this.time = time;
        // hej hej
        
        
    }
    public int getSensorId() {
        return SensorId;
    }

    public void setSensorId(int SensorId) {
        this.SensorId = SensorId;
    }

    public double getSensorValue() {
        return SensorValue;
    }

    public void setSensorValue(double SensorValue) {
        this.SensorValue = SensorValue;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    } 
}
