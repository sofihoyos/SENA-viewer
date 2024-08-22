package edu.misena.senaviewer.model;

public class Book {
    private int id;
    private String title;
    private String editionDate;
    private String editorial;
    private String authors;
    private String isbn;
    private Boolean readed;
    private int timeReaded;

    public Book(
            String title,
            String editionDate,
            String editorial,
            String isbn
    ){
        this.title=title;
        this.editionDate=editionDate;
        this.editorial=editorial;
        this.isbn=isbn;
        this.readed=true;
    }

    //getters//
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getEditionDate() {
        return editionDate;
    }

    public String getEditorial() {
        return editorial;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
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
}
