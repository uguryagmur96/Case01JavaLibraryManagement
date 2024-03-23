import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    String address;
    List<Book> books;
    List<Member> members;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showTheAvailableBooks() {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).status.equals(EStatus.AVAILABLE))
                System.out.println("ISBN: "+books.get(i).getISBN()+"\nHeader: "+books.get(i).getHeader()+
                        "\nAuthor: "+books.get(i).getAuthor()+"\nPublished Year: "+books.get(i).getPublishedYear()+"\n");
        }
    }
    public void showTheUnavailableBooks(){
        for(int i=0; i<books.size(); i++){
            if (books.get(i).status.equals(EStatus.UNAVAILABLE)||books.get(i).status.equals(EStatus.OUTOFSTOCK))
                System.out.println("ISBN: "+books.get(i).getISBN()+"\nHeader: "+books.get(i).getHeader()+
                        "\nAuthor: "+books.get(i).getAuthor()+"\nPublished Year: "+books.get(i).getPublishedYear()+"\n");
        }
    }
    public void changeBookStatus(String ISBN, EStatus status){
        for (int i=0; i<books.size(); i++){
            if (books.get(i).getISBN().equals(ISBN))
                books.get(i).setStatus(status);
        }
    }
    public void borrowBook(String ISBN, Member member){
        for (int i=0; i<books.size(); i++){
            if (books.get(i).getISBN().equals(ISBN))
               for (int j=0; j<members.size(); j++){
                   if (members.get(j).getID().equals(member.getID())){
                       books.get(i).setStatus(EStatus.UNAVAILABLE);
                       member.borrowTheBook(books.get(i));
                   System.out.println("Done!");}
                   }
               }
        }
        public void giveBackTheBook(String ISBN, Member member){
            for (int i=0; i<books.size(); i++){
                if (books.get(i).getISBN().equals(ISBN)&&member.borrowedBooks.get(i).getISBN().equals(ISBN))
                    for (int j=0; j<members.size(); j++){
                        if (members.get(j).getID().equals(member.getID())){
                            books.get(i).setStatus(EStatus.AVAILABLE);
                            member.giveBackTheBook(books.get(i));
                            member.borrowedBooks.remove(books.get(i));
                            System.out.println("Done!");}
                    }
            }
        }

    }

