package edu.misena.senaviewer.model;

public class Film {
    public int id;
    public String title;
    public String gender;
    public String creator;
    public int duration;
    public int year;
    public boolean viewed;

    public Film(int id, String title, String gender, String creator, int duration, int year, boolean viewed) {
        this.title = title;
        this.gender = gender;
        this.creator = creator;
        this.duration = duration;
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
