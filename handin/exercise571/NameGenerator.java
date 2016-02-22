
/**
 * This will make your starwars name according to a formula found on the internet
 * 
 * @author Niels van der Veen 
 * @version 22 feb 2016
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String mothersName;
    private String cityName;

    /**
     * Constructor for objects of class NameGenerator
     * 
     *@param   setFirstName      The input that the firstname will be set to
     *          setLastName      The input that the lastname will be set to
     *          setMothersName      The input that the mothersname will be set to
     *          setCityName      The input that the cityname will be set to
     */
    public NameGenerator(String setFirstName, String setLastName, String setMothersName, String setCityName)
    {
        firstName = setFirstName;
        lastName = setLastName;
        mothersName = setMothersName;
        cityName = setCityName;
    }
    
    /**
     * This method will set all the names needed to make your starwars name.
     * 
     * @param   setFirstName      The input that the firstname will be set to
     *          setLastName      The input that the lastname will be set to
     *          setMothersName      The input that the mothersname will be set to
     *          setCityName      The input that the cityname will be set to
     */
    public void setName(String setFirstName, String setLastName, String setMothersName, String setCityName)
    {
        firstName = setFirstName;
        lastName = setLastName;
        mothersName = setMothersName;
        cityName = setCityName;
    }

    /**
     * This will print out your starwarsname.
     * 
     */
    public void generateStarWarsName()
    {
        // put your code here
        String starFirst;
        String starLast;
        starFirst = lastName.toLowerCase().substring(0,3) + firstName.toLowerCase().substring(0,2);
        starLast = mothersName.toLowerCase().substring(0,2) + cityName.toLowerCase().substring(0,3);
        System.out.println(starFirst.substring(0, 1).toUpperCase() + starFirst.substring(1) + " " + starLast.substring(0, 1).toUpperCase() + starLast.substring(1) + ", may the force be with you!");
    }
}
