package hipo.prop.app.axel.com.eva2_12_permisos;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends AppCompatActivity {
    EditText edtxtNumero;
    Intent inLlamar;
    Boolean bPermisos = false;
    final int permisocall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxtNumero = (EditText)findViewById(R.id.edtxtNumero);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED);{
            ActivityCompat
            Toast.makeText(this, "nel", Toast.LENGTH_SHORT).show();
        }else{
            bPermisos = true;
        }
    }

    public void onClick(View v){
        String sCade = "tel: " + edtxtNumero.getText().toString();
        inLlamar = new Intent(Intent.ACTION_CALL, Uri.parse(sCade));
        startActivity(inLlamar);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == PERMISO_LLAMAR){
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
                bPermisos = true;
            }else{
                Toast.makeText(this, "que no estes chingando hombre", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
