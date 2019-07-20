package pl.sda.mvc.Model.Components;

public enum  Nourishment {
    HUNGRY("hungry"),
    FULL("full");

    private String title;

    Nourishment(String title) {
        this.title = title;
    }
}
