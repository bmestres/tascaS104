import java.util.Objects;

public class Book implements Comparable<Book>{

    private String title;

    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    @Override
    public int compareTo(Book o) {

        if(o == null){
            throw new NullPointerException(Message.E_NULL_COMPARE);
        }
        int compare = this.title.compare(o.title, this.title);

        if(compare == 0)
        return 0;
    }
}
