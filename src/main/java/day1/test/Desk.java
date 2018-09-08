package day1.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desk {
    private List<Book> list = new ArrayList<>();

    public void addBook(Book book) {
        list.add(book);
    }

    public String getBooks() {
        String res = "";
        Collections.sort(list);
        for (Book b : list) {
            res = res + b +"\n";
        }
        return res;
    }






    public void removeBook(Book book) throws BookNotExistOnTheDesk {
        if(list.contains(book)) {
            list.remove(book);
        } else {
            throw new BookNotExistOnTheDesk();
        }
    }
}
