package edu.misena.senaviewer.model;

public class Serie {
    private int id;
    private String title;
    private String gender;
    private String creator;
    private String duration;
    private int year;
    private boolean viewed;
    private int timeViewed;
    private int sessionQuantity;

    public Serie(
            String title,
            String gender,
            String duration
    ){
        this.title=title;
        this.gender=gender;
        this.duration=duration;
        this.viewed = true;
    }

    //getters//
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

    public String getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public boolean getViewed() {
        return viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
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

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }
}
