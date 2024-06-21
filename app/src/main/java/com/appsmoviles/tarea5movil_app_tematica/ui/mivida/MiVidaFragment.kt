package com.appsmoviles.tarea5movil_app_tematica.ui.mivida

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentAcercadeBinding
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentMividaBinding
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentMomentosBinding

class MiVidaFragment : Fragment() {

    private var _binding: FragmentMividaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMividaBinding.inflate(inflater, container, false)
        val root : View = binding.root

        
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}