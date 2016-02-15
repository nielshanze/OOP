/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
    
    public void setRef(String ref)
    {
       refNumber = ref;
    }
    
    public String getAuthor()
    {
       return author; 
    }
    
    public String getTitle()
    {
       return title; 
    }
    
    public int getPages()
    {
       return pages; 
    }
    
    public String getRef()
    {
       return refNumber; 
    }
    
    public void printAuthor()
    {
         System.out.println(author);
    }
    
    public void printTitle()
    {
         System.out.println(title);
    }
    
    /**
     * Print the details of the book.
     */
    public void printDetails()
    {
        //define ref
        String ref;
        
         //check if refNumber is a non-zero string or null, if so: set ref to "ZZZ"
         if(refNumber == null || refNumber.length() == 0){
             ref = "ZZZ";
         }else{
             ref = refNumber;
         }
         
         //This prints out the details of a book.
         System.out.println("Title: " + title);
         System.out.println("Author: " + author);
         System.out.println("Pages: " + pages);
         System.out.println("Reference number: " + ref);
        
    }
}
