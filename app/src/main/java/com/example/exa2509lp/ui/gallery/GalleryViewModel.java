package com.example.exa2509lp.ui.gallery;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class GalleryViewModel extends AndroidViewModel {

    private  MutableLiveData<List<Libro>> mText;
    //private List<Libro> biblioteca = new ArrayList<>();
    private Context context;


    public GalleryViewModel(@NonNull Application application) {
        super(application);
        this.context = getApplication().getApplicationContext();

    }

    public LiveData<List<Libro>> getmText()
    {
        if (mText == null) {
            mText= new MutableLiveData<>();

        }
        return mText;
    }
    public void cargarBiblioteca(){
     List<Libro> biblioteca = new ArrayList<>();
        biblioteca.add(new Libro("LA VUELTA AL MUNDO EN 80 DIAS", "JULIO VERNE", "Kapelus", 1873));
        biblioteca.add(new Libro("VIAJE AL CENTRO DE LA TIERRA", "JULIO VERNE", "Astrea", 1864));
        mText.setValue(biblioteca);
    Log.d("salida","entra totaL"+biblioteca.size());
    }



}