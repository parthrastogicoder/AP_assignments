import java.util.ArrayList;
class Member {
    private String name;
    private int age;
    private long phoneNo;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private long fine=0;
    public Member(String name, int age, long phoneNo) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
    }
    public String getName()
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }
    public long getPhoneNo() 
    {
        return phoneNo;
    }
    public ArrayList<Book> getBorrowedBooks()
    {
        return borrowedBooks;
    }
    public long getFine() 
    {
        return fine;
    }
   // public void setBorrowedBooks(Book[] borrowedBooks) 
    //{
    //    this.borrowedBooks = borrowedBooks;
    //}
    public void setFine(long fine) 
    {
        this.fine = fine;
    }
    public boolean canBorrowBook(Book book) {
   if (borrowedBooks.size() >= 2) {
            System.out.println("You have reached the maximum number of borrowed books (2 books).");
            return false;
        }

        for (Book borrowedBook : borrowedBooks) {
            if (borrowedBook.getBookId() == book.getBookId()) {
                System.out.println("You have already borrowed this book.");
                return false;
            }
        }

        if (fine > 0) {
            System.out.println("You cannot borrow books until you clear your fine.");
            return false;
        }

        return true;
}
public boolean addBorrowedBook(Book book) 
{
    if (canBorrowBook(book)) 
    {
            borrowedBooks.add(book);
            System.out.println("Book '" + book.getTitle() + "' added to your borrowed books.");
            return true; 
    }
    else 
    {
            System.out.println("Book '" + book.getTitle() + "' cannot be borrowed.");
            return false;
    }
}
public boolean hasBorrowedBook(Book book) {
        return borrowedBooks.contains(book);
    }

    public boolean removeBorrowedBook(Book book) {
        return borrowedBooks.remove(book);
    }
}