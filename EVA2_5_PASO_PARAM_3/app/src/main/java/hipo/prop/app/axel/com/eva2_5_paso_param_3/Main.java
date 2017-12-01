
package hipo.prop.app.axel.com.eva2_5_paso_param_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main extends AppCompatActivity {

    EditText edtxtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxtTexto = (EditText) findViewById(R.id.edtxtTexto);
    }
    public void miClick (View v){
        Intent inMensa = new Intent(this, Secundaria.class);
        String smensa = edtxtTexto.getText().toString();
        inMensa.putExtra("MENSAJE", smensa);
        startActivity(inMensa);
    }
}
