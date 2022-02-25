/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI3.data;

import java.util.Observable;

/**
 *
 * @author mh21act
 */
public class BmiData extends Observable {
    private float weightKg;
    private float heightM;
    private float Bmi;

    /**
     * @return the weightKg
     */
    public float getWeightKg() {
        return weightKg;
    }

    /**
     * @param weightKg the weightKg to set
     */
    public void setWeightKg(float weightKg) {
        this.weightKg = weightKg;
        calculateBmi();
    }

    /**
     * @return the heightM
     */
    public float getHeightM() {
        return heightM;
    }

    /**
     * @param heightM the heightM to set
     */
    public void setHeightM(float heightM) {
        this.heightM = heightM;
        calculateBmi();
    }

    /**
     * @return the Bmi
     */
    public float getBmi() {
        return Bmi;
    }

    /**
     * @param Bmi the Bmi to set
     */
    public void setBmi(float Bmi) {
        this.Bmi = Bmi;
        setChanged();
        notifyObservers(this.Bmi);
    }

    public void calculateBmi(){
        setBmi(getWeightKg() / getHeightM() * getHeightM());
    }

    public void setWeightAndHeight(String weight, String height){
        weightKg = Float.parseFloat(weight);
        heightM = Float.parseFloat(height);
        calculateBmi();
    }
}
