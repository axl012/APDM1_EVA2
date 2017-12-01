package hipo.prop.app.axel.com.eva2_2_intentos_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {
    Intent inLanzarSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //action quien lanza
        //data a quien se va a lanzar
        inLanzarSec = new Intent(this,Secundaria.class);
    }

    public void onClicl(View v){
        startActivity(inLanzarSec);
    }
}
