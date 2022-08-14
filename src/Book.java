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

}


