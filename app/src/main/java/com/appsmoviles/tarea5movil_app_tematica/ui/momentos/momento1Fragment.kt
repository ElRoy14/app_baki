package com.appsmoviles.tarea5movil_app_tematica.ui.momentos

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
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

        CargarVideo()

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

    @SuppressLint("SetJavaScriptEnabled")
    private fun CargarVideo(){

        val webView: WebView = binding.VideoMomento1

        val video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Aw0HQh6llXw?si=56HSVSLe38N-X3Cs\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"

        webView.loadData(video, "text/html", "utf-8")

        webView.settings.javaScriptEnabled = true

        webView.webChromeClient = WebChromeClient()

    }

}