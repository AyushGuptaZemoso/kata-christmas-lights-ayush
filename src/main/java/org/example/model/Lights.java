package org.example.model;

public class Lights {

    private  boolean intensity =false;

    public Lights(Boolean intensity){
        this.intensity = intensity;
    }

    public boolean getIntensity(){
        return intensity;
    }

    public void setIntensity(boolean intensity){
        this.intensity = intensity;
    }
}
