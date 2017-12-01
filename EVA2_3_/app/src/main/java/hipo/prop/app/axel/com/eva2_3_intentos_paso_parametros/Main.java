package hipo.prop.app.axel.com.eva2_3_intentos_paso_parametros;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity {
    EditText edtxtNumero, edtxtMensaje;
    //Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxtNumero = (EditText)findViewById(R.id.edtxtNumero);
        edtxtMensaje = (EditText)findViewById(R.id.edtxtMensaje);
       // boton = (Button) findViewById(R.id.boton);
    }
    public void miClick (View v){
        String sTel = "smsto: " + edtxtNumero.getText().toString();
        String sMens = edtxtMensaje.getText().toString();
        Intent inEnviarSMS = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
        //Extra para enviar el cuerpo del mensaje
        inEnviarSMS.putExtra("sms_body", sMens);
        startActivity(inEnviarSMS);
    }
}
