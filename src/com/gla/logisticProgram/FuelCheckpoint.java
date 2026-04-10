package com.gla.logisticProgram;

public class FuelCheckpoint extends Checkpoint{
    public FuelCheckpoint(String id,String name,double actual,double distance, double expected){
        super(id,name,distance,expected,actual);
    }

    @Override
    double computePenality() {
        if(actualTime > expectedtime){
            return 10;
        }
        return 0;
    }
}
