package edu.misena.senaviewer.model;

public class Book extends Publication {
    public int id;
    public String authors;
    public String isbn;
    public Boolean readed;
    public int timeReaded;

    public Book(
            int id,
            String title,
            String editionDate,
            String editorial,
            String authors,
            String isbn,
            Boolean readed,
            int timeReaded
    ){
        super(title,editionDate,editorial);
        this.id=id;
        this.authors=authors;
        this.isbn=isbn;
        this.readed=true;
        this.timeReaded=timeReaded;
    }

    //getters//
    public int getId() {
        return id;
    }
    public String getAuthors() {
        return authors;
    }
    public String getIsbn() {
        return isbn;
    }
    public Boolean getReaded() {
        return readed;
    }
    public int getTimeReaded() {
        return timeReaded;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setAuthors(String authors) {
        this.authors = authors;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setReaded(boolean readed) {
        this.readed = readed;
    }
    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }


    @Override
    public String toString() {
        return "Book{" +
                "ID=" + id +
                ", Title='" + getTitle() + '\'' +
                ", Edition Date='" + getEdititionDate() + '\'' +
                ", Editorial='" + getEditorial() + '\'' +
                ", Authors='" + authors + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Readed=" + (readed ? "Yes" : "No") +
                ", Time Readed=" + timeReaded + " minutes" +
                '}';
    }
}
