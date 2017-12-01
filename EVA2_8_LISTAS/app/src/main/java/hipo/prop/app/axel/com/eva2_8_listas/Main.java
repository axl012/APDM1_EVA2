package hipo.prop.app.axel.com.eva2_8_listas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    TextView txtVtexto;
    Intent inPedirDatos;
    final int MIS_DATOS = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVtexto = (TextView)findViewById(R.id.txtV);
        inPedirDatos = new Intent(this, Secundaria.class);
    }
    public void onClick(View v){
        startActivityForResult(inPedirDatos, MIS_DATOS);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == MIS_DATOS){
            if (resultCode == Activity.RESULT_OK){
                String scade = data.getStringExtra("DATOS");
                txtVtexto.setText(scade);
            }
        }
    }
}
