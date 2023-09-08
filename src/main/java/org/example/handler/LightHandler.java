package org.example.handler;
import org.example.model.Lights;
public interface LightHandler {

    void turnOn(Lights[][] lights, int x1,int y1,int x2,int y2);
    void tunrOff(Lights[][] lights, int x1,int y1,int x2,int y2);

    void toggle(Lights[][] lights, int x1,int y1,int x2,int y2);

}
