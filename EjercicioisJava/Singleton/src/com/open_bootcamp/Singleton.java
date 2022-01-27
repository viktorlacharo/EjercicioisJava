package com.open_bootcamp;

public class Singleton {
    private static Singleton singleton;
    String variable;


    public Singleton() {}
    public Singleton(String variable) {
        this.variable = variable;
    }



    public static Singleton crearInstancia(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }
}
