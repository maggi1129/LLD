package com.company;

public class ProcessModel {

    public String getId() {
        return id;
    }

    private final String id;

    public long getStartTime() {
        return startTime;
    }

    private final long startTime;

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getEndTime() {
        return endTime;
    }

    private long endTime;

    public ProcessModel(final String id, final long startTime){
        this.id = id;
        this.startTime = startTime;
        this.endTime=-1;

    }
}
