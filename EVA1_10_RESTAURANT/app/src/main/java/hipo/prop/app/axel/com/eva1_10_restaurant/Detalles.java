package hipo.prop.app.axel.com.eva1_10_restaurant;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {

    ImageView imgVwImagen;
    TextView txtVwNombre, txtVwDireccion, txtVwTelefono, txtVwEmail, txtVwDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        imgVwImagen = (ImageView) findViewById(R.id.imgVwImagen);
        txtVwNombre = (TextView) findViewById(R.id.txtVwNombre);
        txtVwDireccion = (TextView) findViewById(R.id.txtVwDireccion);
        txtVwTelefono = (TextView) findViewById(R.id.txtVwTelefono);
        txtVwEmail = (TextView) findViewById(R.id.txtVwEmail);
        txtVwDescripcion = (TextView) findViewById(R.id.txtVwDescripcion);
        //Leer los datos
        Intent inDatos = getIntent();
        int Ima = inDatos.getIntExtra("IMAGEN",R.drawable.barrafina);
        String nom = inDatos.getStringExtra("NOMBRE");
        String dire = inDatos.getStringExtra("DIRECCION");
        String desc = inDatos.getStringExtra("DESCRIPCION");
        String ema = inDatos.getStringExtra("EMAIL");
        String tele = inDatos.getStringExtra("TELEFONO");
        imgVwImagen.setImageResource(Ima);
        txtVwNombre.setText(nom);
        txtVwDireccion.setText(dire);
        txtVwDescripcion.setText(desc);
        txtVwEmail.setText(ema);
        txtVwTelefono.setText(tele);


    }


}
