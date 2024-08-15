package edu.misena.senaviewer.model;

import java.util.Date;

public class Magazine {
    private int id;
    private String title;
    private Date editionDate;
    private String editorial;
    private String authors;

    public Magazine(
            String title,
            Date editionDate,
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

    public Date getEditionDate() {
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

    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
}
