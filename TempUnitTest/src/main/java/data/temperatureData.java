/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Observable;

/**
 *
 * @author Stiv
 */
public class temperatureData extends Observable {

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

    public void setTempAndUnits(String temperatureStr, boolean isCelsius)
    {
        this.isCelsius = isCelsius;
        try {
            this.temperature = Float.parseFloat(temperatureStr);
            if (!isCelsius) temperature = (temperature-32)*5/9;
            setAdvice(this.temperature);

        } catch(Exception e) {
            this.advice = "you must input a valid number";
        }

        setChanged();
        this.notifyObservers(this.advice);

    }

    public void setAdvice(float temperature)
    {
        if (temperature<36)  advice="a little low";
        else if (temperature <38) advice = "fine";
        else advice="a little high, maybe see a doctor";
    }



 private float temperature;
 private boolean isCelsius;
 private String advice;


}
