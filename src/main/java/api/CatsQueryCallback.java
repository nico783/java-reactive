package api;

import java.util.List;

public interface CatsQueryCallback {

    void onCatListReceived(List<Cat> cats);

    void onError(Exception e);

}
