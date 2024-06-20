package com.appsmoviles.tarea5movil_app_tematica.ui.acercade

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentAcercadeBinding

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

        _binding = FragmentAcercadeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val myShader: Shader = LinearGradient(
            0f, 35f, 0f, 55f,
            Color.WHITE, Color.parseColor("#bc131f"),
            Shader.TileMode.CLAMP
        )


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}