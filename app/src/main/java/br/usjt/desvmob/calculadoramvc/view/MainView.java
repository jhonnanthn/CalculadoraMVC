package br.usjt.desvmob.calculadoramvc.view;

/**
 * Created by jhonasbalsas on 02/05/18.
 */

public interface MainView {
    String getValor1();
    String getValor2();
    String getOperador();
    String getResultado();
    void setResultado(String resultado);
}
