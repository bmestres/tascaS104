package nivell01.exercici01;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BookManagerTest {

    private static final int NUM_EXPECTED_ELEMS = 2;

    @Test
    void collectionNotNullAfterInstantiation(){
        BookManager manager = new BookManager();
        assertNotNull(manager.getBooks());
    }
    @Test
    void sizeIsCorrectAfterAddingElems(){
        BookManager manager = new BookManager();
        Book book01 = new Book("The cell");
        Book book02 = new Book("Collapse");

        manager.addBook(book01);
        manager.addBook(book02);

        assertEquals(NUM_EXPECTED_ELEMS,manager.getBooks().size());
    }
    @Test
    void elemsInRightPos(){
        BookManager manager = new BookManager();
        Book book01 = new Book("The cell");
        Book book02 = new Book("Collapse");

        manager.addBookInPosition(0, book01);
        manager.addBookInPosition(1, book02);

        assertEquals(book01, manager.getBooks().get(0));
        assertEquals(book02, manager.getBooks().get(1));
    }

    @Test
    void bookByPositionReturnsCorrect(){
        BookManager manager = new BookManager();

        Book book01 = new Book("The cell");
        Book book02 = new Book("Collapse");

        manager.addBookInPosition(0, book01);
        manager.addBookInPosition(1, book02);

        assertEquals(book01.getTitle(), manager.getTitleByPosition(0));
        assertEquals(book02.getTitle(), manager.getTitleByPosition(1));
    }
    @Test
    void addingElemInCertainPositionModifies(){
        BookManager manager = new BookManager();

        Book book01 = new Book("The cell");
        Book book02 = new Book("Collapse");
        Book book03 = new Book("What we can know");

        manager.addBook(book01);
        manager.addBook(book02);
        assertTrue(manager.getBooks().size() == 2);

        manager.addBookInPosition(1, book03);
        assertEquals(book01, manager.getBooks().get(0));
        assertEquals(book03, manager.getBooks().get(1));
        assertEquals(book02, manager.getBooks().get(2));
        assertTrue(manager.getBooks().size() == 3);
    }
    @Test
    void removeBookByTitleReducesSize(){

        BookManager manager = new BookManager();

        Book book01 = new Book("The cell");
        Book book02 = new Book("Collapse");

        manager.addBook(book01);
        manager.addBook(book02);

        assertTrue(manager.getBooks().size() == 2);

        manager.removeBookByTitle("Collapse");
        assertTrue(manager.getBooks().size() == 1);
    }

    @Test
    void booksInCorrectOrder(){
        BookManager manager = new BookManager();

        Book book01 = new Book("The cell");
        Book book02 = new Book("Collapse");
        Book book03 = new Book("What we can know");
        Book book04 = new Book("Land");
        Book book05 = new Book("Eights");

        manager.addBook(book01);
        manager.addBook(book02);
        manager.addBook(book03);
        manager.addBook(book04);
        manager.addBook(book05);

        ArrayList<Book> inputOrder = manager.getBooks();
        ArrayList<Book> alphaNumericOrder = manager.getBooksInOrder();

        assertEquals(book01, inputOrder.get(0));
        assertEquals(book02, inputOrder.get(1));
        assertEquals(book03, inputOrder.get(2));
        assertEquals(book04, inputOrder.get(3));
        assertEquals(book05, inputOrder.get(4));

        assertEquals(book02, alphaNumericOrder.get(0));
        assertEquals(book05, alphaNumericOrder.get(1));
        assertEquals(book04, alphaNumericOrder.get(2));
        assertEquals(book01, alphaNumericOrder.get(3));
        assertEquals(book03, alphaNumericOrder.get(4));
    }
    @Test
    void noDuplicatesAllowed(){
        BookManager manager = new BookManager();
        Book book01 = new Book("The cell");
        Book book02 = new Book("The cell");

        manager.addBook(book01);

        assertThrows(IllegalArgumentException.class, () -> {manager.addBook(book02);});
        assertThrows(IllegalArgumentException.class, () -> {manager.addBookInPosition(1, book02);});
    }
}
