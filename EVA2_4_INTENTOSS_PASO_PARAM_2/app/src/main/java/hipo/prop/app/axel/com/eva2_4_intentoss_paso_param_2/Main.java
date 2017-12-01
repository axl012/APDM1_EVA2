package hipo.prop.app.axel.com.eva2_4_intentoss_paso_param_2;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main extends AppCompatActivity {

    EditText edtxtBuscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxtBuscar = (EditText) findViewById(R.id.edtxtBuscar);

    }

    public void miClick (View v){
        String sBuscar = edtxtBuscar.getText().toString();
        Intent inBuscarWeb = new Intent(Intent.ACTION_WEB_SEARCH);

        inBuscarWeb.putExtra(SearchManager.QUERY, sBuscar);
        startActivity(inBuscarWeb);

    }
}
