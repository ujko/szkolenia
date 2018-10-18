package hibernate.mySql;

import hibernate.mySql.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BookManager {
    protected SessionFactory sessionFactory;

    protected void setup() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    protected void exit() {
        sessionFactory.close();
    }

    protected void create(Book book) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();
    }

    protected Book read(long bookId) {
        Session session = sessionFactory.openSession();
        Book book = session.get(Book.class, bookId);
        session.close();
        return book;

    }

    protected void update(Book updatedBook) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(updatedBook);
        session.getTransaction().commit();
        session.close();
    }

    protected void delete(Book bookToDelete) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(bookToDelete);
        session.getTransaction().commit();
        session.close();
    }

    private Book createBook() {
        Book book = new Book();
        book.setAuthor("Joshuab Bloch");
        book.setTitle("Effectiveb Java");
        book.setPrice(4.33f);
        return book;
    }

    private Book createModifiedBook() {
        Book book = new Book();
        book.setId(6);
        book.setAuthor("Zmieniony autor");
        book.setTitle("Zmieniona książka");
        book.setPrice(2.33f);
        return book;
    }

    private void testReading() {
        Book book = read(1);
        System.out.println(book);
    }

    public static void main(String[] args) {
//        BookManager bookManager = new BookManager();
//        bookManager.setup();
//        bookManager.create(bookManager.createBook());
//        bookManager.testReading();
//        bookManager.update(bookManager.createModifiedBook());
//        bookManager.testReading();
//        Book book = bookManager.read(1);
//        bookManager.delete(book);
//        bookManager.exit();
    }
}
