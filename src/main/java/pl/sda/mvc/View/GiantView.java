package pl.sda.mvc.View;

import pl.sda.mvc.Model.GiantModel;

public class GiantView {
    public GiantView(){
        //TODO
    }

    public void displayGiant(GiantModel giantModel){
        System.out.println("HEALTH: " + giantModel.getHealth());
        System.out.println("FATIGUE: " + giantModel.getFatigue());
        System.out.println("NOURISHMENT: " + giantModel.getNourishment());
    }
}
