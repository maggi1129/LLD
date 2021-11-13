package com.bosscoder.lld.without.srp;

public class Trainer{

    private String name;
    private int id;
    private int age;

    public Trainer(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void sendDiet(){
        System.out.println("Sending diet");
    }

    public void sendSchedule(){
        System.out.println("Sending schedule");
    }
    public void calculateRewards(){
        System.out.println("Calculating rewards");
    }
}
