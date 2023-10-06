
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class library
{   ArrayList<Member> members = new ArrayList<>();
    ArrayList<Book> inventory = new ArrayList<>();
    int num_mem = 0;
    int num_inventory=1;
    
    
   public void add_book(String title, String author,int copies)
   {
       for (int i = 0; i < copies; i++) {
        Book newBook = new Book(title, author);
        inventory.add(newBook);
        num_inventory++;
        //copyId++; // Increment the copy ID for the next copy
    }
    System.out.println("Books Added Successfully!");
   }
   
   public void remove_book(int bookIdToRemove)
   {   
       for (int i = 0; i < inventory.size(); i++) 
       {
            Book book = inventory.get(i);
            if (book.getBookId() == bookIdToRemove) 
            {
                inventory.remove(i);
                System.out.println("Book Removed Successfully!");
                return;
            }
        }
        System.out.println("Book with Book ID " + bookIdToRemove + " not found.");
    }       
    
   public void add_member(String name,int age,long phno)
   {
        Member newMember = new Member(name,age,phno);
        members.add(newMember);
        System.out.println("Member Successfully Registered.");
   }
   public void rem_member(long phoneNumber)  
   {
       for (int i = 0; i < members.size(); i++) 
       {
            Member member = members.get(i);
            if (member.getPhoneNo() == phoneNumber) 
            {
                members.remove(i);
                System.out.println("Member Removed Successfully!");
                return;
            }
        }
        System.out.println("Member with phone number " + phoneNumber + " not found.");
    
   }
  public void issue_book(long phoneNumber, int bookId) 
  {
    Member member = null;
    Book book = null;
    for (Member m : members) 
    {
        if (m != null && m.getPhoneNo() == phoneNumber) 
        {
            member = m;
            break;
        }
    }
    for (Book b : inventory) 
    {
        if (b != null && b.getBookId() == bookId) 
        {
            book = b;
            break;
        }
    }

    if (member != null && book != null) 
    {
        if (member.canBorrowBook(book)) 
        {
            Instant issuedTime = Instant.now();
            book.setIssuedTime(issuedTime);
            if (member.addBorrowedBook(book)) 
            {   
                book.decreaseCopies();
                System.out.println("Book issued to member successfully!");
                Iterator<Book> iterator = inventory.iterator();
while (iterator.hasNext()) {
    Book boo = iterator.next();
    if (boo.getBookId() == bookId) {
        iterator.remove();
    }
}
            } 
            else 
            {
                System.out.println("Member has reached the maximum number of borrowed books.");
            }
        }
        else 
        {
            System.out.println("Member cannot borrow this book due to fines or other restrictions.");
        }
    }
    else 
    {
        System.out.println("Member or book not found.");
    }
}
       
   
public void return_book(long phoneNumber, int bookId) {
    Member member = null;
    Book book = null;
    for (Member m : members) 
    {
        if (m != null && m.getPhoneNo() == phoneNumber) 
        {
            member = m;
            break;
        }
    }
    for (Book b : member.getBorrowedBooks()) 
    {
        if (b != null && b.getBookId() == bookId) 
        {
            book = b;
            break;
        }
    }

    if (member != null && book != null) {
        if (member.hasBorrowedBook(book)) {
            Instant returnedTime = Instant.now();
            book.setReturnedTime(returnedTime);
            member.removeBorrowedBook(book);
            book.setCopies(book.getCopies() + 1);
            calc_fine(member, book);
            inventory.add(book);
            System.out.println("Book returned successfully!");
        }
        else 
        {
            System.out.println("Member has not borrowed this book.");
        }
    }
    else 
    {
        System.out.println("Member or book not found.");
    }
}

   public void list_b()
   {
     System.out.println("List of Available Books:");
    for (Book book : inventory) 
    {
        if (book != null ) 
        {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("---------------------------------");
        }
    }
       
   }
   public void list_m()
   {
       System.out.println("List of Registered Members:");
    for (Member member : members) 
    {
        if (member != null) 
        {
            System.out.println("Member Name: " + member.getName());
            System.out.println("Age: " + member.getAge());
            System.out.println("Phone Number: " + member.getPhoneNo());
            ArrayList<Book> borrowedBooks = new ArrayList<>();
            borrowedBooks=member.getBorrowedBooks();
            long fi =0;
            for(Book bo :borrowedBooks)
            {
            Instant returnedTime = Instant.now();
            
            long daysLate = ChronoUnit.SECONDS.between(bo.getIssuedTime(), returnedTime);
            if(daysLate>10){
            fi= fi + ((daysLate-10) * 3);}
            System.out.println("     Book ID: " + bo.getBookId());
            System.out.println("     Title: " + bo.getTitle());
            System.out.println("     Author: " + bo.getAuthor());
        }
            
            System.out.println("Fine: " + fi);
            System.out.println("---------------------------------");
        }
    }
   }
   public void calc_fine(Member member, Book book)
   {
      Instant issuedTime = book.getIssuedTime();
        Instant returnedTime = book.getReturnedTime();
        
        if (issuedTime != null && returnedTime != null) {
            long daysLate = ChronoUnit.SECONDS.between(issuedTime, returnedTime);
            long fine = (daysLate-10) * 3;
            if (fine > 0) {
                member.setFine(member.getFine() + fine);
                System.out.println("A fine of " + fine + " Rupees has been charged for a delay of " + (daysLate-10) + " days.");
            }
        }
       
   }
   public void list_my_books(long phoneNumber) {
        Member member = null;
        for (Member m : members) {
            if (m != null && m.getPhoneNo() == phoneNumber) {
                member = m;
                break;
            }
        }

        if (member != null) {
            System.out.println("List of Books Borrowed by " + member.getName() + ":");
            ArrayList<Book> borrowedBooks = member.getBorrowedBooks();

            for (Book book : borrowedBooks) {
                System.out.println("Book ID: " + book.getBookId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Issued Time: " + book.getIssuedTime());
                System.out.println("Returned Time: " + book.getReturnedTime());
                System.out.println("---------------------------------");
            }
        } else {
            System.out.println("Member with phone number " + phoneNumber + " not found.");
        }
    }
    public void pay_fine(long phoneNumber) {
        Member member = null;

        // Find the member by phone number
        for (Member m : members) {
            if (m != null && m.getPhoneNo() == phoneNumber) {
                member = m;
                break;
            }
        }

        if (member != null) {
                    member.setFine(0);
                    System.out.println("Fine paid successfully!");
                } 
    }

   public static void main()
   {
       library lib = new library();
       Scanner sc = new Scanner(System.in);
       
       int exit =0;
       while(exit==0)
       {System.out.println("Library Portal Initialized….");
        System.out.println("---------------------------------");
        System.out.println("1.   Enter as a librarian ");
        System.out.println("2.   Enter as a member");
        System.out.println("3.   Exit");
        System.out.println("---------------------------------");
        int lib_mem= sc.nextInt();
        if(lib_mem ==1) 
        {
            int exit2= 0;
            while(exit2==0)
            {
            System.out.println("---------------------------------");
            System.out.println("1.   Register a member");
            System.out.println("2.   Remove a member");
            System.out.println("3.   Add a book");
            System.out.println("4.   Remove a book");
            System.out.println("5.   View all members along with their books and fines to be paid");
            System.out.println("6.   View all books");
            System.out.println("7.   Back");
            System.out.println("---------------------------------");
            int lib_in= sc.nextInt();
            if(lib_in==1)
            {   sc.nextLine();
                System.out.println("Name:");
                String n = sc.nextLine();
                System.out.println("Age:");
                int a= sc.nextInt();
                System.out.println("Phone no:");
                long ph=sc.nextLong();
                System.out.println("---------------------------------");
                lib.add_member(n,a,ph);
                System.out.println("---------------------------------");
            }
            else if(lib_in==2)
            {    System.out.println("Number:");
                int pno =sc.nextInt();
                lib.rem_member(pno);
                System.out.println("---------------------------------");
            }
            else if(lib_in==3)
            
            {   sc.nextLine();
                System.out.println("1:   Book title:");
                String tit = sc.nextLine();
                System.out.println("2:   Author:");
                String aut = sc.nextLine();
                System.out.println("3:   Copies");
                int copies =sc.nextInt();
                lib.add_book(tit,aut,copies);
                
            }
            else if(lib_in==4)
            {   System.out.println("Id");
                int Id = sc.nextInt();
                lib.remove_book(Id);
                System.out.println("---------------------------------");
            }
            else if(lib_in==5)
            {
                lib.list_m();
                System.out.println("---------------------------------");
            }
            else if(lib_in==6)
             {
                lib.list_b();
                System.out.println("---------------------------------");
            }
            else if(lib_in==7)
            {
                exit2=1;
            }
        }
        
            
        }
        else if(lib_mem==2)
        {   sc.nextLine();
            System.out.println("Name :");
            String Nam=sc.nextLine();
            System.out.println("Phone No:");
            long pn = sc.nextLong();
             Member meme= null;
             int flag=0;
            for (Member m : lib.members) {
            if (m != null && m.getPhoneNo() == pn&& m.getName().equals(Nam) ) {
                meme = m;
                flag=1;
                break;
            }
            else
            {
                System.out.println("Member not Found");
            }
        }
            if(flag==1)
            {
            int exit3=0;
            while(exit3==0)
            {
                System.out.println("---------------------------------");
                System.out.println("1.   List Available Books");
                System.out.println("2.   List My Books");
                System.out.println("3.   Issue book");
                System.out.println("4.   Return book");
                System.out.println("5.   Pay Fine");
                System.out.println("6.   Back");
                System.out.println("---------------------------------");
                int mem_in= sc.nextInt();
            if(mem_in==1)
            {
                lib.list_b();
                System.out.println("---------------------------------");
            }
            else if(mem_in==2)
            {
                sc.nextLine();
                lib.list_my_books(pn);
                System.out.println("---------------------------------");
            }
            else if(mem_in==3)
            {   
                System.out.println("Book ID: ");
                int id =sc.nextInt();
                lib.issue_book(pn, id);
                System.out.println("---------------------------------");
            }
            else if(mem_in==4)
            {  
                System.out.println("Enter Book ID: ");
                int id =sc.nextInt();
               lib.return_book(pn, id);
                System.out.println("---------------------------------");
                System.out.println("---------------------------------");
            }
            else if(mem_in==5)
            {
               // lib.pay_fine(pn);
               meme.setFine(0);
               System.out.println("fine paid sucessfully");
               
            }
            else if(mem_in==6)
            {
             exit3=1;   
            }
            }
        }
        }
        else if(lib_mem==3)
        {
            exit=1;
        }
        }
        
       }
       
   }
   

