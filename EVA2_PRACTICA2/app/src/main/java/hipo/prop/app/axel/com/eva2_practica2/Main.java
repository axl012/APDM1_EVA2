package hipo.prop.app.axel.com.eva2_practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main extends AppCompatActivity implements ListView.OnItemClickListener{

    ListView lstVwMaterias;
    DatosMateria [] drDatos={
            new DatosMateria("Fundamentos de programacion", "Mr. Bean",
                    "5",R.drawable.mrbean, R.drawable.programacion),
            new DatosMateria("Programacion orientada a objetos", "Chuck Norris",
                    "5",R.drawable.chuck,R.drawable.programacion),
            new DatosMateria("Estructura de datos", "Dios Eolo ",
                    "5",R.drawable.eolo,R.drawable.programacion),
            new DatosMateria("Topicos avanzados de programacion", "Carlos Salinas de Gortari ",
                    "5",R.drawable.salinas,R.drawable.programacion),
            new DatosMateria("Fundamentos de bases de datos", "Edna Moda ",
                    "5",R.drawable.edna,R.drawable.basededatos),
            new DatosMateria("Taller de base de datos", "India Maria ",
                    "5",R.drawable.mrbean,R.drawable.basededatos),
            new DatosMateria("Redes de computadoras", "Daenerys Targaryen ",
                    "5",R.drawable.kalesi,R.drawable.redes),
            new DatosMateria("Graficacion", "Carlos Salinas ",
                    "4",R.drawable.salinas,R.drawable.programacion),
            new DatosMateria("Administracion de base de datos", "Chuck Norris ",
                    "5",R.drawable.chuck,R.drawable.basededatos),
            new DatosMateria("Programacion web", "Mr. Bean ",
                    "5",R.drawable.mrbean,R.drawable.programacion),
            new DatosMateria("Conmutacion y enrutamiento de redes", "Daenerys Targaryen  ",
                    "5",R.drawable.kalesi,R.drawable.redes),
            new DatosMateria("Administracion de redes", "Dios Eolo ",
                    "5",R.drawable.eolo,R.drawable.redes)

         };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwMaterias =  findViewById(R.id.lstVwMaterias);
        lstVwMaterias.setAdapter(new
                CustomAdapter(this,R.layout.activity_lista_materias,drDatos));
        lstVwMaterias.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent inDetalle= new Intent(this, Detalles.class);
        int Img = drDatos[position].FotoMa;
        String sMateria = drDatos[position].Materia;
        String sCreditos = drDatos[position].Creditos;
        String sMaestro = drDatos[position].Maestro;
        inDetalle.putExtra("IMAGEN",Img);
        inDetalle.putExtra("MATERIA",sMateria);
        inDetalle.putExtra("CREDITOS",sCreditos);
        inDetalle.putExtra("MAESTRO",sMaestro);
        startActivity(inDetalle);



    }
}
