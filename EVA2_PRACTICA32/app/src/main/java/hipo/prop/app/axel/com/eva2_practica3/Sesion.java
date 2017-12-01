package hipo.prop.app.axel.com.eva2_practica3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sesion extends AppCompatActivity {

    Intent Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);
        Login = getIntent();
    }

    public void onClickLogOut(View v){
        finish();
    }
}
