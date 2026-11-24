
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

        System.out.println("--- 1. Happy path ---");
        attempt(library, "B001", "M001");

        System.out.println("--- 2. Already on loan (checked exception) ---");
        attempt(library, "B001", "M002");

        System.out.println("--- 3. Unknown member (unchecked exception) ---");
        attempt(library, "D001", "M999");

        System.out.println("--- 4. Unknown item ---");
        attempt(library, "X404", "M001");

        System.out.println("--- 5. Returning something not on loan ---");
        try {
            library.returnItem("D001");
        } catch (ItemNotAvailableException e) {
            System.out.println("Cannot return: " + e.getMessage());
        }

        System.out.println("--- 6. Bad data (IllegalArgumentException) ---");
        try {
            new Book("B002", "   ", "Someone");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid book: " + e.getMessage());
        }

        System.out.println("--- 7. Student limit of 3 ---");
        library.addItem(new Book("B003", "Refactoring", "Martin Fowler"));
        library.addItem(new Book("B004", "Head First Java", "Kathy Sierra"));
        library.addItem(new Book("B005", "Effective Java", "Joshua Bloch"));
        for (String id : new String[]{"D001", "G001", "B003", "B004"}) {
            attempt(library, id, "M001");
        }

        System.out.println("--- 8. Return frees a slot ---");
        try {
            library.returnItem("B001");
            attempt(library, "B004", "M001");
        } catch (ItemNotAvailableException e) {
            System.out.println("Unexpected: " + e.getMessage());
        }
    }

    private static void attempt(Library library, String itemId, String memberId) {
        try {
            library.borrowItem(itemId, memberId);
        } catch (ItemNotAvailableException e) {
            System.out.println("Cannot borrow: " + e.getMessage());
        } catch (MemberNotFoundException e) {
            System.out.println("Unknown member: " + e.getMemberId());
        } finally {
            System.out.println("   (attempt finished: item " + itemId + ", member " + memberId + ")");
        }


    }
}
