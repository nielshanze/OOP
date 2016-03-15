
public class Testor
{
    public Testor()
    {
        doTest();
    }
    public void doTest()
    {
        LabClass lab= new LabClass(5);
        Instructor instructor = new Instructor("Evert", "NIEV");
        Student student1 = new Student("Niels", "345595");
        Student student2 = new Student("Martijn", "344124");
        lab.setInstructor(instructor);
        lab.enrollStudent(student1);
        lab.enrollStudent(student2);
        lab.setRoom("TN/A242");
        lab.printList();
    }
}
