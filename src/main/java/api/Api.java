package api;

import java.util.List;

public interface Api {

    List<Cat> queryCats(String query);

    void store(Cat cat);

}
