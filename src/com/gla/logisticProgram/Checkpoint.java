package com.gla.logisticProgram;

abstract class Checkpoint {
        String id;
        String name;
        double distanceFromPrevious;
        double expectedtime;
        double actualTime;

        public Checkpoint(String id, String name, Double distanceFromPrevious, double expectedtime,double actualTime){
            this.id = id;
            this.name = name;
            this.distanceFromPrevious = distanceFromPrevious;
            this.actualTime= actualTime;
        }
    abstract double computePenality();
}
