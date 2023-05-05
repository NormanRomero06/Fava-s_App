package com.example.appfavas.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.appfavas.R
import com.example.appfavas.databinding.FragmentCrearArticuloMenuBinding

class CrearArticuloMenu : Fragment() {
    private lateinit var binding: FragmentCrearArticuloMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val navController = view?.findNavController()
            navController?.navigate(R.id.PantallaCrearArticuloMenu)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCrearArticuloMenuBinding.inflate(layoutInflater)
        iniciar()
        return binding.root

    }

    private fun iniciar(){
        binding.IvRegresar.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaArticuloMenu)
        }
        binding.tvGuardar.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaArticuloMenu)
        }
        binding.btnCrearBatido.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaCrearBatido)
        }
    }

}