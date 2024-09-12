package edu.misena.senaviewer.model;

public class Magazine extends Publication {
    public int id;

    public Magazine(
            int id,
            String title,
            String editionDate,
            String editorial
    ){
        super(title, editionDate, editorial);
        this.id=id;
    }

    //getters//
    public int getId() {
        return id;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Magazine:\n" +
                "ID: " + id + '\n' +
                "Title: " + getTitle() + '\n' +
                "Edition Date: " + getEdititionDate() + '\n' +
                "Editorial: " + getEditorial();
    }
}
