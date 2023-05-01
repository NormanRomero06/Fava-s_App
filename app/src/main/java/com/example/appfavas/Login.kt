package com.example.appfavas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.appfavas.databinding.FragmentLoginBinding


class Login : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val navController = view?.findNavController()
            navController?.navigate(R.id.PantallaLogin)


        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        iniciar()
        return binding.root
    }

    private fun iniciar() {
        binding.btnLogin.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaVentas)
        }
        /*binding.btnLogin.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.PantallaVentas)
        }*/

    }

}