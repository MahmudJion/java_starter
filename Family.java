package ood;

import java.util.ArrayList;

/**
 * Write a description of class Family here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Family
{
    private String mother;
    private String father;
    private Person[] children ;     // declare an array
    private int childCount;
    private ArrayList<Dog> myDogs;  // declare ArrayList
    // declare a collection of children - what type of object will be stored ??? 
      
    public Family(String ma, String pa)
    {
        mother = ma;
        father = pa;
        myDogs = new ArrayList<Dog>(); // create ArrayList
        // create the collection of children
        children = new Person[5]; // create fixed size array
    }
    
    // using arrays
    //Complete the code
    /* add Person object**/
    public void addChild(Person ch)
    {
        if(childCount<children.length)
        {
            children[childCount] = ch;
            childCount++;
        }
    }

    // output all elements
    public void showAllChildren()
    {
        for(int index=0; index<childCount; index++)
        { 
            //Person xx = children[index];
            System.out.println(children[index].getAsString());
            // OR
            // System.out.println(children[index].getAsString());
        }
    }
    
    // accumulate all elements and return as a String
    public String getAllChildren()
    {
        String s = "";
        for(int index=0; index<childCount; index++)
        { 
            //Person xx = children[index];
            s = s + children[index].getAsString() +"\n";
            //OR  in one line of code ??
        }
        return s;
    }

    /** returns the number of children in their collection
     */
    public int noOfChildren()
    {
        return childCount; 
    }
        
    public void removeAChild(int position)
    {
        if(position>=0 && position<childCount-1)
        {
            for(int index=position; index<childCount-1; index++)
              children[index]=children[index+1];
            childCount--;
        }
        else if(position == childCount-1)
                childCount--;
    }
    
    //Searching
    public void showAChild(int position) // print to Terminal window
    {
      // show one child - you need to know its position in
      if (position >=0 && position<childCount)
       {
           //Person ppp  = children[position];
           System.out.println(children[position].getAsString());
        }
    }  
        
    public Person getAChild(int position)
    {
       // get a child given its position in the list. Make sure to check the parameter
        if (position >=0 && position < childCount)
        {
            return children[position];
        }
        return null;
    }

    /** Can you write addChild which is the equivalent of  public void addDog(String nnn, String bbb)
     * Check what data a Person  constructor requires and make sure you ask for these as parameters
     */
    public void addChild(String nnn, int ag)
    {
        if(childCount<children.length)
        {
           //Person temp;
           //temp = new Person(nnn,ag); //create child object from parameter data
           children[childCount] = new Person(nnn,ag); // add child object
           childCount++;
        }
    }
    
    // remove a child by name ? find it first and then ??
    public void removeAChild(String name )
    {
        for(int index=0; index<childCount; index++)
        { 
            if(children[index].getName().equalsIgnoreCase(name))
            {    
              if(index<childCount-1)
              {
                for(int i=index; i<childCount-1; i++)
                    children[i]=children[i+1];
                childCount--;
              }
              else if(index == childCount-1)
                childCount--;
              break;
            }   
        }
    }
       
    // using Arraylist
        /* add dog object**/
    public void addDog(Dog gg) 
    {
        myDogs.add(gg);
    }
        
    /** returns the number of dogs in the collection
     */
    public int noOfDogs()
    {
        return myDogs.size();
    }
    
    /** remove a dog at the position indicated by the parameter
     */
    public void removeDog(int position)
    {
       if (position >=0 && position<myDogs.size()) // this makes sure that position is in the right range
       {
           myDogs.remove(position);
       } 
    }
   
    /** show in the Terminal Window, the dog at the position indicated by the parameter
     * from its collection
     */
    public void showADog(int position) // print to Terminal window
    {
       if (position >=0 && position<myDogs.size())
       {
           //Dog ddd;
           //ddd = myDogs.get(position);
           System.out.println(myDogs.get(position).getAsString());
        }
    }  
    
    /** returns a String representation of the dog in the position given 
     * by the parameter
     */
    public Dog getADog(int position)
    {
       if (position >=0 && position<myDogs.size())
       {
           //Dog ddd;
           //ddd = myDogs.get(position);
           return myDogs.get(position);
        }
        return null;
    } 

    /** add dog alternative **/
    public void addDog(String nnn, String bbb)
    {
        //Dog temp;
        //temp = new Dog(nnn,bbb); //create dog object from parameter data
        myDogs.add(new Dog(nnn,bbb)); // add dog object
    }   
    
   //**************using loops **************
    public void showAllDogs()
    {
        int index = 0;       
        while (index < myDogs.size()) 
        {    
            //Dog temp = myDogs.get(index); 
            // process dog in a relevant way          
            System.out.println(myDogs.get(index).getAsString());
            index++;
        }
    } 
    
    // write a method: "getAllDogs()"
    public String getAllDogs()
    {
        String s = "";
        int index = 0;
        while (index < myDogs.size())
        { 
            //Dog xx = myDogs.get(index);
            s = s + myDogs.get(index).getAsString() +"\n";
            //OR  in one line of code ??
            index++;
        }
        return s;
    } 
} 

        

