package com.appsmoviles.tarea5movil_app_tematica.ui.momentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.appsmoviles.tarea5movil_app_tematica.R
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentMomento1Binding
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentPersonaje1Binding
import com.appsmoviles.tarea5movil_app_tematica.ui.personajes.PersonajesFragment

private var _binding: FragmentMomento1Binding? = null

// This property is only valid between onCreateView and
// onDestroyView.
private val binding get() = _binding!!

class momento1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMomento1Binding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.btnSalida.setOnClickListener{
            childFragmentManager.commit {
                setCustomAnimations(
                    R.anim.slide_in,
                    R.anim.fade_out,
                    R.anim.fade_in,
                    R.anim.slide_out
                )
                replace(R.id.fragment_momento1, MomentosFragment())
            }
        }

        return root
    }

}