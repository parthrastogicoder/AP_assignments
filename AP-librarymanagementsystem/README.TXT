------------------------------------------------------------------------# Library Management System

The Library Management System is a Java-based console application designed to manage the operations of a library. It allows librarians to add and remove books, register and remove members, and track book issues and returns. Members can browse available books, borrow and return books, and pay fines for late returns.

## Features

The library management system includes the following features:

1. **Add Books**: Librarians can add books to the library's inventory by specifying the title, author, and the number of copies to be added. Each book is assigned a unique book ID.

2. **Remove Books**: Librarians can remove books from the inventory using the book's ID. If a book is removed, it is no longer available for borrowing.

3. **Add Members**: Librarians can register library members by providing their name, age, and phone number. Each member is assigned a unique member ID.

4. **Remove Members**: Librarians can remove members from the system by specifying their phone number.

5. **Issue Books**: Librarians can issue books to registered members. They need to provide the member's phone number and the book's ID. The system checks if the member is eligible to borrow the book and updates the book's status accordingly.

6. **Return Books**: Members can return books they have borrowed by providing their phone number and the book's ID. The system calculates fines for late returns, if applicable.

7. **List Available Books**: Members can view the list of available books in the library.

8. **List My Books**: Members can view the books they have borrowed, along with their issue and return dates.

9. **Pay Fines**: Members can pay fines for late returns to clear their outstanding balances.

## Classes

### `library` Class
- Manages the core operations of the library.
- Contains methods for adding and removing books and members, issuing and returning books, listing available books, listing members, calculating fines, and more.
- The `main` method initializes the library system and provides a user interface for librarians and members.

### `Book` Class
- Represents a book in the library.
- Contains information about the book, including title, author, number of copies, unique book ID, and timestamps for issue and return.
- Provides methods for decreasing the number of copies, setting issue and return timestamps, and accessing book details.

### `Member` Class
- Represents a library member.
- Stores information about members, including their name, age, phone number, borrowed books, and fines.
- Provides methods for checking if a member can borrow a book, adding and removing borrowed books, and managing fines.

#### `Member` Class Fields and Methods

- `name` (String): Stores the name of the member.
- `age` (int): Stores the age of the member.
- `phoneNo` (long): Stores the phone number of the member.
- `borrowedBooks` (ArrayList<Book>): Stores a list of books borrowed by the member.
- `fine` (long): Stores the fine amount for the member.

##### Methods

- `getName()`: Returns the name of the member.
- `getAge()`: Returns the age of the member.
- `getPhoneNo()`: Returns the phone number of the member.
- `getBorrowedBooks()`: Returns the list of books borrowed by the member.
- `getFine()`: Returns the fine amount for the member.
- `setFine(long fine)`: Sets the fine amount for the member.
- `canBorrowBook(Book book)`: Checks if the member is eligible to borrow a book.
- `addBorrowedBook(Book book)`: Adds a borrowed book to the member's list of borrowed books.
- `hasBorrowedBook(Book book)`: Checks if the member has borrowed a specific book.
- `removeBorrowedBook(Book book)`: Removes a borrowed book from the member's list of borrowed books.


## Example Usage

### Librarian
- Register members.
- Add and remove books.
- View the list of registered members.
- View the list of available books.
- Issue books to members.
- Remove members.

### Member
- Browse available books.
- Borrow books.
- Return books.
- Pay fines for late returns.
- View borrowed books.

## Dependencies

This library management system does not have external dependencies other than the Java standard library.

## Note

- Fines are calculated at a rate of 3 Rupees per day for each day a book is late, starting from the 11th day.
- Members can borrow a maximum of 2 books at a time.
- The system provides feedback messages to users for successful or unsuccessful operations.

Feel free to use and modify this library management system for your own purposes. If you have any questions or encounter issues, please don't hesitate to contact the developer.

