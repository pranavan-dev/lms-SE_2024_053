
package lms;

import lms.model.*;
import lms.service.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();


//        Book book1 = new Book("B001", "Clean Code", "Robert C. Martin");
//        Book book2 = new Book("B002", "Effective Java", "Joshua Bloch");
//
//        DVD dvd1 = new DVD("D001", "Introduction to Algorithms", 120);
//
//        library.addItem(book1);
//        library.addItem(book2);
//        library.addItem(dvd1);
//
//        Student student = new Student("M001", "Pranavan");
//
//        Staff staff = new Staff("M002", "Kasun Silva");
//
//        library.addMember(student);
//        library.addMember(staff);
//
//        library.listItems();
//
//        library.listMembers();
//
//        library.printAllLateFees(3);
//
//        try {
//            Book invalidBook = new Book("B003", "", "Unknown");
//
//        } catch (IllegalArgumentException e) {
//            System.out.println("Rejected invalid book: " + e.getMessage());
//        }


        // ------ Week 04 ------
        Book book = new Book("B001","Clean Code", "Robert Martin");
        DVD dvd = new DVD("D001","Introduction to Algorithms", 30);
        Magazine magazine = new Magazine("M001","Software Weekly",02);

        Member student = new Student("Stu001","Nadeesha Perera");
        Member staff = new Staff("Sta001","Mr. Kasun Silva");

        library.addItem(book);
        library.addItem(dvd);
        library.addItem(magazine);

        library.addMember(student);
        library.addMember(staff);

        //Late fees
        System.out.println("--- Late fees if 3 day(s) late ---");
        System.out.println(
                book.getTitle() + " : "+book.calculateLateFee(3)
        );
        System.out.println(
                dvd.getTitle() +" : " + dvd.calculateLateFee(3)
        );
        System.out.println(
                magazine.getTitle()+ " : "+magazine.calculateLateFee(3)
        );

        //Loans
        System.out.println("--- Loans ---");
        library.lend(book,student);
        library.lend(book,staff);

        library.lend(dvd,staff);
        library.lend(magazine,staff);

        System.out.println("-- Reservations --");
        library.reserveIfPossible(magazine,staff);
        library.reserveIfPossible(dvd,staff);

        System.out.println("--- Members ranked by activity ---");
        library.printMembersByActivity();


    }
}
