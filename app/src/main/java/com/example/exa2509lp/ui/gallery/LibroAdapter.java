package com.example.exa2509lp.ui.gallery;

import static android.app.PendingIntent.getActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exa2509lp.MainActivity;
import com.example.exa2509lp.R;

import java.io.Serializable;
import java.util.List;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.ViewHolder> {

private List<Libro> biblioteca;
private Context context;
private LayoutInflater li;
private Libro libro;

    public LibroAdapter(List<Libro> biblioteca, Context context, LayoutInflater li) {
        this.biblioteca = biblioteca;
        this.context = context;
        this.li = li;
        this.libro = libro;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view = li.inflate(R.layout.item_libro, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String a= biblioteca.get(position).getAutor();
        String t= biblioteca.get(position).getTitulo();
        libro = biblioteca.get(position);
        holder.tvautorlibro.setText(a);
        holder.tvtitulolibro.setText(t);

    }


    public int getItemCount(){
    return biblioteca.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvautorlibro;
        private TextView tvtitulolibro;
        private GalleryFragment gf;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvautorlibro =itemView.findViewById(R.id.tvautorlibro);
            tvtitulolibro =itemView.findViewById(R.id.tvtitulolibro);

            //itemView.setOnClickListener();


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                 Log.d("salida", "click sobre la pantalla.");



                    Intent intent = new Intent(context, DetalleA.class);
                    intent.putExtra("editorial",libro.getEditorial());
                    intent.putExtra("ano",""+libro.getAno());

                    context.startActivity(intent);




                }


                    //voy por acá...


            });








        }
    }
}





