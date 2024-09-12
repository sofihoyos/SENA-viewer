package edu.misena.senaviewer.model;

public class Movie extends Film {
    private int timeViewed;

    public Movie(
            String title,
            String gender,
            String creator,
            int duration,
            int timeViewed
    ){
        super(title,gender,creator,duration);
        this.timeViewed = timeViewed;
    }
    //getters//
    public int getTimeViewed() {
        return timeViewed;
    }

    //setters
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Title='" + getTitle() + '\'' +
                ", Gender='" + getGender() + '\'' +
                ", Creator='" + getCreator() + '\'' +
                ", Duration=" + getDuration() + " minutes" +
                ", Time Viewed=" + timeViewed + " minutes" +
                '}';
    }

}
