package pl.sda.mvc.builder;

import pl.sda.mvc.Controller.GiantController;
import pl.sda.mvc.Model.Components.*;
import pl.sda.mvc.Model.GiantModel;
import pl.sda.mvc.View.GiantView;

public class GiantBuilder {

    public static GiantController buildGiant(){
        return new GiantController(buildGiantModel(), buildGiantView());
    }

    public static GiantController buildGiant(Health health, Fatigue fatigue, Nourishment nourishment){
        return new GiantController(buildGiantModel(health, fatigue, nourishment), buildGiantView());
    }

    private static GiantModel buildGiantModel(Health health, Fatigue fatigue, Nourishment nourishment){
        return new GiantModel(health, fatigue, nourishment);
    }

    private static GiantModel buildGiantModel(){
        return new GiantModel(Health.HEALTHY, Fatigue.FRESH, Nourishment.FULL);
    }

    private static GiantView buildGiantView(){
        return new GiantView();
    }
}
