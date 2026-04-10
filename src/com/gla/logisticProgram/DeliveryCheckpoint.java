package com.gla.logisticProgram;

public class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id,String name,double distance,double actual, double expected) {
        super(id, name, distance, expected, actual);
    }
        @Override
        double computePenality () {
            if (actualTime <= expectedtime) return 0;
            return (actualTime - expectedtime) * 2;
        }

    }

