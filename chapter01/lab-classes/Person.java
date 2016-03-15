
/**
 * The Person class represents a person in a person administration system.
 * It holds the person details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2011.07.31
 */
public class Person
{
    // the person's full name
    private String name;
    // the person ID
    private String id;

    /**
     * Create a new person with a given name and ID number.
     */
    public Person(String fullName, String personID)
    {
        name = fullName;
        id = personID;
        
    }

    /**
     * Return the full name of this person.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this person.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the person ID of this person.
     */
    public String getPersonID()
    {
        return id;
    }

    /**
     * Return the login name of this person. The login name is a combination
     * of the first four characters of the person's name and the first three
     * characters of the person's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
}
