package com.example.appfavas.navigation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.findNavController
import com.example.appfavas.R
import com.example.appfavas.databinding.FragmentVentasBinding

class VentasFragment : Fragment() {
    private lateinit var binding: FragmentVentasBinding
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVentasBinding.inflate(inflater, container, false)
        drawerLayout = binding.drawerLayout

        binding.drawerLayout.setOnClickListener {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }

        binding.navView.setNavigationItemSelectedListener { menuItem ->
            val navController = findNavController()
            when (menuItem.itemId) {
                R.id.Ventas -> {
                    navController.navigate(R.id.PantallaVentas)
                    true
                }
                R.id.Recibos -> {
                    navController.navigate(R.id.PantallaRecibos)
                    true
                }
                R.id.Articulos -> {
                    navController.navigate(R.id.PantallaArticuloMenu)
                    true
                }
                else -> false
            }.also {
                drawerLayout.closeDrawer(GravityCompat.START)
            }

        }

        return binding.root

    }

}




