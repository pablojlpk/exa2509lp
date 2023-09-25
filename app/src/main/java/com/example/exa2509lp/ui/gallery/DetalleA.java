package com.example.exa2509lp.ui.gallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.exa2509lp.R;
import com.example.exa2509lp.databinding.ActivityDetalleBinding;
import com.example.exa2509lp.databinding.FragmentHomeBinding;

public class DetalleA extends AppCompatActivity {

    private ActivityDetalleBinding binding;
    private DetalleAViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(DetalleAViewModel.class);

        binding= ActivityDetalleBinding.inflate(getLayoutInflater());
        vm.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.tvano.setText(s);
            }
        });







    }
}