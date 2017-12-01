package hipo.prop.app.axel.com.eva2_practica1;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {
    ImageView imgVwRestau;
    TextView txtVwNombre, txtVwTipo, txtVwDireccion, txtVwTelefono;
    Intent inMarcar;
    Button btnLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        imgVwRestau = (ImageView) findViewById(R.id.imgVwRestau);
        txtVwNombre = (TextView) findViewById(R.id.txtVwNombre);
        txtVwTipo = (TextView) findViewById(R.id.txtVwTipo);
        txtVwDireccion = (TextView) findViewById(R.id.txtVwDireccion);
        //txtVwTelefono = (TextView) findViewById(R.id.txtVwTelefono);
        btnLlamar = findViewById(R.id.btnLlamar);

        Intent inDatos = getIntent();
        int ima = inDatos.getIntExtra("IMAGEN", R.drawable.barrafina);
        String Nom = inDatos.getStringExtra("NOMBRE");
        String Tipo = inDatos.getStringExtra("TIPO");
        String Direcc = inDatos.getStringExtra("DIRECCION");
        String Tel = inDatos.getStringExtra("TELEFONO");
        imgVwRestau.setImageResource(ima);
        txtVwNombre.setText(Nom);
        txtVwTipo.setText(Tipo);
        txtVwDireccion.setText(Direcc);
        //txtVwTelefono.setText(Tel);
        btnLlamar.setText("Tel: " + Tel);
        inMarcar = new Intent(Intent.ACTION_CALL);
        inMarcar = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+Tel));


    }

    public void onClickLlamar(View v) {

        startActivity(inMarcar);

    }

}