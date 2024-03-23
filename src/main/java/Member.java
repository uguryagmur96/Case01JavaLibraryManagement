import java.util.ArrayList;
import java.util.List;

public class Member implements IMember {
    String ID;
    String nameSurname;
    String gender;
    List<Book> borrowedBooks;
    List<Book> givedBooks;
    public Member(String ID,String nameSurname,String gender){
    this.ID=ID;
    this.nameSurname=nameSurname;
    this.gender=gender;
    this.borrowedBooks=new ArrayList<>();
    this.givedBooks=new ArrayList<>();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public void borrowTheBook(Book book) {
        borrowedBooks.add(book);
    }

    @Override
    public void giveBackTheBook(Book book) {
        givedBooks.add(book);
    }
    public void showBorrowedBooks(){
        for (Book book: borrowedBooks) {
            System.out.println(book.getISBN()+"\n"+book.getHeader()+"\n"+book.getAuthor()+"\n"+book.getPublishedYear()+"\n");
        }
    }
    public void showGiveBackBooks() {
        for (Book book : givedBooks) {
            System.out.println(book.getISBN() + "\n" + book.getHeader() + "\n" + book.getAuthor() + "\n" + book.getPublishedYear() + "\n");
        }
    }
}
