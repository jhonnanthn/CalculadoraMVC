package br.usjt.desvmob.calculadoramvc.presenter;

/**
 * Created by jhonasbalsas on 02/05/18.
 */

public interface Presenter {
    void onCreate();
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onRestart();
    void onDestroy();
}
