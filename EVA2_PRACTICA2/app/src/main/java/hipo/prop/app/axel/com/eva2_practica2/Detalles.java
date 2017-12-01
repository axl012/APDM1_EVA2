package hipo.prop.app.axel.com.eva2_practica2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {
    ImageView imgMaestro, imgVwMateria;
    TextView txtVwMateria, txtVwMaestro, txtVwCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        imgMaestro = findViewById(R.id.imgVwProfe);
        imgVwMateria = findViewById(R.id.imgVwMateria);
        txtVwMateria = findViewById(R.id.txtVwMateria);
        txtVwMaestro =  findViewById(R.id.txtVwMaestro);
        txtVwCreditos =  findViewById(R.id.txtVwCreditos);

        Intent inDatos = getIntent();
        int ima = inDatos.getIntExtra("IMAGEN", R.drawable.mrbean);
        int imp = inDatos.getIntExtra("IMAGENSITA",R.drawable.programacion);
        String Mat = inDatos.getStringExtra("MATERIA");
        String Cred = inDatos.getStringExtra("CREDITOS");
        String Prof = inDatos.getStringExtra("MAESTRO");
        imgMaestro.setImageResource(ima);
        txtVwMaestro.setText(Mat);
        txtVwCreditos.setText(Cred);
        txtVwMaestro.setText(Prof);

    }

}
