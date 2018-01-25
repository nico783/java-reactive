import java.util.Collections;
import java.util.List;

public class CatHelper {

    private Api api;

    public CatHelper(Api api) {
        this.api = api;
    }

    public void saveTheCutestCat(String query) {
        api.queryCats(query, new CatsQueryCallback() {
            @Override
            public void onCatListReceived(List<Cat> cats) {
                Cat cutest = findCutest(cats);
                api.store(cutest);
            }

            @Override
            public void onError(Exception e) {

            }
        });

    }

    private Cat findCutest(List<Cat> cats) {
        return Collections.max(cats);
    }

}
