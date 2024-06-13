package com.appsmoviles.tarea5movil_app_tematica.ui.contratame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentMividaBinding

class ContratameFragment : Fragment() {

    private var _binding: FragmentMividaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root = inflater.inflate(com.appsmoviles.tarea5movil_app_tematica.R.layout.fragment_mivida, container, false)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}