package progr1.day1.test;

public class Start {

    public static void main(String[] args) {

        Author ali     = new Author("Ali", "Eee");
        Book angular   = new Book("angular", ali, Cover.SOFT);
        Book jee       = new Book("java ee", ali, Cover.HARD);
        Book jee2      = new Book("java ee", ali, Cover.HARD);
        Book php       = new Book("php", ali, Cover.HARD);

        // dla klasy Book zdefiniować progr1.day1.equals, hashcode, toString (ze StringBuilder), powinna też być naturalnie sortowana po tytule
        ali.addBook(angular);
        ali.addBook(jee);
        ali.addBook(jee2);
        ali.addBook(php);

        // poniższa metoda powinna wypisać na ekran:
        // [Książka{tytuł='java ee', okładka: twarda}, Książka{tytuł='php', okładka: twarda}, Książka{tytuł='angular', okładka: miękka}]
        Helper.printBooks(ali);

        Desk desk = new Desk();
        desk.addBook(jee2);
        desk.addBook(angular);
        desk.addBook(jee);

        /*
            poniższa metoda powinna zwrócić String w postaci posortowanej listy z enterami:
            Książka{tytuł='angular', okładka: miękka}
            Książka{tytuł='java ee', okładka: twarda}
            Książka{tytuł='java ee', okładka: twarda}
         */
        System.out.println(desk.getBooks());

        // Powinno wyrzucić wyjątek ponieważ php nie dodaliśmy do obiektu desk
        try {
            desk.removeBook(php);
        } catch (BookNotExistOnTheDesk bookNotExistOnTheDesk) {
            bookNotExistOnTheDesk.printStackTrace();
        }
    }
}
