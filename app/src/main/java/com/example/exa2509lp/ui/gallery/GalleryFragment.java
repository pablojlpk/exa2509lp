package com.example.exa2509lp.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exa2509lp.R;
import com.example.exa2509lp.databinding.FragmentGalleryBinding;

import java.util.List;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        galleryViewModel.getmText().observe(getViewLifecycleOwner(), new Observer<List<Libro>>() {
            @Override
            public void onChanged(List<Libro> libros) {
                RecyclerView rv = root.findViewById(R.id.rvbiblioteca);
                GridLayoutManager glm= new GridLayoutManager(getContext(),1,GridLayoutManager.VERTICAL,false);
                rv.setLayoutManager(glm);
                LibroAdapter iad=new LibroAdapter(libros,getContext(),getLayoutInflater());
                rv.setAdapter(iad);


            }
        });

galleryViewModel.cargarBiblioteca();

        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void verDetalle(){
        Bundle bundle=new Bundle();
        bundle.putSerializable("casa", "casa");
        Navigation.findNavController(binding.getRoot()).navigate(R.id.nav_detalle);
    };
}