package com.library.management;

import java.util.Scanner;

public class LibraryMenu {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Find Book by Title");
            System.out.println("4. Find Book by Author");
            System.out.println("5. List All Books");
            System.out.println("6. List Available Books");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Add book logic
                    System.out.println("Enter book details...!");
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Publication Year: ");
                    int publicationYear = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Availability (true/false): ");
                    boolean availability = scanner.nextBoolean();
                    scanner.nextLine();  // Consume newline
                    
                    Book newBook = new Book(title, author, isbn, genre, publicationYear, department, availability);
                    library.addBook(newBook);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    // Remove book logic
                    System.out.print("Enter ISBN of the book to remove: ");
                    String isbnToRemove = scanner.nextLine();
                    library.removeBook(isbnToRemove);
                    System.out.println("Book removed successfully.");
                    break;

                case 3:
                    // Find book by title logic
                    System.out.print("Enter title to search: ");
                    String titleToFind = scanner.nextLine();
                    System.out.println("Books found:");
                    library.findBookByTitle(titleToFind).forEach(System.out::println);
                    break;

                case 4:
                    // Find book by author logic
                    System.out.print("Enter author to search: ");
                    String authorToFind = scanner.nextLine();
                    System.out.println("Books found:");
                    library.findBookByAuthor(authorToFind).forEach(System.out::println);
                    break;

                case 5:
                    // List all books logic
                    System.out.println("All books in the library:");
                    library.listAllBooks().forEach(System.out::println);
                    break;

                case 6:
                    // List available books logic
                    System.out.println("Available books in the library:");
                    library.listAvailableBooks().forEach(System.out::println);
                    break;

                case 7:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
