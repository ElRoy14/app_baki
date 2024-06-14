package com.appsmoviles.tarea5movil_app_tematica.ui.contratame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentContratameBinding
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentMividaBinding
import org.w3c.dom.Text

class ContratameFragment : Fragment() {

    private var _binding: FragmentContratameBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentContratameBinding.inflate(inflater, container, false)
        val root : View = binding.root

        var textView : TextView = binding.textContratame
        textView.text = "Contratame Baki App"
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}