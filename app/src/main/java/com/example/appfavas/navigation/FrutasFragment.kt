package com.example.appfavas.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.appfavas.R
import com.example.appfavas.databinding.FragmentFrutasBinding

class FrutasFragment : Fragment() {
    private lateinit var binding: FragmentFrutasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val navController = view?.findNavController()
            navController?.navigate(R.id.PantallaFrutas)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFrutasBinding.inflate(layoutInflater)
        iniciar()
        return binding.root
    }

    private fun iniciar(){
        binding.IvRegresar.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaMenuArticulos)
        }
        binding.btnNuevoArticulo.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaAgregarFrutas)
        }
    }


}