package rgu.appdev.bookapp_assessment.Model;

public class bookModel {
    private int id, status; //DB information
    private String bookName;    //String info about book
    private String bookAuthor;  //""
    private int bookProgress;  //I'll try and do % but no promises

    //Getter & setter methods for books

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookProgress() {
        return bookProgress;
    }

    public void setBookProgress(int bookProgress) {
        this.bookProgress = bookProgress;
    }

}
