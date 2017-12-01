package hipo.prop.app.axel.com.eva2_5_paso_param_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    TextView txtvTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtvTexto = (TextView) findViewById(R.id.txtvTexto);
        //recuperar la informacion del intento
        Intent inDatos = getIntent();
        String sMensa = inDatos.getStringExtra("MENSAJE");
        txtvTexto.setText(sMensa);
    }


}
