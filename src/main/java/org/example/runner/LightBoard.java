package org.example.runner;

import org.example.handler.impl.LightHandlerImpl;
import org.example.model.Lights;

public class LightBoard {
    private static Lights lights[][] = new Lights[999][999];

    private static   LightHandlerImpl lightHandler= new  LightHandlerImpl();

    public static void main(String args[]){

        operationSequence(lightHandler);
        System.out.println(lightCounter());

    }

    private static double lightCounter() {
        double counter=0D;
        for(int i=0;i<999;i++){
            for(int j=0;j<999;j++){
                counter+=lights[i][j].getIntensity()?1:0;
            }
        }
        return counter;
    }

    private static void operationSequence(LightHandlerImpl lightHandler) {
        lightHandler.turnOn(lights,887,9,959,629);
        lightHandler.turnOn(lights,454,398,844,448);
        lightHandler.tunrOff(lights,539,243,559,965);
        lightHandler.tunrOff(lights,370,819,676,868);
        lightHandler.tunrOff(lights,145,40,370,997);
        lightHandler.tunrOff(lights,301,3,808,453);
        lightHandler.turnOn(lights,351,768,951,908);
        lightHandler.toggle(lights,720,196,897,994);
        lightHandler.toggle(lights,831,394,904,860);
    }


}
