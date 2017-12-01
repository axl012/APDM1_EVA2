package hipo.prop.app.axel.com.eva2_8_listas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Secundaria extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lstVDatos;
    Intent inDatos;
    String[] asDatos = {"tacos", "tortillas,", "tostadas", "discada","chuletas", "huerfanos", "papitas", "hotdogs", "hamburguesas", "kugos", "burritos"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        lstVDatos = (ListView)findViewById(R.id.lstVDatos);
        lstVDatos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, asDatos));
        inDatos = getIntent();
        lstVDatos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        inDatos.putExtra("DATOS", asDatos[position]);
        setResult(Activity.RESULT_OK, inDatos);
    }

}
