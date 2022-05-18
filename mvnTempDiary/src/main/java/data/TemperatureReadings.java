/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Stiv
 */
public class TemperatureReadings extends Observable {

    private ArrayList<temperatureData> temperatures = new ArrayList<temperatureData>();

    public void addReading(temperatureData td)
    {
        if (size()>0 && td.equals(getLast()))
        {
            return;
        }
        temperatures.add(td);
        //System.out.println(toString());
        setChanged();
        notifyObservers(toString());
    }

    public int size()
    {
        return temperatures.size();
    }

    public temperatureData getFirst()
    {
        return temperatures.get(0);
    }

    public  temperatureData getLast()
    {
        if (temperatures.size()==0) return null;
        return temperatures.get(temperatures.size()-1);
    }



    public String toString()
    {
        String allTemperatures="";
        int i;
        for (i=0;i<temperatures.size();i++)
        {
            allTemperatures += temperatures.get(i).toString() + "\n";
        }
        return allTemperatures;
    }

}
