package com.library.management.tests;
import com.library.management.Book;
import com.library.management.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class LibraryTest {
    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "123", "Genre", 2023, "Department", true);
        Book book1 = new Book("Testing Title", "Author test", "1234", "Genrel", 2024, "dept", true);
        library.addBook(book);
        library.addBook(book1);

        assertEquals(2, library.listAllBooks().size());
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "123", "Genre", 2023, "Department", true);
        library.addBook(book);
        library.removeBook("123");

        assertEquals(0, library.listAllBooks().size());
    }

    @Test
    public void testFindBookByTitle() {
        Library library = new Library();
        Book book1 = new Book("Title", "Author", "123", "Genre", 2023, "Department", true);
        Book book2 = new Book("Different Title", "Author", "124", "Genre", 2023, "Department", true);
        library.addBook(book1);
        library.addBook(book2);

        List<Book> foundBooks = library.findBookByTitle("Title");
        assertEquals(1, foundBooks.size());
    }

    @Test
    public void testFindBookByAuthor() {
        Library library = new Library();
        Book book1 = new Book("Title", "Author1", "123", "Genre", 2023, "Department", true);
        Book book2 = new Book("Different Title", "Author2", "124", "Genre", 2023, "Department", true);
        library.addBook(book1);
        library.addBook(book2);

        List<Book> foundBooks = library.findBookByAuthor("Author1");
        assertEquals(1, foundBooks.size());
    }

    @Test
    public void testListAvailableBooks() {
        Library library = new Library();
        Book book1 = new Book("Title", "Author", "123", "Genre", 2023, "Department", true);
        Book book2 = new Book("Different Title", "Author", "124", "Genre", 2023, "Department", false);
        library.addBook(book1);
        library.addBook(book2);

        List<Book> availableBooks = library.listAvailableBooks();
        assertEquals(1, availableBooks.size());
    }
}
