import api.CatHelper;
import api.CutestCatCallback;
import api.Uri;
import api.impl.ApiImpl;
import org.junit.Before;
import org.junit.Test;

public class CatHelperTest {

    private CatHelper catHelper;

    @Before
    public void setUp() {
        catHelper = new CatHelper(new ApiImpl());
    }

    @Test
    public void saveTheCutestCat() {
        long debut = System.currentTimeMillis();
        catHelper.saveTheCutestCat("", new CutestCatCallback() {

            @Override
            public void onCutestCatSaved(Uri uri) {
                System.out.println("Enregistrement en bdd du chat: " + uri + " effectué");
            }

            @Override
            public void onError(Exception e) {

            }

        });
        System.out.println(System.currentTimeMillis() - debut);
    }

}