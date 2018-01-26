package api;

public interface CutestCatCallback {

    void onCutestCatSaved(Uri uri);

    void onError(Exception e);
}
