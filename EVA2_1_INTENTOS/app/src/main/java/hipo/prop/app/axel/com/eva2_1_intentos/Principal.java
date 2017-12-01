package hipo.prop.app.axel.com.eva2_1_intentos;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    EditText edtxtNumero;
    Intent inHacerLlamada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edtxtNumero = (EditText)findViewById(R.id.edtxtNumero);
    }

    public void onClick(View v){
        String sCade = "tel:" + edtxtNumero.getText().toString();
        inHacerLlamada = new Intent(Intent.ACTION_CALL, Uri.parse(sCade));
        startActivity(inHacerLlamada);


    }
}
