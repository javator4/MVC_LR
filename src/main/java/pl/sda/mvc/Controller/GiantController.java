package pl.sda.mvc.Controller;
import pl.sda.mvc.Model.Components.*;
import pl.sda.mvc.Model.*;
import pl.sda.mvc.View.*;

import java.util.LinkedList;
import java.util.List;

public class GiantController {
    private List<GiantModel> giants;
    private GiantView view;

    public GiantController(List<GiantModel> giantModels, GiantView giantView) {
        this.giants = giantModels;
        this.view = giantView;
    }

    public Health getHealth(int giant){
        return this.giants.get(giant).getHealth();
    }

    public void setHealth(Health health, int giant){
        this.giants.get(giant).setHealth(health);
    }

    public Fatigue getFatigue(int giant){
        return this.giants.get(giant).getFatigue();
    }

    public void setFatigue(Fatigue fatigue, int giant){
        this.giants.get(giant).setFatigue(fatigue);
    }

    public Nourishment getNourishment(int giant){
        return this.giants.get(giant).getNourishment();
    }

    public void setNourishment(Nourishment nourishment, int giant){
        this.giants.get(giant).setNourishment(nourishment);
    }

    public void updateView(){
        for (GiantModel giant : giants) {
            view.displayGiant(giant);
        }
    }
}
