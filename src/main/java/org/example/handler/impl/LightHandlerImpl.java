package org.example.handler.impl;

import org.example.handler.LightHandler;
import org.example.model.Lights;

public class LightHandlerImpl implements LightHandler {

    public LightHandlerImpl(){

    }
    @Override
    public void turnOn(Lights[][] lights,int x1,int y1,int x2, int y2) {
        for(int i=x1;i<999;i++){
            for(int j=y1;j<999;j++){
                lights[i][j].setIntensity(true);
            }
        }
    }

    @Override
    public void tunrOff(Lights[][] lights, int x1,int y1,int x2,int y2) {
        for(int i=x1;i<999;i++){
            for(int j=y1;j<999;j++){
                lights[i][j].setIntensity(false);
            }
        }
    }

    @Override
    public void toggle(Lights[][] lights, int x1,int y1,int x2,int y2) {
        for(int i=x1;i<999;i++){
            for(int j=y1;j<999;j++){
                boolean value = lights[i][j].getIntensity();
                lights[i][j].setIntensity(!value);
            }
        }
    }
}
