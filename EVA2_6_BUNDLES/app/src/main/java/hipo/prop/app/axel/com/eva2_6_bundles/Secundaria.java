package hipo.prop.app.axel.com.eva2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    TextView txtvDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtvDatos = (TextView)findViewById(R.id.txtvDatos);
        Intent inDatos = getIntent();
        Bundle bnDatos = inDatos.getExtras();
        txtvDatos.setText("");
        txtvDatos.append("" + bnDatos.getString("NOMBRE"));
        txtvDatos.append(bnDatos.getString("APELLIDO"));
        txtvDatos.append("\n" +bnDatos.getInt("EDAD"));
        txtvDatos.append("\n" +bnDatos.getDouble("SALARIO"));
        if(bnDatos.getBoolean("\n" +"GENERO"))
        txtvDatos.append("\n" +bnDatos.getBoolean("HOMBRE"));
        else
            txtvDatos.append("\n" +bnDatos.getBoolean("MUJER"));
    }
    public void onClick(View v){
        finish();
    }
}
