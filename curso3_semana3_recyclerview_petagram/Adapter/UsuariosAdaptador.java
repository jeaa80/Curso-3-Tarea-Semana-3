package com.jesus.curso3_semana3_recyclerview_petagram.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.jesus.curso3_semana3_recyclerview_petagram.R;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class UsuariosAdaptador extends RecyclerView.Adapter<UsuariosAdaptador.ViewHolder>{
    private List<Usuarios> usuarioList;
    private Context context;

       public UsuariosAdaptador(List<Usuarios> usuarioList, Context context) {
        this.usuarioList = usuarioList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view   = LayoutInflater.from(parent.getContext()).inflate(R.layout.tarjeta_usuarios,parent,false);



        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_nombre.setText(usuarioList.get(position).getNombre());
        holder.tv_likes.setText(usuarioList.get(position).getLikes());
        holder.imgFoto.setImageResource(usuarioList.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return usuarioList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView   imgFoto;
        private TextView    tv_nombre;
        private TextView    tv_likes;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           //Enlazar los elementos de la tarjeta
           imgFoto      = itemView.findViewById(R.id.img_Foto);
           tv_nombre    = itemView.findViewById(R.id.tv_nombre);
           tv_likes    = itemView.findViewById(R.id.tv_likes);

        }
    }

    private void setLikesIcon(){


    }

}
