package hipo.prop.app.axel.com.eva2_practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView lstVwRestaurantes;
    DatosRestaurante [] drDatos={
            new DatosRestaurante("Barra Fina", "Cafe Gourmet",
                    "Periferico 312", "5521648",R.drawable.barrafina),
            new DatosRestaurante("Bourke street Bakery", "Panaderia",
                    "Plaza Rayuela", "4167744",R.drawable.bourkestreetbakery),
            new DatosRestaurante("Cafe de Adend ", "Cafeteria ",
                    "Chihuahua Centro #1012", "5521648",R.drawable.cafedeadend),
            new DatosRestaurante("Cafe Loisl","Cafeteria","hong kong 5143", "5667811", R.drawable.cafeloisl),
            new DatosRestaurante("Cafe Lore","Cafe Gourmet","Villa dorada 9331", "4778816", R.drawable.cafelore),
            new DatosRestaurante("Confessional","Comida italiana ","Roma 1010", "4890010", R.drawable.confessional),
            new DatosRestaurante("Donostia","Reposteria ","Aldama 2345", "5741322", R.drawable.donostia),
            new DatosRestaurante("Five Leaves","Cafe Gourmet","Quetzal 5105", "9786513", R.drawable.fiveleaves),
            new DatosRestaurante("Forkee Restaurant","Cocina Gourmet","Londres 9865", "3457712", R.drawable.forkeerestaurant),
            new DatosRestaurante("Graham Avenue Meats","Restaurant familiar","Avenida graham 9732", "7345576", R.drawable.grahamavenuemeats),

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwRestaurantes =  findViewById(R.id.lstVwRestaurantes);
        lstVwRestaurantes.setAdapter(new
                CustomAdapter(this,R.layout.activity_lista_restaurante,drDatos));
        lstVwRestaurantes.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent inDetalle= new Intent(this, Detalles.class);
        int Img = drDatos[position].Imagen;
        String sNombre = drDatos[position].Nombre;
        String sTipo = drDatos[position].Tipo;
        String sDireccion = drDatos[position].Direccion;
        String sTelefono = drDatos[position].Telefono;
        inDetalle.putExtra("IMAGEN",Img);
        inDetalle.putExtra("NOMBRE",sNombre);
        inDetalle.putExtra("TIPO",sTipo);
        inDetalle.putExtra("DIRECCION",sDireccion);
        inDetalle.putExtra("TELEFONO",sTelefono);
        startActivity(inDetalle);



    }
}
