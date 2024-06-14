package com.appsmoviles.tarea5movil_app_tematica.ui.momentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentMomentosBinding

class MomentosFragment : Fragment() {

    private var _binding: FragmentMomentosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMomentosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMomentos
        textView.text = "Momentos Baki App"
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}