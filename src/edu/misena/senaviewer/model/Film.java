package edu.misena.senaviewer.model;

public class Film {
    private int id;
    private String title;
    private String gender;
    private String creator;
    private int duration;
    private int year;
    private boolean viewed;

    public Film(int id, String title, String gender, String creator, int duration, int year, boolean viewed) {
        this.id = id;
        this.title = title;
        this.gender = gender;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
        this.viewed = viewed;
    }
    
    //getters
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getGender() {
        return gender;
    }
    public String getCreator() {
        return creator;
    }
    public int getDuration() {
        return duration;
    }
    public int getYear() {
        return year;
    }
    public boolean getViewed() {
        return viewed;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }
}
