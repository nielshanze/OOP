import java.util.Set;
/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String description;
    private double weight;

    /**
     * Constructor for objects of class Item
     */
    public Item(String description, double weight)
    {
        // initialise instance variables
        this.description = description;
        this.weight = weight;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getItemDescription()
    {
        return "This is " + description + ". ";
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getItemWeight()
    {
        return "Weight is: " + weight + "lbs.";
    }
    
    public String getItemInfo()
    {
        return getItemDescription() + getItemWeight();
    }
}
