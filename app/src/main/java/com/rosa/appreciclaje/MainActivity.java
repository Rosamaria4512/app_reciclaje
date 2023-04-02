package com.rosa.appreciclaje;

import static com.rosa.appreciclaje.R.id.imageViewbtn1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

       // ImageView boton1 = (ImageView) findViewById(R.id.img_recicla);
       // boton1.setOnClickListener( (v)->{
          //  Toast notificacion = Toast.makeText(MainActivity.this, "recicla",Toast.LENGTH_SHORT);
             //       notificacion.show();
          //  Intent intencion = new Intent(getApplicationContext(),MenuReciclaya2Activity.class);
         //   startActivity(intencion);
      //  });

      //  Button boton1 = (Button) findViewById(R.id.btn_otro);
       // boton1.setOnClickListener((v)->{
         //   Toast notificacion = Toast.makeText(MainActivity.this, "recicla",Toast.LENGTH_SHORT);
          //  notificacion.show();
          //  Intent intencion = new Intent(getApplicationContext(),MenuReciclaya2Activity.class);
           //  startActivity(intencion);

      //  });

        ImageView boton2 = (ImageView) findViewById(R.id.imageViewbtn1);
        boton2.setOnClickListener((v)->{
            Toast notificacion1= Toast.makeText(MainActivity.this, "Plastico",Toast.LENGTH_SHORT);
            notificacion1.show();
            Intent intencion1 = new Intent(getApplicationContext(),ReciclaYa.class);
            startActivity(intencion1);

        });

        ImageView boton3 = (ImageView) findViewById(R.id.imageViewbtn2);

    }

    @Override
    public void onClick(View view) {

    }
}