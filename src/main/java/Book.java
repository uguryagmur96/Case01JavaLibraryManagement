import java.util.Date;

public abstract class Book {
    public	String ISBN;
    public	String header;
    public	String author;
    public String publishedYear;
   public EStatus status;

    public Book(String ISBN,String header,String author,String publishedYear,EStatus status) {
        super();
        this.ISBN=ISBN;
        this.header=header;
        this.author=author;
        this.publishedYear=publishedYear;
        this.status=status;
    }



    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }


}
