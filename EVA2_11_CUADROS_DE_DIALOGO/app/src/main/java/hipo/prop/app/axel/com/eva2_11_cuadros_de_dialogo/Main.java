package hipo.prop.app.axel.com.eva2_11_cuadros_de_dialogo;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    Context cnApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cnApp = getApplicationContext();

    }

    public void onClickDialogo(View v){
        new AlertDialog.Builder(this).setTitle("LO que quieras").setMessage("holi").setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(cnApp, "boton positivo", Toast.LENGTH_SHORT).show();
            }
        })
        .setNegativeButton("nel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(cnApp, "boton negativoo", Toast.LENGTH_SHORT).show();
            }
        })
                .setNeutralButton("nelson", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(cnApp, "neutral", Toast.LENGTH_SHORT).show();
                    }
                })
                .create().show();
    }

    public void onClickDialogoPer(View v){
        final Dialog digMiDialogo = new Dialog(this);
        digMiDialogo.setContentView(R.layout.mi_cuadro_dialogo);
        TextView txtVwDiag;
         final EditText edtxtDiag;
        Button btnBoton;


        txtVwDiag = (TextView)findViewById(R.id.txtVwDiag);
        edtxtDiag = (EditText)findViewById(R.id.edtxtDiag);
        btnBoton = (Button) digMiDialogo.findViewById(R.id.button);

        txtVwDiag.setText("mi cuadrito");
        btnBoton.setText("heytale");
        btnBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(cnApp, edtxtDiag.getText().toString(), Toast.LENGTH_SHORT).show();
                digMiDialogo.dismiss();

            }
        });
        digMiDialogo.show();



    }
}
