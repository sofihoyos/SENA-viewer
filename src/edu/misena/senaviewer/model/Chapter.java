package edu.misena.senaviewer.model;

public class Chapter {
    private int id;
    private String title;
    private int duration;
    private int year;
    private boolean viewed;
    private int timeViewed;
    private int sessionNumber;

    public Chapter(
            String title,
            int duration,
            int year
    ){
        this.title=title;
        this.duration=duration;
        this.year=year;
    }

    //getters//
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
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

    public int getTimeViewed() {
        return timeViewed;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
}
