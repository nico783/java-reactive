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
        return Collections.max(cats);
    }

}
