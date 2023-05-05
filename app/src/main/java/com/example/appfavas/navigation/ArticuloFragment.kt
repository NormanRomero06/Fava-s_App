package com.example.appfavas.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.appfavas.R
import com.example.appfavas.databinding.FragmentArticuloBinding
import com.example.appfavas.databinding.FragmentLoginBinding

class ArticuloFragment : Fragment() {
    private lateinit var binding: FragmentArticuloBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val navController = view?.findNavController()
            navController?.navigate(R.id.PantallaMenuArticulos)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentArticuloBinding.inflate(layoutInflater)
        iniciar()
        return binding.root
    }

    private fun iniciar(){
        binding.btnArticuloMenu.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaArticuloMenu)
        }
        binding.btnControlFrutas.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaFrutas)
        }
    }

}