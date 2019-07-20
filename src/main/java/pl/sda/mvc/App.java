package pl.sda.mvc;

import pl.sda.mvc.Controller.GiantController;
import pl.sda.mvc.Model.Components.Fatigue;
import pl.sda.mvc.Model.Components.Health;
import pl.sda.mvc.Model.Components.Nourishment;
import pl.sda.mvc.builder.GiantBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        GiantController giantController = GiantBuilder.buildGiant();

        giantController.updateView();
        giantController.setFatigue(Fatigue.TIRED);
        giantController.updateView();
        giantController.getFatigue();
        giantController.setHealth(Health.DEAD);
        giantController.updateView();
    }
}
