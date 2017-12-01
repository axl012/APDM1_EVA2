package hipo.prop.app.axel.com.eva2_7_activity_result;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Secundaria extends AppCompatActivity {
    EditText edtxtEnviar;
    Intent inResu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        edtxtEnviar = (EditText)findViewById(R.id.edtxtEnviar);
        inResu = getIntent();

    }

    public void onClick(View v){
        String sCade = edtxtEnviar.getText().toString();
        inResu.putExtra("MIS_DATOS", sCade);
        setResult(Activity.RESULT_OK,inResu);
        finish();
    }
}
