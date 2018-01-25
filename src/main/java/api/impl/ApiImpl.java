package api.impl;

import api.Api;
import api.Cat;
import api.CatsQueryCallback;

import java.util.Arrays;

public class ApiImpl implements Api {

    @Override
    public void queryCats(String query, CatsQueryCallback catsQueryCallback) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Cat cat1 = new Cat(3);
        Cat cat2 = new Cat(2);
        Cat cat3 = new Cat(3);
        Cat cat4 = new Cat(5);
        Cat cat5 = new Cat(1);

        catsQueryCallback.onCatListReceived(Arrays.asList(cat1, cat2, cat3, cat4, cat5));
    }

    @Override
    public void store(Cat cat) {
        try {
            System.out.println("Enregistrement en cours...");
            Thread.sleep(5000);
            System.out.println("Enregistrement en bdd du chat: " + cat + " effectué");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
