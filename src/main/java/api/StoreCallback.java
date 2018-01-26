package api;

public interface StoreCallback {

    void onCatStored(Uri cat);

    void onStoreFailed(Exception e);

}
