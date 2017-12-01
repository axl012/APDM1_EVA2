package hipo.prop.app.axel.com.eva1_10_restaurant;

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
 * Created by axel012 on 10/24/2017.
 */

public class CustomAdapter extends ArrayAdapter<DatosRestaurant>{

    Context cntApp;
    int Layout;
    DatosRestaurant[] dcDatos;

    public CustomAdapter(Context context, int resource, DatosRestaurant[] objects) {
        super(context, resource, objects);
        cntApp= context;
        Layout=resource;
        dcDatos=objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View Fila = convertView;
        ImageView imgImagen;
        TextView txtnom, txtdir,txtdes,txtem,txttel;
        if(Fila==null){
            LayoutInflater liCrearLayout = ((Activity)cntApp).getLayoutInflater();
            Fila = liCrearLayout.inflate(Layout, parent, false);
        }
        imgImagen = (ImageView) Fila.findViewById(R.id.imgVwImagen);
        txtnom = (TextView) Fila.findViewById(R.id.txtVwNombre);
        txtdir = (TextView) Fila.findViewById(R.id.txtVwDireccion);
        txtdes = (TextView) Fila.findViewById(R.id.txtVwDescripcion);
        txtem = (TextView) Fila.findViewById(R.id.txtVwEmail);
        txttel = (TextView) Fila.findViewById(R.id.txtVwTelefono);
        DatosRestaurant dcOb = dcDatos[position];
        imgImagen.setImageResource(dcOb.Imagen);
        txtnom.setText(dcOb.Nombre);
        txtdir.setText(dcOb.Direccion);
        txtdes.setText(dcOb.Descripcion);
        txtem.setText(dcOb.Email);
        txttel.setText(dcOb.Tel);


        return Fila;
    }
}
