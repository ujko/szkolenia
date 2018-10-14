package progr1.day1.test;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private Author author;
    private Cover cover;

    public Book(String title, Author author, Cover cover) {
        this.title = title;
        this.author = author;
        this.cover = cover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Książka{" +
                "tytuł='" + title + "', okładka: " + cover.getCover() +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Cover getCover() {
        return cover;
    }
}
