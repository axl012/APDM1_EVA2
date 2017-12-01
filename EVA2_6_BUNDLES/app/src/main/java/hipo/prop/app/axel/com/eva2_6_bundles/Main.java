package hipo.prop.app.axel.com.eva2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main extends AppCompatActivity {
    EditText edtxtNom, edtxtAp, edtxtEdad, edtxtSalario;
    RadioGroup rdgpSexo;
    RadioButton rdbtnHom, rdbtnMuj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxtNom = (EditText)findViewById(R.id.edtxtNom);
        edtxtAp = (EditText)findViewById(R.id.edtxtAp);
        edtxtEdad = (EditText)findViewById(R.id.edtxtEdad);
        edtxtSalario = (EditText)findViewById(R.id.edtxtSalario);
        rdbtnHom = (RadioButton)findViewById(R.id.rdbtnHom);
        //rdbtnMuj = (RadioButton)findViewById(R.id.rdbtnMuj);
    }
    public void onClick(View v){
        Intent inEnviarDatos = new Intent(this, Secundaria.class);
        Bundle bnDatos = new Bundle();
        bnDatos.putString("NOMBRE", edtxtNom.getText().toString());
        bnDatos.putString("APELLIDO", edtxtAp.getText().toString());
        bnDatos.putInt("EDAD", Integer.parseInt(edtxtEdad.getText().toString()));
        bnDatos.putDouble("SALARIO", Double.parseDouble(edtxtSalario.getText().toString()));
        bnDatos.putBoolean("GENERO",rdbtnHom.isChecked());
        inEnviarDatos.putExtras(bnDatos);
        startActivity(inEnviarDatos);
    }
}
