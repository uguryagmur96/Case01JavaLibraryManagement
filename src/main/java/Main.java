public class Main {
    public static void main(String[] args) {
        Library lib1=new Library("Merkez Kütüphane","Karşıayaka Kütüphane Salonu/İzmir");
        Book bookFiction1=new BookFiction("123456","1984","George Orwell","2007",EStatus.AVAILABLE);
        Book bookFiction2=new BookFiction("456789","Game Of Thrones","George R. R. Martin","1996",EStatus.AVAILABLE);
        Book bookFiction3=new BookFiction("147852","Yüzüklerin Efendisi","J. R. R. Tolkien","1954",EStatus.AVAILABLE);
        Book bookScience1=new BookScience("159357","Kozmos","Carl Sagan ","1980",EStatus.AVAILABLE);
        Book bookScience2=new BookScience("852147","Türlerin Kökeni","Charles Darwin","1859",EStatus.AVAILABLE);
        Book bookScience3=new BookScience("369852","Beyin","David Eagleman","2015",EStatus.AVAILABLE);
        Book bookHistory1=new BookHistory("268753","Bunu Herkes Bilir","Emrah Safa Gürkan","2020",EStatus.AVAILABLE);
        Book bookHistory2=new BookHistory("357852","Sultanın Casusları","Emrah Safa Gürkan","2017",EStatus.AVAILABLE);
        Book bookHistory3=new BookHistory("153286","Sultanın Korsanları","Emrah Safa Gürkan","2018",EStatus.AVAILABLE);
        Member member1=new Member("mem1","Çağla Varol","Kadın");
        Member member2=new Member("mem2","Veli Güneş","Erkek");
        Member member3=new Member("mem3","Umay Kızıl","Kadın");

        lib1.books.add(bookScience1);
        lib1.books.add(bookScience2);
        lib1.books.add(bookScience3);
        lib1.books.add(bookHistory1);
        lib1.books.add(bookHistory2);
        lib1.books.add(bookHistory3);
        lib1.books.add(bookFiction1);
        lib1.books.add(bookFiction2);
        lib1.books.add(bookFiction3);

        lib1.members.add(member1);
        lib1.members.add(member2);
        lib1.members.add(member3);
        lib1.showTheAvailableBooks();

        lib1.borrowBook("153286",member1);
        lib1.giveBackTheBook("153286",member1);

    }
}
