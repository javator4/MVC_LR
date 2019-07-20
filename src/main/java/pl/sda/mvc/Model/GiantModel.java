package pl.sda.mvc.Model;

import pl.sda.mvc.Model.Components.*;

public class GiantModel {
    private Health      health;
    private Fatigue     fatigue;
    private Nourishment nourishment;

    public GiantModel(Health health, Fatigue fatigue, Nourishment nourishment){
        this.health = health;
        this.fatigue = fatigue;
        this.nourishment = nourishment;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public Nourishment getNourishment() {
        return nourishment;
    }

    public void setNourishment(Nourishment nourishment) {
        this.nourishment = nourishment;
    }

    @Override
    public String toString() {
        return "GiantModel{" +
                "health=" + health +
                ", fatigue=" + fatigue +
                ", nourishment=" + nourishment +
                '}';
    }
}
