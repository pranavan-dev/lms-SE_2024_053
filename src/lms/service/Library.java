
package lms.service;

import lms.exception.ItemNotAvailableException;
import lms.exception.MemberNotFoundException;
import lms.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private final List<LibraryItem> items = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Added via addItem(LibraryItem): " + item.getTitle());
    }

    public void addItem(Book book) {
        items.add(book);
        System.out.println("Added via addItem(Book): " + book.getTitle());
    }

    public void addItem(DVD dvd) {
        items.add(dvd);
        System.out.println("Added via addItem(DVD): " + dvd.getTitle());
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void listItems() {
        System.out.println("--- Items in the library ---");

        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }

    public void listMembers() {
        System.out.println("--- Registered members ---");

        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void printAllLateFees(int daysLate) {
        System.out.println("--- Late fees if " + daysLate + " day(s) late ---");

        for (LibraryItem item : items) {
            System.out.println(
                    item.getTitle() + ": "
                            + item.calculateLateFee(daysLate)
            );
        }
    }

    public void lend(Loanable thing,Member member) throws ItemNotAvailableException {
        thing.loan(member);
    }

    public void reserveIfPossible(LibraryItem item, Member member){
        if (item instanceof Reservable r){
            r.reserve(member);
        }else{
            System.out.println(item.getTitle()+" cannot be reserved");
        }
    }

    public void printMembersByActivity(){
        List<Member> sortedMembers = new ArrayList<>(members);
        Collections.sort(sortedMembers);

        for (Member member : sortedMembers){
            System.out.println(
                    member.getName()
                            + "( "+member.getBorrowedCount()
                            + " borrowed)");
        }
    }

    public Member findMember(String memberId) throws MemberNotFoundException{
        throw new MemberNotFoundException(memberId);
    }

    public LibraryItem findItem(String itemId) throws ItemNotAvailableException{

    }
}
