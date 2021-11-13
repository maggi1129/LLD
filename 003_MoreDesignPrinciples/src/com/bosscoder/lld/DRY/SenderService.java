package com.bosscoder.lld.DRY;

public class SenderService implements ISenderService{
    @Override
    public void send() {
        System.out.println("sending");
    }
}
