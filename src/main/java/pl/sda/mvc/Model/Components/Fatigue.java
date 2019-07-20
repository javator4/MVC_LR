package pl.sda.mvc.Model.Components;

public enum  Fatigue {
    TIRED("tired"),
    FRESH("fresh"),
    SLEEPING("sleeping");

    private String title;

    Fatigue(String title){
        this.title = title;
    }
}
