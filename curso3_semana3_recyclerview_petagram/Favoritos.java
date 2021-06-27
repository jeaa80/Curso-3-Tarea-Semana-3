package com.jesus.curso3_semana3_recyclerview_petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.jesus.curso3_semana3_recyclerview_petagram.Adapter.Usuarios;
import com.jesus.curso3_semana3_recyclerview_petagram.Adapter.UsuariosAdaptador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Favoritos extends AppCompatActivity {
    RecyclerView recyclerUsuarios;
    UsuariosAdaptador usuariosAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        inicializarElementos();

        Toolbar actionbar = (Toolbar) findViewById(R.id.topAppBar);
        actionbar.setTitle(R.string.favorito);


        actionbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Favoritos.this, MainActivity.class);
                startActivity(intent);
                Favoritos.this.finish();
            }
        });

    }

    public void inicializarElementos() {

        recyclerUsuarios    = findViewById(R.id.recycler);
        recyclerUsuarios.setLayoutManager(new LinearLayoutManager(this));

        BaseDatos objFavorito = new BaseDatos();

        List<Usuarios> usuariosFavoritos = objFavorito.baseDatos();
        Collections.sort(usuariosFavoritos, new Comparator<Usuarios>() {
            @Override
            public int compare(Usuarios o1, Usuarios o2) {
                return o2.getLikes().compareToIgnoreCase(o1.getLikes());

            }
        });

        usuariosAdaptador   = new UsuariosAdaptador(usuariosFavoritos,this);

        recyclerUsuarios.setAdapter(usuariosAdaptador);



    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(Favoritos.this,MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }



}