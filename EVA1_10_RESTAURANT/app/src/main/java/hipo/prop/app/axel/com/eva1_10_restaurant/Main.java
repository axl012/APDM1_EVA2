package hipo.prop.app.axel.com.eva1_10_restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main extends AppCompatActivity implements ListView.OnItemClickListener{

    ListView lsVwRestaurant;
    DatosRestaurant[] dcDatos = {
            new DatosRestaurant("Barra Libre","Alguna direccion en alguna parte","Un bonito restaurant fino", "barrafina@hotmail.com","4189912" ,R.drawable.barrafina),
            new DatosRestaurant("Bourke Street Bakery ","pues esta en bourke street ","Un lugar muy comodo para come rn rico postre con tus seres queridos","bourke@hotmail.com","4113455", R.drawable.bourkestreetbakery),
            new DatosRestaurant("Cafe de Adend","La neta no se donde este","Un rico cafe donde podra pasar un buen rato", "adend@hotmail.com","4556612", R.drawable.cafedeadend),
            new DatosRestaurant("Cafe Loisl","Creo que esta en Hong Kong","Si te gusta viajar medio mundo por un cafe, este lugar es para ti", "loisl@hotmail.com", "5667811", R.drawable.cafeloisl),
            new DatosRestaurant("Cafe Lore","Por la casa de lorena, atras de hecho","Si te cae bien lorena y quieres apoyar su negocio ven a visitarnos", "lore@hotmail.com", "4778816", R.drawable.cafelore),
            new DatosRestaurant("Confessional","Talvez en italia, talvez no","Excelente lugar para comer al estilo italiano, imperdible si te gusta la pizza", "confessioni@hotmail.com", "4890010", R.drawable.confessional),
            new DatosRestaurant("Donostia","Enseguida de un oxxo ","Buen lugar para comer si te gustan los juegos de palabra", "dono@outlook.com", "5741322", R.drawable.donostia),
            new DatosRestaurant("Five Leaves","Enseguida del soberano","Contamos con una variedad de bebidas y botanas caigale", "five@leaves.com", "9786513", R.drawable.fiveleaves),
            new DatosRestaurant("Forkee Restaurant","Suena como por inglaterra","Restaurant con estilo casero pero con comida rica", "fork@gmail.com", "3457712", R.drawable.forkeerestaurant),
            new DatosRestaurant("Graham Avenue Meats","Av, Graham","Restaurant con amplia variedad de carnes para todo gusto", "graham@av.com", "7345576", R.drawable.grahamavenuemeats),
            new DatosRestaurant("Haighs Chocolate","Frente a la calle pino","Reposteria de gran calidad con chocolates de todo tipo", "choco@late.com", "9176133", R.drawable.haighschocolate),
            new DatosRestaurant("Homei","Calle aldama 3312","Pues no me suena a nada", "homei@email.com", "4000000", R.drawable.homei),
            new DatosRestaurant("Palomino Espresso","Juventud 431","Cafeteria donde Palomino se la rifa chido", "palo@mino.com", "4567899", R.drawable.palominoespresso),
            new DatosRestaurant("Petite Oyster","industrias 3411","Marisqueria de gran calidad con comida fresquesita", "petite@oyster.com", "5334415", R.drawable.petiteoyster),
            new DatosRestaurant("Pos Atelier","grecia 1233","Nose de que sea pero igual ven", "nose@dequees.com", "7665544", R.drawable.posatelier),
            new DatosRestaurant("Royal Oak","vancouver 1233","Restaurant elegante canadiense con amplia variedad de cimida canadiense, ven a conocernos", "oak@canada.com", "7990022", R.drawable.royaloak),
            new DatosRestaurant("Tea Kha","china 6789","Restaurant para amantes del te y otras bebidas o comidas exoticas", "tea@kha.com", "5431223", R.drawable.teakha),
            new DatosRestaurant("Thai Cafe","thailandia 7899","Restaurante Thailandes para amantes de comidas exoticas", "thai@gmail.com", "5664455", R.drawable.thaicafe),
            new DatosRestaurant("Traif","green st. 7866","Restaurant gourmet ingles con precios altisimos", "green@land.com", "9779787", R.drawable.traif),
            new DatosRestaurant("Up State","ny 6544","Buen ambiente, buenas alitas ven a conocernos pronto", "upstate@hotmail.com", "5564324", R.drawable.upstate),
            new DatosRestaurant("Waffle Wolf","americas 1993","Buenos desayunos con waffles y chokymilk", "choky@hotmail.com", "1974466", R.drawable.wafflewolf)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsVwRestaurant= (ListView) findViewById(R.id.lsVwRestaurant);
        lsVwRestaurant.setAdapter(new CustomAdapter(this,R.layout.lista_rest,dcDatos));
        lsVwRestaurant.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent inDetalle = new Intent(this, Detalles.class);
        int Img = dcDatos[position].Imagen;
        String sNm = dcDatos[position].Nombre;
        String sDr = dcDatos[position].Direccion;
        String sDs = dcDatos[position].Descripcion;
        String sEm = dcDatos[position].Email;
        String sTl = dcDatos[position].Tel;
        inDetalle.putExtra("IMAGEN",Img);
        inDetalle.putExtra("NOMBRE",sNm);
        inDetalle.putExtra("DIRECCION",sDr);
        inDetalle.putExtra("DESCRIPCION",sDs);
        inDetalle.putExtra("EMAIL",sEm);
        inDetalle.putExtra("TELEFONO",sTl);
        startActivity(inDetalle);

    }
}
