package pl.sda.mvc.builder;

import pl.sda.mvc.Controller.GiantController;
import pl.sda.mvc.Model.Components.*;
import pl.sda.mvc.Model.GiantModel;
import pl.sda.mvc.View.GiantView;

import java.util.LinkedList;
import java.util.List;

public class GiantBuilder {

    public static GiantController buildGiant(){
        return new GiantController(buildGiantModel(), buildGiantView());
    }

    public static GiantController buildGiant(Health health, Fatigue fatigue, Nourishment nourishment){
        return new GiantController(buildGiantModel(health, fatigue, nourishment), buildGiantView());
    }



    private static List<GiantModel> buildGiantModel(Health health, Fatigue fatigue, Nourishment nourishment){
        LinkedList<GiantModel> list = new LinkedList<GiantModel>();
        list.add(new GiantModel(health, fatigue, nourishment));
        return list;
    }

    private static List<GiantModel> buildGiantModel(){
        LinkedList<GiantModel> list = new LinkedList<GiantModel>();
        list.add(new GiantModel(Health.HEALTHY, Fatigue.FRESH, Nourishment.FULL));
        return list;
    }

    private static GiantView buildGiantView(){
        return new GiantView();
    }
}
