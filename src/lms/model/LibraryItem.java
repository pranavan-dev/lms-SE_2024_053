package lms.model;
public abstract class LibraryItem { 
    private String id; 
    private String title; 
    private boolean isBorrowed; 
  
    public LibraryItem(String id, String title) { 
        this.setId(id);
        this. setTitle(title);
        this.isBorrowed = false;
    } 
  
    // TODO: getters - getId(), getTitle(), isBorrowed() 
    public String getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public void isBorrowed(){
        if(!this.isBorrowed){
            throw new IllegalArgumentException("Book already borrowed");
        }
        this.isBorrowed = true;
    }


    public void setId(String id) {
        if (id == null || id.trim().isBlank()){
            throw new IllegalArgumentException("Id cannot be blank");
        }
        this.id = id;
        // TODO: if id is null or blank, throw 
        //       new IllegalArgumentException("Id cannot be blank") 
        // TODO: otherwise assign it 
    }

    // TODO: setTitle(String title) - same pattern, message "Title cannot be blank"
    public void setTitle(String title){
        if(title == null || title.trim().isBlank()){
            throw new IllegalArgumentException("Title cannot be blank");
        }
        this.title = title;
    }
  

  
    public void borrowItem() { /* TODO */ } 
    public void returnItem() { /* TODO */ } 
  
    public double calculateLateFee(int daysLate) {return daysLate * 10.0; }
  
//    @Override
//    public String toString() {
//        // TODO: return readable text about this item, e.g.
//        //       Book{id='B001', title='Clean Code', borrowed=false}
//    }
}