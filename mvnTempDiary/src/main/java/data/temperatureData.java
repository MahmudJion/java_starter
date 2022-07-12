package data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Observable;

public class temperatureData extends Observable {

    /**
     * @return the dt
     */
    public LocalDateTime getDt() {
        return dt;
    }

    /**
     * @param dt the dt to set
     */
    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }

     /**
     * @return the temperature
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the isCelsius
     */
    public boolean isIsCelsius() {
        return isCelsius;
    }

    /**
     * @param isCelsius the isCelsius to set
     */
    public void setIsCelsius(boolean isCelsius) {
        this.isCelsius = isCelsius;
    }

    public String toString()
    {
        String timeString, dateString;
        dateString = dt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        timeString = dt.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        return dateString + " " + timeString + " " + temperature + " " + advice;

    }

    public void setTempAndUnits(String temperatureStr, boolean isCelsius)
    {
        this.setDt(LocalDateTime.now());
        this.isCelsius = isCelsius;
        try
        {
        float newTemperature = Float.parseFloat(temperatureStr);
        if (newTemperature<0) return;
        this.temperature = newTemperature;
        if (!isCelsius) temperature = (temperature-32)*5/9;
        setAdvice(this.temperature);
        }
        catch (Exception e)
        {
          this.advice="You must put in a proper number";
        }

        setChanged();
        this.notifyObservers(this.advice);
        System.out.println(toString());
    }

    public boolean equals(temperatureData oTd)
    {
        if (this.temperature ==oTd.temperature &&
                withinXSeconds(10,this,oTd)) return true;
        return false;
    }

    public void setAdvice(float temperature)
    {
        if (temperature<36)  advice="a little low";
        else if (temperature <38) advice = "fine";
        else advice="a little high, maybe see a doctor";
    }



    private boolean withinXSeconds(int nSeconds, temperatureData td1, temperatureData td2)
    {
        if (ChronoUnit.SECONDS.between(td1.getDt(), td2.getDt())<nSeconds) return true;
        return false;
    }

    private float temperature;
    private boolean isCelsius;
    private String advice;
    private LocalDateTime dt;


}
