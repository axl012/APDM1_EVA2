package hipo.prop.app.axel.com.eva2_practica3;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    String User = "Axel" , Pass="12345";
    Context conContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        conContext = getApplicationContext();
    }

    public void onClickCustomBox(View v){
        int Random;
        final Intent inLogin = new Intent(this, Sesion.class);
        final Dialog customDialog = new Dialog(this);
        customDialog.setContentView(R.layout.dialogo);
        final EditText edtTxtUsuario,edtTxtPass;
        Button btnOk, btnCancel;
        ImageView imgVwSesion;

        edtTxtUsuario =  customDialog.findViewById(R.id.edtTxtUsuario);
        edtTxtPass =  customDialog.findViewById(R.id.edtTxtPass);
        btnOk = customDialog.findViewById(R.id.btnOk);
        btnCancel =  customDialog.findViewById(R.id.btnCancel);
        imgVwSesion =  customDialog.findViewById(R.id.imgVwSesion);


        Random =(int)(Math.random()*5);
        if(Random ==1 ){ imgVwSesion.setImageResource(R.drawable.pinguinos);}
        if(Random ==2 ){ imgVwSesion.setImageResource(R.drawable.volcan);}
        if(Random ==3 ){ imgVwSesion.setImageResource(R.drawable.dragon);}
        if(Random ==4 ){ imgVwSesion.setImageResource(R.drawable.dragon2);}
        if(Random ==5 ){ imgVwSesion.setImageResource(R.drawable.lobo);}

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String User2 = edtTxtUsuario.getText().toString();
                String Pass2 = edtTxtPass.getText().toString();

                if(User.compareTo(User2)==0 && Pass.compareTo(Pass2)==0){
                    customDialog.dismiss();
                    inLogin.putExtra("USER",User2);
                    startActivity(inLogin);
                }
                else{
                    Toast.makeText(conContext,
                            "Usuario o Contraseña Incorrectos",Toast.LENGTH_SHORT).show();
                    customDialog.dismiss();
                }
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                customDialog.dismiss();
            }
        });

        customDialog.show();
    }

    public void onClickExit(View v){
        finish();
    }
}

