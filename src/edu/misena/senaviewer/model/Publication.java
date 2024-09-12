package edu.misena.senaviewer.model;

public class Publication {
    public String title;
    public String edititionDate;
    public String editorial;
    public String authors;

    public Publication(String title,String edititionDate,String editorial ) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
    }

    //getters
    public String getTitle() {return title;}
    public String getEdititionDate() {return edititionDate;}
    public String getEditorial() {return editorial;}
    public String getAuthors() {return authors;}

    //setters
    public void setTitle(String title) {this.title = title;}
    public void setEdititionDate(String edititionDate) {this.edititionDate = edititionDate;}
    public void setEditorial(String editorial) {this.editorial = editorial;}
    public void setAuthors(String authors) {this.authors = authors;}
}
