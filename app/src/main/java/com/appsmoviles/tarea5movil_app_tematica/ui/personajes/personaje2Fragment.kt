package com.appsmoviles.tarea5movil_app_tematica.ui.personajes

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.appsmoviles.tarea5movil_app_tematica.R
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentPersonaje2Binding
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentPersonajes3Binding

class personaje2Fragment : Fragment() {

    private var _binding: FragmentPersonaje2Binding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPersonaje2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val myShader: Shader = LinearGradient(
            0f, 35f, 0f, 55f,
            Color.WHITE, Color.parseColor("#bc131f"),
            Shader.TileMode.CLAMP
        )

        binding.textPersonaje2.text = "YUJIRO HANMA"
        binding.textPersonaje2.paint.setShader(myShader)

        binding.btnSalida.setOnClickListener{
            childFragmentManager.commit {
                setCustomAnimations(
                    R.anim.slide_in,
                    R.anim.fade_out,
                    R.anim.fade_in,
                    R.anim.slide_out
                )
                replace(R.id.fragment_personaje1, PersonajesFragment())
            }
        }

        // Inflate the layout for this fragment
        return root
    }

}