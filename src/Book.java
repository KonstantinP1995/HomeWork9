import java.util.Objects;

public class Book {
    String name;
    Author Author;
    int yearOfPublishing;

    public Book(String name, Author Author, int yearOfPublishing) {
        this.name = name;
        this.Author = Author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getName() {
        return name;
    }
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String toString() {
        return "Book " + name + " " + Author.toString() + " Year of publising " + yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfPublishing);
    }
}


