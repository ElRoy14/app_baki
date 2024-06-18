package com.appsmoviles.tarea5movil_app_tematica.ui.personajes

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.transition.TransitionInflater
import com.appsmoviles.tarea5movil_app_tematica.R
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentPersonajesBinding

class PersonajesFragment : Fragment() {

    private var _binding: FragmentPersonajesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPersonajesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val myShader: Shader = LinearGradient(
            0f, 50f, 0f, 100f,
            Color.WHITE, Color.parseColor("#bc131f"),
            Shader.TileMode.CLAMP
        )

        binding.textPersonajes.text = "Personajes"
        binding.textPersonajes.paint.setShader(myShader)

        binding.personaje1.setOnClickListener{
            childFragmentManager.commit {
                setCustomAnimations(
                    R.anim.slide_in,
                    R.anim.fade_out,
                    R.anim.fade_in,
                    R.anim.slide_out
                )
                replace(R.id.fragment_personajes, personaje1Fragment())
                addToBackStack(null)
            }
        }
        binding.personaje2.setOnClickListener{
            childFragmentManager.commit {
                setCustomAnimations(
                    R.anim.slide_in,
                    R.anim.fade_out,
                    R.anim.fade_in,
                    R.anim.slide_out
                )
                replace(R.id.fragment_personajes, personaje2Fragment())
                addToBackStack(null)
            }
        }
        binding.personaje3.setOnClickListener{
            childFragmentManager.commit {
                setCustomAnimations(
                    R.anim.slide_in,
                    R.anim.fade_out,
                    R.anim.fade_in,
                    R.anim.slide_out
                )
                replace(R.id.fragment_personajes, personajes3Fragment())
                addToBackStack(null)
            }
        }
        binding.personaje4.setOnClickListener{
            childFragmentManager.commit {
                setCustomAnimations(
                    R.anim.slide_in,
                    R.anim.fade_out,
                    R.anim.fade_in,
                    R.anim.slide_out
                )
                replace(R.id.fragment_personajes, personaje4Fragment())
                addToBackStack(null)
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}