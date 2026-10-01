package lms.model;

import java.util.Locale;

public class Member {

    private String memberId;
    private String name;
    private int borrowedCount;
    private int maxBorrowLimit;

    public Member(String memberId, String name, int maxBorrowLimit) {
        setMemberId(memberId);
        setName(name);
        this.borrowedCount = 0;
        this.maxBorrowLimit = 0;
        // TODO: setMemberId(...), setName(...) via the setters
        // TODO: store maxBorrowLimit; borrowedCount starts at 0
    }

    public void setMemberId(String memberId){
        if(memberId == null || memberId.trim().isBlank()){
            throw new IllegalArgumentException("Member Id cannot be blank");
        }
        this.memberId = memberId;
    }

    public void setName(String name){
        if(name == null || name.trim().isBlank()){
            throw new IllegalArgumentException("Name cannot be blank");
        }
        this.name = name;
    }

    // TODO: getters for all four fields
    public String getMemberId(){return this.memberId;}
    public String getName(){return this.name;}
    public int getborrowedCount(){return this.borrowedCount;}
    public int getMaxBorrowLimit(){return this.maxBorrowLimit;}

    // TODO: setMemberId, setName - reject null/blank
    public void setBorrowedCount(int borrowedCount){
        if(this.borrowedCount < 0){
            throw new IllegalArgumentException("Borrowed count cannot be negative");
        }
        this.borrowedCount = borrowedCount;
    }

    public void incrementBorrowedCount(){
        int tempBorrowedCount = this.borrowedCount;
        tempBorrowedCount+=1;
        setBorrowedCount(tempBorrowedCount);
    }

    @Override
    public String toString() {
        return "Book{Member Id='"+this.memberId+"', name='"+this.name+"', Borrowed Count ="+this.borrowedCount+"}";

    }

    // TODO: setBorrowedCount(int) - reject negative numbers  ---
    // TODO: incrementBorrowedCount() - add 1 (reuse setBorrowedCount)
    // TODO: toString()
}
