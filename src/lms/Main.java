package lms;
import  lms.model.*;
import lms.service.Library;

public class Main {

    public static void main(String[] args) { 
//        Book b = new Book("B001", "Clean Code", "Robert C. Martin");
//        DVD d = new DVD("D001", "Intro to Algorithms", 120);
//
//        System.out.println(b.calculateLateFee(3));   // expect 30.0
//        System.out.println(d.calculateLateFee(3));   // expect 75.0
//
//        new Book("", "Nobody", "Nobody");           // expect IllegalArgumentException

        Library Library1 = new Library();
        Book book1 = new Book("B001","Harry Potter","J.K. Rowling");
        Book book2 = new Book("B002", "Clean Code", "Robert C. Martin");
        Library1.addItem(book1);
        Library1.addItem(book2);

        DVD dvd1 = new DVD("D001", "Intro to Algorithms", 120);
        DVD dvd2 = new DVD("D002","Pirates of the caribbean",180);
        Library1.addItem(dvd1);
        Library1.addItem(dvd2);

        Student student1 = new Student("Stu001","Pranavan");
        Student student2 = new Student("Stu002","Thayaparan");
        Library1.addMember(student1);
        Library1.addMember(student2);


        Staff staff1 = new Staff("Stf001","Nalin Warnajith");
        Staff staff2 = new Staff("Stf002","Thiroshan mathusanga");
        Library1.addMember(staff1);
        Library1.addMember(staff2);

        Library1.listItems();
        Library1.listMembers();
        Library1.printAllLateFees(3);


    }
}
