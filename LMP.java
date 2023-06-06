import java.util.*;

public class LMP {
    public static void showMenu() {
        System.out.println("Welcome to the Library Management Program!");
        System.out.println("1. Add a book");
        System.out.println("2. Remove a book");
        System.out.println("3. Search by title");
        System.out.println("4. Search by author");
        System.out.println("5. Search by genre");
        System.out.println("6. Display all books");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int userInput = Integer.parseInt(System.console().readLine());

        Library libraryMain = new Library();
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction");
        Book book2 = new Book("1984", "George Orwell", "Dystopian");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", "Realistic Fiction");
        libraryMain.addBook(book1);
        libraryMain.addBook(book2);
        libraryMain.addBook(book3);


        while(true){
            showMenu();
            System.out.print("Enter your choice: ");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.print("Enter the title of the book: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.print("Enter the author of the book: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the genre of the book: ");
                    String genre = scanner.nextLine();
                    Book newBook = new Book(title, author, genre);
                    libraryMain.addBook(newBook);
                    System.out.println("Book added successfully!");
                    System.out.println(newBook);
                    break;

                case 2:
                    System.out.print("Enter the title of the book to remove: ");
                    scanner.nextLine();
                    String removeTitle = scanner.nextLine();
                    List<Book> removeResults = libraryMain.searchByTitle(removeTitle);
                    if(removeResults.isEmpty() && libraryMain.books.size() == 0){
                        System.out.println("You have no books in your library!");
                    }
                    else if (removeResults.isEmpty()) {
                        System.out.println("No matching books found!");
                    } else {
                        for (Book book : removeResults) {
                            libraryMain.removeBook(book);
                        }
                        System.out.println("Book(s) removed successfully!");
                    }
                    break;
                case 3:
                    System.out.print("Enter the title to search: ");
                    scanner.nextLine();
                    String searchTitle = scanner.nextLine();
                    List<Book> searchResults = libraryMain.searchByTitle(searchTitle);
                    if (searchResults.isEmpty()) {
                        System.out.println("No matching books found!");
                    } else {
                        for (Book book : searchResults) {
                            System.out.println(book);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter the author to search: ");
                    scanner.nextLine();
                    String searchAuthor = scanner.nextLine();
                    List<Book> searchResultsByAuthor = libraryMain.searchByAuthor(searchAuthor);
                    if (searchResultsByAuthor.isEmpty()) {
                        System.out.println("No matching books found!");
                    } else {
                        for (Book book : searchResultsByAuthor) {
                            System.out.println(book);
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter the genre to search: ");
                    scanner.nextLine();
                    String searchGenre = scanner.nextLine();
                    List<Book> searchResultsByGenre = libraryMain.searchByGenre(searchGenre);
                    if (searchResultsByGenre.isEmpty()) {
                        System.out.println("No matching books found!");
                    } else {
                        for (Book book : searchResultsByGenre) {
                            System.out.println(book);
                        }
                    }
                    break;
                case 6:
                    System.out.println(libraryMain);
                    break;
                case 7:
                    System.out.println("Thank you for using the Library Management Program!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}