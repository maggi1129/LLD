package com.bosscoder;

import com.bosscoder.lld.open.closed.AnimalOP;
import com.bosscoder.lld.open.closed.Cat;
import com.bosscoder.lld.open.closed.DogOP;
import com.bosscoder.lld.open.closed.FosterAnimal;
import com.bosscoder.lld.srp.used.DietSender;
import com.bosscoder.lld.srp.used.RewardsCalculator;
import com.bosscoder.lld.srp.used.ScheduleSender;
import com.bosscoder.lld.srp.used.TrainerSRP;
import com.bosscoder.lld.without.lsp.DummyDog;
import com.bosscoder.lld.without.lsp.IDog;
import com.bosscoder.lld.without.lsp.RealDog;
import com.bosscoder.lld.without.srp.Trainer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Without SRP - tightly coupled, no proper real world mapping
//        Trainer t = new Trainer("ABC", 1, 30);
//        t.sendDiet();
//        t.sendSchedule();
//        t.calculateRewards();
//
//        //With SRP- loosely coupled
//        TrainerSRP betterTrainer = new TrainerSRP("XYZ",2,30);
//
//        ScheduleSender scheduleSender = new ScheduleSender();
//        scheduleSender.sendSchedule(betterTrainer);
//
//        DietSender dietSender = new DietSender();
//        dietSender.sendDiet(betterTrainer);
//
//        RewardsCalculator rewardsCalculator = new RewardsCalculator();
//        rewardsCalculator.calculateRewards(betterTrainer);
//
//
//        List<AnimalOP> animalList = new ArrayList<AnimalOP>();
//
//        AnimalOP a = new Cat();
//        AnimalOP b = new DogOP();
//
//        animalList.add(a);
//        animalList.add(b);
//
//        FosterAnimal f = new FosterAnimal();
//        f.fosterAnimal(a);
//        f.fosterAnimal(b);
//
//        f.fosterAnimal(animalList);

        IDog pet = new RealDog();
        pet.eat();
        pet.makeNoise();

        // Is a relationship passes but not all functionalities work
        IDog dog = new DummyDog();
        System.out.println("Dummy dog");
        dog.makeNoise();
        dog.eat();

    }
}
