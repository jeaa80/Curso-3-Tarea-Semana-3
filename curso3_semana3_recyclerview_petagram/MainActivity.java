package com.jesus.curso3_semana3_recyclerview_petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.jesus.curso3_semana3_recyclerview_petagram.Adapter.Usuarios;
import com.jesus.curso3_semana3_recyclerview_petagram.Adapter.UsuariosAdaptador;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    RecyclerView recyclerUsuarios;
    UsuariosAdaptador usuariosAdaptador;
    ImageButton b_siguiente;
    ImageButton b_boton_like;

    /*ImageButton b1;
    //ImageView iv;
    boolean flag;
    int images[]={R.drawable.hueso_amarillo,R.drawable.hueso_amarillo,R.drawable.hueso_blanco};
    int i=0;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarElementos();

        Toolbar topAppBar = (Toolbar) findViewById(R.id.topAppBar);
        setSupportActionBar(topAppBar);

        //Evento para pasar a la otra actividad
        b_siguiente = (ImageButton) findViewById(R.id.b_siguiente);

        b_siguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Favoritos.class);
                startActivity(intent);
                finish();
            }
        });

        //Revisar... cambio de boton
        //findViewById(R.id.b_boton_like).setOnClickListener(imgButtonHandler);


        //iv=(ImageView) findViewById(R.id.img1);
        /*b1=(ImageButton) findViewById(R.id.b_icono_hueso_amarillo);

        flag=true;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setImageResource(images[i]);
                i++;
                if(i==3)
                    i=0;
            }
        });*/

        /*final ImageButton button = (ImageButton) findViewById(R.id.b_boton_like);
        button.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    button.setBackgroundColor(R.drawable.hueso_amarillo);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    button.setBackgroundColor(R.drawable.hueso_blanco);
                }
                return false;
            }

        });*/

    }

    public void inicializarElementos() {
        recyclerUsuarios    = findViewById(R.id.recycler);
        recyclerUsuarios.setLayoutManager(new LinearLayoutManager(this));

        BaseDatos obj = new BaseDatos();

        List<Usuarios> usuariosList = obj.baseDatos();

        usuariosAdaptador   = new UsuariosAdaptador(usuariosList,this);

        recyclerUsuarios.setAdapter(usuariosAdaptador);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.mas:
                Toast.makeText(this,"Boton mas", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.salir:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
    //Revisar...cambio e boton
    /*View.OnClickListener imgButtonHandler = new View.OnClickListener() {

        public void onClick(View v) {

            b_boton_like.setBackgroundResource(R.drawable.hueso_amarillo);

        }
    };*/



}