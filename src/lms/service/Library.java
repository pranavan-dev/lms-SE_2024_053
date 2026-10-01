package lms.service;

import lms.model.LibraryItem;
import lms.model.Member;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<LibraryItem> items = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    public void addItem(LibraryItem item){
        items.add(item);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public void listItems(){
        System.out.println("\n------ Library Items ------\n");
        for (LibraryItem item : items){
            System.out.println(item.toString());
        }
        System.out.println("\n");
    }

    public void listMembers(){
        System.out.println("\n------ Library Members ------\n");
        for (Member member : members){
            System.out.println(member.toString());
        }
        System.out.println("\n");
    }

    public void printAllLateFees(int daysLate){
        for (LibraryItem item : items){
            System.out.println(item.getTitle()+ ": "+item.calculateLateFee(daysLate));
        }
    }

    // TODO: addItem(LibraryItem item)
    // TODO: addMember(Member member)
    // TODO: listItems()   - print a heading, then each item on its own line
    // TODO: listMembers() - same for members
    // TODO: printAllLateFees(int daysLate)
    //       for each item print:  title + ": " + item.calculateLateFee(daysLate)
}
