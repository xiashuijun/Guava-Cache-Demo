package info.sanaulla.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msanaulla on 12/23/2014.
 */
public class Book {
    private String isbn13;
    private List<Author> authors;
    private String publisher;

    private String title;
    private String summary;

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void addAuthor(Author author){
        if ( authors == null ){
            authors = new ArrayList<Author>();
        }
        authors.add(author);
    }
}