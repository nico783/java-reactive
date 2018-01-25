package api;

import java.util.Collections;
import java.util.List;

public class CatHelper {

    private Api api;

    public CatHelper(Api api) {
        this.api = api;
    }

    public void saveTheCutestCat(String query) {
        List<Cat> cats = api.queryCats(query);
        Cat cutest = findCutest(cats);
        api.store(cutest);
    }

    private Cat findCutest(List<Cat> cats) {
        try {
            System.out.println("Recherche en cours du chat le plus mignon...");
            Thread.sleep(5000);
            Cat cat = Collections.max(cats);
            System.out.println("Trouvé! "+ cat + " est le chat le plus mignon!");
            return cat;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
