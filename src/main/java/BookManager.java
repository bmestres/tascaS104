import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public BookManager(){
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book){
        if(existsDuplicate(book)){
            throw new IllegalArgumentException(Message.E_DUPLICATE);
        }
            this.books.add(book);

    }

    public ArrayList<Book> getBooks(){
        return new ArrayList<Book>(this.books);
    }

    public String getTitleByPosition(int pos){
        return this.books.get(pos).getTitle();
    }

    public void addBookInPosition(int pos, Book book){
        if(existsDuplicate(book)){
            throw new IllegalArgumentException(Message.E_DUPLICATE);
        }
        this.books.add(pos, book);
    }

    public void removeBookByTitle(String title){
        for(int i = 0; i < this.books.size(); i++){
            if(this.books.get(i).getTitle().equalsIgnoreCase(title)){
                this.books.remove(i);
                return;
            }
        }
    }

    public ArrayList<Book> getBooksInOrder(){
        ArrayList<Book>sorted = sortBooks(this.books);
        return sorted;
    }

    private ArrayList<Book> sortBooks(List<Book>unsorted){
    ArrayList<Book>sorted = new ArrayList<Book>(unsorted);
    int i, j;

    for(i = 1; i < sorted.size(); i++){
        Book tmpBook = sorted.get(i);
        j = i - 1;

        while(j >= 0 && sorted.get(j).getTitle().compareToIgnoreCase(tmpBook.getTitle()) > 0){
            sorted.set(j + 1, sorted.get(j));
            j--;
        }
        sorted.set(j + 1, tmpBook);
    }
        return sorted;
    }

    private boolean existsDuplicate(Book book){
        boolean duplicate = false;
        int i = 0;

        while(!duplicate && i < this.books.size()){
            if(this.books.get(i).getTitle().equalsIgnoreCase(book.getTitle())){
                duplicate = true;
            }
            i++;
        }
        return duplicate;
    }
}
