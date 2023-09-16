package Patterns.FabricMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Patterns.FabricMethod.Fabric.ItemGenerator;
import Patterns.FabricMethod.Fabric.GemGenerator;
import Patterns.FabricMethod.Fabric.GoldGenerator;

public class App {
    public static void main(String[] args) throws Exception {

        Random rnd = ThreadLocalRandom.current();

        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());

        for(int i =0;i<10;i++)
        {
            int index = rnd.nextInt(2);
            // System.out.println(index);
            generatorList.get(index).openReward();
        }


    }
}
