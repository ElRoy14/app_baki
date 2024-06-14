package com.appsmoviles.tarea5movil_app_tematica.ui.portada

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentPortadaBinding

class PortadaFragment : Fragment() {

    private var _binding: FragmentPortadaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPortadaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPortada
        textView.text = "Portada Baki App"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}