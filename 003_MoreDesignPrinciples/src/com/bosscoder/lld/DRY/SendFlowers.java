package com.bosscoder.lld.DRY;

public class SendFlowers {

    private ISenderService senderService;

    public SendFlowers(ISenderService senderService) {
       this.senderService = senderService;
    }

    public void sendFlowers(){
        System.out.println("Making Bouquet");

        // Repeated Code
       // System.out.println("sending");
        senderService.send();
    }
}
