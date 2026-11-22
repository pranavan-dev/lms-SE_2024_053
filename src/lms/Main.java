
package lms;

import lms.exception.ItemNotAvailableException;
import lms.exception.MemberNotFoundException;
import lms.service.Library;
import lms.model.*;

public class Main {

    public static void main(String[] args) throws ItemNotAvailableException {



//        // ------ Week 04 ------
//        Library library = new Library();
//        Book book = new Book("B001","Clean Code", "Robert Martin");
//        DVD dvd = new DVD("D001","Introduction to Algorithms", 30);
//        Magazine magazine = new Magazine("M001","Software Weekly",02);

//        Member student = new Student("Stu001","Nadeesha Perera");
//        Member staff = new Staff("Sta001","Mr. Kasun Silva");

//        library.addItem(book);
//        library.addItem(dvd);
//        library.addItem(magazine);

//        library.addMember(student);
//        library.addMember(staff);
//        //Late fees
//        System.out.println("--- Late fees if 3 day(s) late ---");
//        System.out.println(
//                book.getTitle() + " : "+book.calculateLateFee(3)
//        );
//        System.out.println(
//                dvd.getTitle() +" : " + dvd.calculateLateFee(3)
//        );
//        System.out.println(
//                magazine.getTitle()+ " : "+magazine.calculateLateFee(3)
//        );
//
//        //Loans
//        System.out.println("--- Loans ---");
//        library.lend(book,student);
//        library.lend(book,staff);
//
//        library.lend(dvd,staff);
//        library.lend(magazine,staff);
//
//        System.out.println("-- Reservations --");
//        library.reserveIfPossible(magazine,staff);
//        library.reserveIfPossible(dvd,staff);
//
//        System.out.println("--- Members ranked by activity ---");
//        library.printMembersByActivity();
//
//        //Experiment 01
//        //LibraryItem item = new LibraryItem("X","Y");

        //---- week 05 ----
        Library library = new Library();

        library.addItem(new Book("B001", "Clean Code", "Robert C. Martin"));
        library.addItem(new DVD("D001", "Introduction to Algorithms", 120));
        library.addItem(new Magazine("G001", "Software Weekly", 42));
        library.addMember(new Student("M001", "Nadeesha Perera"));
        library.addMember(new Staff("M002", "Mr. Kasun Silva"));




    }
}
