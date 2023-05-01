package com.example.appfavas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.appfavas.databinding.FragmentVentasBinding
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class VentasFragment : Fragment() , NavigationView.OnNavigationItemSelectedListener{
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toggle : ActionBarDrawerToggle
    private lateinit var binding: FragmentVentasBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ventas, container, false)
        drawerLayout = view.findViewById(R.id.drawer_layout)
        val toolbar = view.findViewById<MaterialToolbar>(R.id.toolbar)

        toolbar.navigationIcon = ContextCompat.getDrawable(requireContext(), R.drawable.ic_menu)
        // Aquí se agrega la lógica para abrir el DrawerLayout
        toggle = ActionBarDrawerToggle(requireActivity(),drawerLayout,toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navView = view.findViewById<NavigationView>(R.id.nav_view)
        navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.Ventas -> {
                findNavController().navigate(R.id.PantallaVentas)
                return true
            }
            R.id.Recibos -> {
                findNavController().navigate(R.id.PantallaPagos)
                return true
            }
            R.id.Articulos -> {
                return true
            }
            R.id.Cocina -> {
                return true
            }
            R.id.Configuracion -> {
                findNavController().navigate(R.id.PantallaRegistrarse)
                return true
            }
            R.id.Cierre -> {
                return true
            }
            R.id.Pagos -> {
                return true
            }
            else -> return false
        }
    }

}

