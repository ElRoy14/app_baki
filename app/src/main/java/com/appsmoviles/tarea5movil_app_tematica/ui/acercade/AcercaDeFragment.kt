package com.appsmoviles.tarea5movil_app_tematica.ui.acercade

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.ktx.R
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentAcercadeBinding
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentHomeBinding
import com.appsmoviles.tarea5movil_app_tematica.ui.home.HomeViewModel

class AcercaDeFragment : Fragment() {

    private var _binding: FragmentAcercadeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root = inflater.inflate(com.appsmoviles.tarea5movil_app_tematica.R.layout.fragment_acercade, container, false)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}