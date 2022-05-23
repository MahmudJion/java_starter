package data;

import java.util.Observable;


/**
 *
 * @author Stiv
 */
public class journeyCoster extends Observable {

    /**
     * @return the totalCost
     */
    public float getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost the totalCost to set
     */
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
        setChanged();
        notifyObservers(this.totalCost);

    }

    public void setJourneyValues(String mpg, String pricePerLitre, String miles)
    {
        this.setMiles(Float.parseFloat(miles));
        this.setPricePerLitre(Float.parseFloat(pricePerLitre));
        this.setMpg(Float.parseFloat(mpg));
        getJourneyCost();

    }

    /**
     * @return the mpg
     */

     float g2l = (float) 4.54609;
    public float getMpg() {
        return mpg;
    }

    /**
     * @param mpg the mpg to set
     */
    public void setMpg(float mpg) {
        this.mpg = mpg;
        getJourneyCost();
    }

    /**
     * @return the miles
     */
    public float getMiles() {
        return miles;
    }

    /**
     * @param miles the miles to set
     */
    public void setMiles(float miles) {
        this.miles = miles;
        getJourneyCost();
    }

    /**
     * @return the pricePerLitre
     */
    public float getPricePerLitre() {
        return pricePerLitre;
    }

    /**
     * @param pricePerLitre the pricePerLitre to set
     */
    public void setPricePerLitre(float pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
        getJourneyCost();
    }


    private boolean getJourneyCost()
    {
        try
        {
        float milesPerLitre =  mpg/g2l;
        float petrolNeeded = miles/milesPerLitre;
        setTotalCost(petrolNeeded*pricePerLitre);
        return true;
        }
        catch (Exception e)
        {
            return false;
        }


    }

    private float mpg;
    private float miles;
    private float pricePerLitre;

    private float totalCost;


}
