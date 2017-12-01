package hipo.prop.app.axel.com.eva2_7_activity_result;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main extends AppCompatActivity {
    private final int MIS_DATOS = 1000;
    private final int MIS_CONTACTOS = 2000;
    TextView txtvTexto;
    Intent inRegresarDatos, inRegresarContacto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvTexto = (TextView)findViewById(R.id.txtvTexto);
        inRegresarDatos = new Intent(this, Secundaria.class);
        Uri uriContacto = ContactsContract.Contacts.CONTENT_URI;
        inRegresarContacto = new Intent(Intent.ACTION_PICK, uriContacto);
    }
    public void onClick(View v){
        startActivityForResult(inRegresarDatos,MIS_DATOS);
    }
    public void onClickContactos(View v){
        startActivityForResult(inRegresarContacto,MIS_CONTACTOS);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == MIS_DATOS){
            if (resultCode == Activity.RESULT_OK){
                txtvTexto.setText(data.getStringExtra("MIS_DATOS"));
            }
        }else if(requestCode == MIS_CONTACTOS){
            if (resultCode == Activity.RESULT_OK){
                String scont = data.getDataString();
               // txtvTexto.setText(this, data.getDataString(), Toast.LENGTH_LONG).show;
                Intent inEditar = new Intent(Intent.ACTION_EDIT, Uri.parse(scont));
                startActivity(inEditar);
            }

        }
    }
}
