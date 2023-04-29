package com.example.appfavas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.appfavas.databinding.FragmentRegistrarseBinding

class Registrarse : Fragment() {
    private lateinit var binding: FragmentRegistrarseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val navController = view?.findNavController()
            navController?.navigate(R.id.PantallaRegistrarse)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegistrarseBinding.inflate(layoutInflater)
        iniciar()
        return binding.root
    }

    private fun iniciar(){
        binding.btnLogRegister.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaLogin)
        }
        binding.btnRegistrarse.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaLogin)
        }
    }

}