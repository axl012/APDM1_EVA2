package hipo.prop.app.axel.com.eva2_practica1;

/**
 * Created by axel012 on 11/4/2017.
 */

public class DatosRestaurante {
    String Nombre, Tipo, Direccion, Telefono;
    int Imagen;

    public DatosRestaurante(String nombre, String tipo, String direccion, String telefono
            , int imagen) {
        this.Nombre = nombre;
        this.Tipo = tipo;
        this.Direccion = direccion;
        this.Telefono = telefono;
        this.Imagen = imagen;
    }
}
