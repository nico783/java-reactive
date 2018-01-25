import java.util.List;

public interface Api {

    void queryCats(String query, CatsQueryCallback catsQueryCallback);

    void store(Cat cat);

}
