package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book itBook = new Book("Clean code", 910);
        Book novel = new Book("The Master and Margarita", 420);
        Book poem = new Book("Romeo and Juliet", 340);
        Book drama = new Book("Anna Karenina", 550);
        Book[] books = new Book[4];
        books[0] = itBook;
        books[1] = novel;
        books[2] = poem;
        books[3] = drama;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPage());
        }
        System.out.println("");
        System.out.println("Переставлены местами книги с индексом 0 и 3");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (Book b : books) {
            System.out.println(b.getName() + " - " + b.getPage());
        }
        System.out.println("");
        System.out.println("Вывод книг с именем \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " - " + books[i].getPage());
            }
        }
    }
}
