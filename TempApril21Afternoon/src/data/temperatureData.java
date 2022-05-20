/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
This is my project now
And Steve is a contributor
Ive solved the illegal numbers problem

I have closed the kanban board
 */
package data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Observable;

/**
 *
 * @author Stiv
 */
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
     * @return the advice
     */


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
        //System.out.println(toString());
    }

    public void setAdvice(float temperature)
    {
        if (temperature<36 && temperature > 5)  advice="a little low";
        else if (temperature <38 && temperature > 5) advice = "fine";
        else if (temperature <= 5) advice = "very low";
        else if (temperature >40) advice = "very high";
        else advice="a little high, maybe see a doctor";
    }

    public boolean equals(temperatureData td)
    {
        if this.temperature == td.temperature
                && this.isCelsius == td.isCelsius
                && this.dt == td.equals(td);


    }


 private float temperature;
 private boolean isCelsius;
 private String advice;
 private LocalDateTime dt;


}
