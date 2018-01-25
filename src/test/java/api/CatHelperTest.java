package api;

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
        catHelper.saveTheCutestCat("");
        System.out.println(System.currentTimeMillis() - debut);
    }

}