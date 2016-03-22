
public class Instructor extends Person
{

    public Instructor(String fullName, String studentID)
    {
        super(fullName, studentID);
    }



    
    /**
     * Print the person's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(getName() + ", person ID: " + getPersonID());
    }


}
