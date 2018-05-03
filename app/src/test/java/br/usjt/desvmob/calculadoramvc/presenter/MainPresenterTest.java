package br.usjt.desvmob.calculadoramvc.presenter;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.usjt.desvmob.calculadoramvc.view.MainActivity;
import br.usjt.desvmob.calculadoramvc.view.MainView;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

/**
 * Created by jhonasbalsas on 03/05/18.
 */

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {
    private MainPresenter presenter;

    @Mock
    private MainView view;


    @Before
    public void setUp(){
        presenter = new MainPresenter(view);
        presenter.onCreate();
    }

    @Test
    public void testeCalculo(){
        when(view.getValor1()).thenReturn("1");
        when(view.getValor2()).thenReturn("2");
        when(view.getOperador()).thenReturn("+");
        presenter.calcular();
        assertEquals("3", presenter.getResultado());
        System.out.print(presenter.getResultado());
    }

}
