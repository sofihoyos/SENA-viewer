package edu.misena.senaviewer.model;

public class Serie extends Film {
    private int timeViewed;
    private int sessionQuantity;

    public Serie(
            String title,
            String gender,
            String creator,
            int duration,
            int timeViewed,
            int sessionQuantity
    ){
        super(title,gender,creator,duration);
        this.timeViewed = timeViewed;
        this.sessionQuantity = sessionQuantity;
    }

    //getters//
    public int getTimeViewed() {
        return timeViewed;
    }
    public int getSessionQuantity() {
        return sessionQuantity;
    }

    //setters
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }
    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    @Override
    public String toString() {
        return "Serie \n" +
                "Title: " + getTitle() + '\n' +
                "Gender: " + getGender() + '\n' +
                "Creator: " + getCreator() + '\n' +
                "Duration: " + getDuration() + " minutes\n" +
                "Time Viewed: " + timeViewed + " minutes\n" +
                "Session Quantity: " + sessionQuantity;
    }
}
