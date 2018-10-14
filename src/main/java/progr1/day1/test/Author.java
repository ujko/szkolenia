package progr1.day1.test;

import java.util.HashSet;
import java.util.Set;

public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books = new HashSet<>();

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void addBook(Book angular) {
        books.add(angular);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }
}
