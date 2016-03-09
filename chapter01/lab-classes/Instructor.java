
/**
 * Write a description of class Instructors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructor extends Student
{
    // instance variables - replace the example below with your own
    // the student's full name
    private Student instructor;
     // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    
    public Instructor(String fullName, String studentID)
    {
        super(fullName, studentID);
    }
  
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 1;
    }
}
