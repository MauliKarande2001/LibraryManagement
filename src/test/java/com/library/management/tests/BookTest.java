package com.library.management.tests;
import com.library.management.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    
    @Test
    public void testGettersAndSetters() {
        // Create a book object
        Book book = new Book("Test", "Test Author", "ISBN Number", "Genre", 2024, "Test Department", true);

        // Test getters
        assertEquals("Test", book.getTitle());
        assertEquals("Test Author", book.getAuthor());
        assertEquals("ISBN Number", book.getISBN());
        assertEquals("Genre", book.getGenre());
        assertEquals(2024, book.getPublicationYear());
        assertEquals("Test Department", book.getDepartment());
        assertTrue(book.isAvailability());

        // Test setters
        book.setTitle("New Title");
        book.setAuthor("New Author");
        book.setISBN("New ISBN");
        book.setGenre("New Genre");
        book.setPublicationYear(2024);
        book.setDepartment("New Department");
        book.setAvailability(false);

        // Verify changes using getters
        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
        assertEquals("New ISBN", book.getISBN());
        assertEquals("New Genre", book.getGenre());
        assertEquals(2024, book.getPublicationYear());
        assertEquals("New Department", book.getDepartment());
        assertFalse(book.isAvailability());
    }

}
