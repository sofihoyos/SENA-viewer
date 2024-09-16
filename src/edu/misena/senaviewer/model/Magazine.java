package edu.misena.senaviewer.model;

public class Magazine extends Publication {
    public int id;
    public String authors;

    public Magazine(
            int id,
            String title,
            String editionDate,
            String editorial,
            String authors
    ){
        super(title, editionDate, editorial);
        this.id=id;
        this.authors=authors;
    }

    //getters//
    public int getId() {
        return id;
    }
    public String getAuthors() {
        return authors;
    }
    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Magazine:\n" +
                "ID: " + id + '\n' +
                "Title: " + getTitle() + '\n' +
                "Edition Date: " + getEdititionDate() + '\n' +
                "Editorial: " + getEditorial()+'\n' +
                "Autores: " + getAuthors();
    }
}
