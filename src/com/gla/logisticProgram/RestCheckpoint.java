package com.gla.logisticProgram;

public class RestCheckpoint extends Checkpoint{
    public RestCheckpoint(String id,String name,double distance,double expected,double actual){
        super(id,name,distance,expected,actual);
    }

    @Override
    double computePenality() {
        if(actualTime-expectedtime>30){
            return (actualTime-expectedtime)*0.5;
        }return 0;
    }
}
