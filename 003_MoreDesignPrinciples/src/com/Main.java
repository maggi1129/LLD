package com;

import com.bosscoder.lld.DRY.ISenderService;
import com.bosscoder.lld.DRY.SendCake;
import com.bosscoder.lld.DRY.SendFlowers;
import com.bosscoder.lld.DRY.SenderService;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ISenderService senderService = new SenderService();
        SendFlowers sendFlowers = new SendFlowers(senderService);
        sendFlowers.sendFlowers();

        SendCake sendC = new SendCake(senderService);
        sendC.sendCake();
    }
}
