package com.jesus.curso3_semana3_recyclerview_petagram;

import com.jesus.curso3_semana3_recyclerview_petagram.Adapter.Usuarios;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos  {

    List<Usuarios> usuariosList= new ArrayList<>();

    public List<Usuarios> baseDatos() {

       // List<Usuarios> usuariosList= new ArrayList<>();
        usuariosList.add(new Usuarios(1,"Albert","1", R.drawable.dog_1));
        usuariosList.add(new Usuarios(2,"Bruno","4", R.drawable.dog_2));
        usuariosList.add(new Usuarios(3,"Beto","3", R.drawable.dog_3));
        usuariosList.add(new Usuarios(4,"Chiribiko","5", R.drawable.dog_4));
        usuariosList.add(new Usuarios(5,"Perry Bones","2", R.drawable.dog_5));
        usuariosList.add(new Usuarios(6,"Michy","6", R.drawable.dog_6));

        return usuariosList;
    }


}
