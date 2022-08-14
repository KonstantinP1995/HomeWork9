public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Teodor", "Drayzer");
        Book firstBook = new Book("Financier", firstAuthor, 1912);

        System.out.println("firstAuthor.firstName = " + firstAuthor.firstName);
        System.out.println("firstAuthor.secondName = " + firstAuthor.secondName);
        System.out.println("firstBook.name = " + firstBook.name);
        System.out.println("firstBook.yearOfPublishing = " + firstBook.yearOfPublishing);

        System.out.print("\n");

        Author secondAuthor = new Author("john", "strelecky");
        Book secondBook = new Book("Cafe", secondAuthor, 2003);

        System.out.println("secondAuthor.firstName = " + secondAuthor.firstName);
        System.out.println("secondAuthor.secondName = " + secondAuthor.secondName);
        System.out.println("secondBook.name = " + secondBook.name);
        System.out.println("secondBook.yearOfPublishing = " + secondBook.yearOfPublishing);

        secondBook.setYearOfPublishing(2005);

        System.out.println("secondBook.yearOfPublishing = " + secondBook.yearOfPublishing);
        System.out.print("\n");

        System.out.println(firstBook.toString());
        System.out.print("\n");

        System.out.println(secondBook.toString());
        System.out.print("\n");
    }
}