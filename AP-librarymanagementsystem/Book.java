import java.time.*;
class Book {
    private String title;
    private String author;
    private int copies;
    private int bookId;
    private static int copyId=0;
    private Instant issuedTime;
    private Instant returnedTime;
    
    public Book(String title, String author) 
    {   copyId++;
        this.title = title;
        this.author = author;
        this.bookId =copyId;
        this.issuedTime = null;
        this.returnedTime = null;
    }
    public String getTitle() 
    {
        return title;
    }
    public String getAuthor() 
    {
        return author;
    }
    public int getCopies() 
    {
        return copies;
    }
    public int getBookId() 
    {
        return bookId;
    }
    public void setCopies(int copies) {
        this.copies = copies;
    }
    public Instant getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(Instant issuedTime) {
        this.issuedTime = issuedTime;
    }

    public Instant getReturnedTime() {
        return returnedTime;
    }

    public void setReturnedTime(Instant returnedTime) {
        this.returnedTime = returnedTime;
    }
    public void decreaseCopies() {
        if (copies > 0) {
            copies--;
        }

    }
    public int getCopyId() {
        return copyId;
    }
}
