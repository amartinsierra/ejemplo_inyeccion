package graficos.curso.ejercicios.ejemplo_inyeccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import beans.Cuenta;
import dependencias.DaggerComponenteDrager;

public class MainActivity extends AppCompatActivity {

    @Inject
    Cuenta cuenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerComponenteDrager.builder().build().inject(this);
        System.out.println(cuenta.getCodigo()+ " -------");
    }
}
