## program must include:
- [x] variables (Appropriately named)
- [x] arrays (Appropriately named)
- [x] nested iterations
- [x] loops
- [x] Boolean logic
- [x] constructors
- [x] toString
- [ ] ~~inheritance(extra credit)~~

## final submission must add:
- Submission of your written proposal (revised if needed) and/ or documentation
- Program Code
- Video of your program running with narration 

## some thoughts on selection system

    if (userInput == 1) {
        System.out.println("Enter the title of the book: ");
        scanner.nextLine();
        String title = scanner.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = scanner.nextLine();
        System.out.println("Enter the genre of the book: ");
        String genre = scanner.nextLine();

        Book newBook = new Book(title, author, genre);
        library.addBook(newBook);
        System.out.println("Book added successfully! " + newBook);

    } else if (userInput == 2) {
        System.out.print("Enter the book you want to remove: ");
        int idx = Integer.parseInt(System.console().readLine());
        library.removeBook(idx);
    } else if (userInput == 3) {
        System.out.print("Enter the title you want to search: ");
        String titleFind = scanner.nextLine();
        List<Book> results = library.searchByTitle(titleFind);
        if (results.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book found : results) {
                System.out.println(found);
            }
        }
    } else if (userInput == 4) {
        System.out.print("Enter the author you want to search: ");
        String authorFind = scanner.nextLine();
        List<Book> results = library.searchByAuthor(authorFind);
        if (results.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book found : results) {
                System.out.println(found);
            }
        }
    } else if (userInput == 5) {
        System.out.print("Enter the genre you want to search: ");
        String genreFind = scanner.nextLine();
        List<Book> results = library.searchByGenre(genreFind);
        if (results.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book found : results) {
                System.out.println(found);
            }
        }
    } else if (userInput == 6) {
        System.out.println(library);
    } else if (userInput == 7) {
        System.out.println("Goodbye!");
        System.exit(0);
    } else {
        System.out.println("Invalid choice! Try again");
    }


## final idea
make a library management program that students can use to access different books stored
allow people to remove and add books
update book information?
user accounts possibly? find out a way to store information in instances then access it when program is closed? make it output and read from a separate file? would it require a database or a text file to write in and out from?

make users input a number to indicate what task they want to do

