package jordfuktighetsSensor;

import java.io.Serializable;
import java.sql.Timestamp;


public class jordfuktighetssensor implements Serializable {
    private static long serialVersionUID = 1L;
    private int SensorId;
    private double SensorValue;
    private String SensorName;
    private Timestamp time;
    
    public void jordfuktighetssensor(){}
    
    public void jordfuktighetssensor(int SensorId,double SensorValue, String SensorName, Timestamp time){
        this.SensorId = SensorId;
        this.SensorValue = SensorValue;
        this.SensorName = SensorName;
        this.time = time;
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

    public String getSensorName() {
        return SensorName;
    }

    public void setSensorName(String SensorName) {
        this.SensorName = SensorName;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    } 
}
