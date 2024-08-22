package edu.misena.senaviewer.model;

public class Magazine {
    private int id;
    private String title;
    private String editionDate;
    private String editorial;
    private String authors;

    public Magazine(
            String title,
            String editionDate,
            String editorial
    ){
        this.title=title;
        this.editionDate=editionDate;
        this.editorial=editorial;
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

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEditionDate(String editionDate) {this.editionDate = editionDate;}

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
}
