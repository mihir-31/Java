package com.company;
class Library{
    String []Books; // Created array
    int no_of_books;
    Library(){
        this.Books= new String[100]; 
        this.no_of_books = 0;
    }
    public void addBooks(String book){
        this.Books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added !!");
    }
    public void showAvailableBooks(){
        System.out.println("Available books are :");
        for (String book :this.Books) {
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    public void issueBooks(String book){
        for (int i = 0 ;i<this.Books.length;i++){
            if(this.Books[i].equals(book)){
                System.out.println(" The book has been issued!!");
                this.Books[i] = null;
                return;
            }
            System.out.println("The book is not available in Library");
        }
    }
    public void returnBook(String book){
        addBooks(book);
    }
}
public class Exercise4 {
    public static void main(String[] args) {
        // You have to implement a library using a java class Library
        // Methods : addBook(), issueBook(), returnBook(), showAvailableBooks
        // Properties: Array to store Available book,
        // Array to Store issue book
        Library CentralLibrary = new Library();
        CentralLibrary.addBooks("Rich Dad Poor Dad");
        CentralLibrary.addBooks("A suitable boy");
        CentralLibrary.addBooks("Java");
        CentralLibrary.showAvailableBooks();
        CentralLibrary.issueBooks("Java");
        CentralLibrary.showAvailableBooks();
        CentralLibrary.returnBook("Java");
        CentralLibrary.showAvailableBooks();
    }
}
