package com.example.appfavas.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.appfavas.R
import com.example.appfavas.databinding.FragmentMetodoPagoBinding

class MetodoPagoFragment : Fragment() {
    private lateinit var binding: FragmentMetodoPagoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMetodoPagoBinding.inflate(layoutInflater)
        iniciar()
        return binding.root
    }

    private fun iniciar() {
        binding.btnTarjeta.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaPagoTarjeta)
        }
        binding.btnEfectivo.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaTotalCambio)
        }
        binding.btnDLares.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaTotalCambio)
        }
        binding.TvDividir.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaDividirPago)
        }

    }

}