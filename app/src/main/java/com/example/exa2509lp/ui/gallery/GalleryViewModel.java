package com.example.exa2509lp.ui.gallery;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class GalleryViewModel extends AndroidViewModel {

    private  MutableLiveData<List<Libro> mText;
    private List<Libro> biblioteca = new ArrayList<>();
    private Context context;


    public GalleryViewModel(@NonNull Application application) {
        super(application);
        this.context = context;
        cargarBiblioteca();
    }

    public LiveData<List<Libro>> getText()
    {
        if (mText == null) {
            mText= new MutableLiveData<>();

        }
        return mText;
    }
    public void cargarBiblioteca(){
        biblioteca.add(new Libro("LA VUELTA AL MUNDO EN 80 DIAS", "JULIO VERNE", "Kapelus", 1873));
        biblioteca.add(new Libro("VIAJE AL CENTRO DE LA TIERRA", "JULIO VERNE", "Astrea", 1864));
    }


}