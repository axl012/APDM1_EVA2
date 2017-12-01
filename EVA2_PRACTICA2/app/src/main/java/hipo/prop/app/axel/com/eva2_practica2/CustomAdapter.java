package hipo.prop.app.axel.com.eva2_practica2;

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
 * Created by axel012 on 11/5/2017.
 */

public class CustomAdapter extends ArrayAdapter<DatosMateria>{
    Context cntApp;
    int Layout;
    DatosMateria [] drDatos;

    public CustomAdapter(Context context, int resource, DatosMateria[] objects) {
        super(context, resource, objects);
        cntApp = context;
        Layout = resource;
        drDatos = objects;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View Fila= convertView;
        ImageView imgVwMateria;
        TextView txtVwMateria;
        if(Fila==null){
            LayoutInflater liCrearLayout = ((Activity)cntApp).getLayoutInflater();
            Fila = liCrearLayout.inflate(Layout, parent,false);
        }
        imgVwMateria =  Fila.findViewById(R.id.imgVwMateria);
        txtVwMateria =  Fila.findViewById(R.id.txtVwMateria);
        DatosMateria drOb =  drDatos[position];
        imgVwMateria.setImageResource(drOb.fotoMat);
        txtVwMateria.setText(drOb.Materia);
        return  Fila;
    }
}
