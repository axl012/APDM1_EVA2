package hipo.prop.app.axel.com.eva1_10_restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DatosRestaurant {
    String Nombre, Descripcion, Tel, Email, Direccion;
    int Imagen;

    public DatosRestaurant(String nombre, String descripcion, String tel,String email, String direccion, int imagen) {
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Tel = tel;
        this.Email = email;
        this.Direccion = direccion;
        this.Imagen = imagen;
    }
}
