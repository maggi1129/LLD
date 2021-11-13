package com.bosscoder.lld.DRY;

public class SendCake {

    private ISenderService senderService;

    public SendCake(ISenderService senderService) {
        this.senderService = senderService;
    }

    public void sendCake(){
        System.out.println("Baking Cake");

        // Repeated Code
        //System.out.println("sending");

        senderService.send();
    }
}
