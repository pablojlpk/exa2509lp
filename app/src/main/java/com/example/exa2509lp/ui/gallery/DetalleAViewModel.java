package com.example.exa2509lp.ui.gallery;

import static android.content.Intent.getIntent;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class DetalleAViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData <String> mText;


    public DetalleAViewModel(@NonNull Application application) {
        super(application);
        context =application.getApplicationContext();

        Intent recibir= getIntent();
String anio= ""+recibir.getStringExtra("anio");
String editorial = recibir.getStringExtra("editorial");
mText.setValue(anio);
    }
    public LiveData<String> getText(){
        if (mText == null) {
            mText = new MutableLiveData<>();
        }
        return mText;
    }



}
