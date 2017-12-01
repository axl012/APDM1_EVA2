package hipo.prop.app.axel.com.eva2_practica1;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by axel012 on 11/4/2017.
 */

public class CustomAdapter extends ArrayAdapter<DatosRestaurante> {
    Context cntApp;
    int Layout;
    DatosRestaurante [] drDatos;

    public CustomAdapter(Context context, int resource, DatosRestaurante[] objects) {
        super(context, resource, objects);
        cntApp = context;
        Layout = resource;
        drDatos = objects;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View Fila= convertView;
        ImageView imgRestaurante;
        TextView txtVwNombre ,txtVwTipo;
        if(Fila==null){
            LayoutInflater liCrearLayout = ((Activity)cntApp).getLayoutInflater();
            Fila = liCrearLayout.inflate(Layout, parent,false);
        }
        imgRestaurante =  Fila.findViewById(R.id.imageView);
        txtVwNombre =  Fila.findViewById(R.id.txtVwNombre);
        txtVwTipo =  Fila.findViewById(R.id.txtVwTipo);
        DatosRestaurante drOb =  drDatos[position];
        imgRestaurante.setImageResource(drOb.Imagen);
        txtVwNombre.setText(drOb.Nombre);
        txtVwTipo.setText(drOb.Tipo);
        return  Fila;
    }
}
