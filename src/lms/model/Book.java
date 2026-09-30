package lms.model;

public class Book extends LibraryItem {

    private String author;

    public Book(String id, String title, String author) {
        super(id,title);
        this.setAuthor(author);
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        if(author == null || author.trim().isEmpty()){
            System.out.println("Author cannot be blank");
            return;
        }
        this.author = author;
    }
    // TODO: getAuthor() 
    // TODO: setAuthor(String author) - reject null/blank with 
    //       IllegalArgumentException("Author cannot be blank")

}