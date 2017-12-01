package hipo.prop.app.axel.com.eva2_practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class lista_restaurante extends AppCompatActivity {
    TextView txtVwNombre,txtDireccion;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurante);
    }
}
