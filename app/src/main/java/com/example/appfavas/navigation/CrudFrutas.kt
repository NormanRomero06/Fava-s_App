package com.example.appfavas.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.appfavas.R
import com.example.appfavas.databinding.FragmentCrudFrutasBinding

class CrudFrutas : Fragment() {
    private lateinit var binding: FragmentCrudFrutasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val navController = view?.findNavController()
            navController?.navigate(R.id.PantallaCrudFrutas)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCrudFrutasBinding.inflate(layoutInflater)
        iniciar()
        limpiar()
        return binding.root
    }

    fun limpiar() {
        with(binding) {
            EtNombreFruta.setText("")
            EtInventarioFruta.setText("")
            EtPrecioFruta.setText("")
            Toast.makeText(context, "Campos Limpios", Toast.LENGTH_SHORT).show()
        }
    }

    private fun iniciar(){
        binding.IvRegresar.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaFrutas)
        }
        binding.TvGuardar.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaFrutas)
        }
    }

}