package hipo.prop.app.axel.com.eva1_10_restaurant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by axel012 on 10/25/2017.
 */

public class ListaRestaurante extends AppCompatActivity{
    TextView txtVwNombre, txtVwDireccion, txtVwDescripcion, txtVwEmail, txtVwTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_rest);

    }
}
