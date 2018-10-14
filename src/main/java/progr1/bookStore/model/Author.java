package progr1.bookStore.model;

import java.util.Objects;
import java.util.UUID;

public class Author implements Comparable<Author> {
    private String lastName;
    private String firstName;
    private UUID id;

    public Author(String lastName, String firstName, UUID id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Author o) {
        return this.lastName.compareTo(o.lastName);
    }
}
